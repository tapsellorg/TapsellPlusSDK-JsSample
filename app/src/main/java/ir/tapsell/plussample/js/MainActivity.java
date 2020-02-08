package ir.tapsell.plussample.js;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

import ir.tapsell.plus.TapsellPlus;
import ir.tapsell.plus.TapsellPlusJS;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        String bannerUrl = "http://192.168.1.186";

        TapsellPlus.initialize(this, "alsoatsrtrotpqacegkehkaiieckldhrgsbspqtgqnbrrfccrtbdomgjtahflchkqtqosa");

        WebView mWebView = new WebView(this);
        mWebView.loadUrl(bannerUrl);

        mWebView.getSettings().setJavaScriptEnabled(true);

        new TapsellPlusJS(this, mWebView);

        mWebView.setWebChromeClient(new WebChromeClient());
        mWebView.setWebViewClient(new WebViewClient());

        FrameLayout frameLayout = findViewById(R.id.fffff);

        frameLayout.addView(mWebView);

    }
}
