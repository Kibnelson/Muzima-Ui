package com.muzima.prototype;


import com.example.muzimafirst.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.Menu;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
	WebView mWebView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       
        
        setContentView(R.layout.activity_main);
        mWebView = (WebView) findViewById(R.id.webview); 
        
     // Initialize the WebView

        mWebView.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
        mWebView.setScrollbarFadingEnabled(true);
        mWebView.getSettings().setLoadsImagesAutomatically(true);
        mWebView.getSettings().setPluginsEnabled(true);
        mWebView.getSettings().setBuiltInZoomControls(false); 
        mWebView.getSettings().setSupportZoom(false);
        mWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);   
        mWebView.getSettings().setAllowFileAccess(true); 
        mWebView.getSettings().setDomStorageEnabled(true);

     		// Load the URLs inside the WebView, not in the external web browser
        mWebView.setWebViewClient(new WebViewClient());
        if (savedInstanceState == null)
        { 
        	mWebView.getSettings().setJavaScriptEnabled(true); 
        	   mWebView.loadUrl("file:///android_asset/uifiles/index.html");
        	} else { mWebView.restoreState(savedInstanceState); } 
        
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && mWebView.canGoBack()) {
            mWebView.goBack();            
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
   
    private class WebClient extends WebViewClient {
    	
        
    }
    
//    @Override
//	protected void onSaveInstanceState(Bundle outState)
//	{
//		super.onSaveInstanceState(outState);
//
//		// Save the state of the WebView
//		mWebView.saveState(outState);
//	}
//
//	@Override
//	protected void onRestoreInstanceState(Bundle savedInstanceState)
//	{
//		super.onRestoreInstanceState(savedInstanceState);
//
//		// Restore the state of the WebView
//		mWebView.restoreState(savedInstanceState);
//	}
}