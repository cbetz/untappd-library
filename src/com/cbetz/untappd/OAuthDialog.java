package com.cbetz.untappd;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class OAuthDialog extends Dialog {
	static final float[] DIMENSIONS_LANDSCAPE = {460, 260};
    static final float[] DIMENSIONS_PORTRAIT = {280, 420};
	static final FrameLayout.LayoutParams FILL = new FrameLayout.LayoutParams(
			ViewGroup.LayoutParams.FILL_PARENT,
			ViewGroup.LayoutParams.FILL_PARENT);
	
	private WebView mWebView;
	private String mAuthUrl;
	private String mCallbackUrl;
	private LinearLayout mContent;
	private ProgressDialog mSpinner;
	private OAuthDialogListener mListener;
	
	public OAuthDialog(Context context, String authUrl, String callbackUrl, OAuthDialogListener listener) {
		super(context);
		mAuthUrl = authUrl;
		mCallbackUrl = callbackUrl;
		setListener(listener);
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		mSpinner = new ProgressDialog(getContext());      
        mSpinner.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mSpinner.setMessage("Loading...");
		
		mContent = new LinearLayout(getContext());
        mContent.setOrientation(LinearLayout.VERTICAL);
        
        buildUi();
        
        Display display 	= getWindow().getWindowManager().getDefaultDisplay();
        final float scale 	= getContext().getResources().getDisplayMetrics().density;
        float[] dimensions 	= (display.getWidth() < display.getHeight()) ? DIMENSIONS_PORTRAIT : DIMENSIONS_LANDSCAPE;
        
        addContentView(mContent, new FrameLayout.LayoutParams((int) (dimensions[0] * scale + 0.5f),
        							(int) (dimensions[1] * scale + 0.5f)));
	}



	@SuppressLint("SetJavaScriptEnabled")
	private void buildUi() {
		mWebView = new WebView(getContext());
		mWebView.setVerticalScrollBarEnabled(false);
		mWebView.setHorizontalScrollBarEnabled(false);
		mWebView.setWebViewClient(new OAuthDialog.OAuthWebViewClient());
		mWebView.getSettings().setJavaScriptEnabled(true);
		mWebView.loadUrl(mAuthUrl);
		mWebView.setLayoutParams(FILL);
		mContent.addView(mWebView);
	}
	
	private class OAuthWebViewClient extends WebViewClient {
		@Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
        	Log.d("OAuthWebViewClient.shouldOverrideUrlLoading", "Redirecting URL " + url);

        	if (url.startsWith(mCallbackUrl)) {
        		String urls[] = url.split("=");

        		mListener.onComplete(urls[1]);

        		OAuthDialog.this.dismiss();

        		return true;	        		
        	} 

        	return false;
        }

        @Override
        public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        	Log.d("OAuthWebViewClient.onReceivedError", "Page error: " + description);

            super.onReceivedError(view, errorCode, description, failingUrl);

            mListener.onError(description);

            OAuthDialog.this.dismiss();
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            Log.d("OAuthWebViewClient.onPageStarted", "Loading URL: " + url);
            super.onPageStarted(view, url, favicon);
            mSpinner.show();
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            String title = mWebView.getTitle();
            if (title != null && title.length() > 0) {
                // TODO: mTitle.setText(title);
            }
            mSpinner.dismiss();
        }
	}
	
	public interface OAuthDialogListener {
		public abstract void onComplete(String accessToken);
		public abstract void onError(String error);
	}
	
	
	public WebView getWebview() {
		return mWebView;
	}

	public void setWebview(WebView webview) {
		this.mWebView = webview;
	}

	public String getUrl() {
		return mAuthUrl;
	}

	public void setUrl(String url) {
		this.mAuthUrl = url;
	}

	public OAuthDialogListener getListener() {
		return mListener;
	}

	public void setListener(OAuthDialogListener listener) {
		this.mListener = listener;
	}

}
