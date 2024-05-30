package com.example.payanythingsa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends AppCompatActivity {

    WebView appWebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appWebview = findViewById(R.id.app_webview);

        appWebview.getSettings().setJavaScriptEnabled(true);
        appWebview.getSettings().setLoadWithOverviewMode(true);
        appWebview.getSettings().setUseWideViewPort(true);
        appWebview.setWebViewClient(new WebViewClient());


        appWebview.loadUrl("http://pay.payanything.lk/mobile");

//        http://secure.quickpay.lk/mobile
    }
}
