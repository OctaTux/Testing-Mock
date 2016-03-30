package com.example.andrea.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        String url = "http://leafswe.github.io/index.html";
        WebView webView = (WebView)findViewById(R.id.helpView);
        webView.getSettings().setDefaultFontSize(16);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);
    }
}
