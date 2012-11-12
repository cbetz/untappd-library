package com.cbetz.untappd;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class UntappdOAuthActivity extends Activity {
	private static final String TAG = "UntappdOAuthActivity";

    @SuppressLint("SetJavaScriptEnabled")
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_untappd_oauth);
        
        Bundle extras = getIntent().getExtras();
    	String clientId = extras.getString("clientId");
    	String redirectUrl = extras.getString("redirectUrl");

        String url =
            "http://untappd.com/oauth/authenticate" + 
                "?client_id=" + clientId + 
                "&response_type=token" + 
                "&redirect_url=" + redirectUrl;
        
        // "After the user has logged in we will redirect back to the following address: 
       	//  http://REDIRECT_URL#access_token=TOKENHERE"
        WebView webview = (WebView)findViewById(R.id.webView);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.setWebViewClient(new WebViewClient() {
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                String fragment = "#access_token=";
                int start = url.indexOf(fragment);
                if (start > -1) {
                    String accessToken = url.substring(start + fragment.length(), url.length());
        			
                    Log.v(TAG, "Token: " + accessToken);
                	
                    Intent returnIntent = new Intent();
                    returnIntent.putExtra("accessToken", accessToken);
                    setResult(RESULT_OK, returnIntent);     
                    finish();
                }
            }
        });
        webview.loadUrl(url);
    }
}
