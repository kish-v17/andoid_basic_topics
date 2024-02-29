package com.example.all_in_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebViewClient;

import com.example.all_in_1.databinding.ActivityWebViewBinding;

public class webView extends AppCompatActivity {
    ActivityWebViewBinding b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b=ActivityWebViewBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());

        b.url.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                b.web.loadUrl("https://www.google.com/search?q="+b.url.getText().toString());
                b.web.setWebViewClient(new WebViewClient());
                b.web.getSettings().setJavaScriptEnabled(true);
            }
        });
    }

    @Override
    public void onBackPressed() {
        if(b.web.canGoBack()){
            b.web.goBack();
        }else{
            super.onBackPressed();
        }
    }
}