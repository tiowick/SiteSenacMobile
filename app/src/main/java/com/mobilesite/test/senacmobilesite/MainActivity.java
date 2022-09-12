package com.mobilesite.test.senacmobilesite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View decorView = getWindow().getDecorView();
        int uiOption = View.SYSTEM_UI_FLAG_FULLSCREEN;

        decorView.setSystemUiVisibility(uiOption);
        getSupportActionBar().hide();

        WebView web = (WebView) findViewById(R.id.siteSenac);
        web.setWebViewClient(new WebViewClient());
        web.getSettings().setJavaScriptEnabled(true);
        web.getSettings().setDomStorageEnabled(true);
        //web.loadUrl("https://www.emulatorgames.net/roms/playstation-portable/");
        web.loadUrl("https://www.ead.senac.br/?gclid=Cj0KCQjwl92XBhC7ARIsAHLl9akKkFCsy1Il8rCAhLNikHzJhixL7NGvHCjbjjH_3ZViDZ41NSJ4F0waAvUDEALw_wcB\n");

    }
}