package com.example.defeatcovid;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;

public class WebPortals extends AppCompatActivity {

    private WebView webView;
    private static final String TAG = "WebPortals";
    private ProgressDialog progressBar;
    private AlertDialog alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_portals);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        webView = (WebView) findViewById(R.id.webPortal);

        WebSettings websettings =  webView.getSettings();
        websettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setUserAgentString("Android");



       alertDialog = new AlertDialog.Builder(this).create();

        progressBar = ProgressDialog.show(WebPortals.this, "Please wait", "Loading...");
        progressBar.setCancelable(true);

        webView.setWebViewClient(new WebViewClient() {
                                     public boolean shouldOverrideUrlLoading(WebView view, String url) {
                                         Log.i(TAG, "Processing webview url click...");
                                         view.loadUrl(url);
                                         return true;
                                     }

                                     public void onPageFinished(WebView view, String url) {
                                         Log.i(TAG, "Finished loading URL: " + url);
                                         if (progressBar.isShowing()) {
                                             progressBar.dismiss();
                                         }
                                     }

                                 });

            Bundle bundle = getIntent().getExtras();
            int s = bundle.getInt("news portal");

       if(s == 1)
        {
            webView.loadUrl("https://www.prothomalo.com/");
            setTitle("প্রথম আলো");
        }
       else if(s== 2)
       {
           webView.loadUrl("http://www.ittefaq.com.bd/");
           setTitle("ইত্তেফাক");
       }

       else if(s== 3)
       {
           webView.loadUrl("http://www.dainikamadershomoy.com/");
           setTitle("আমাদের সময়");
       }
       else if(s== 4)
       {
           webView.loadUrl("https://samakal.com/");
           setTitle("সমকাল");
       }
       else if(s== 5)
       {
           webView.loadUrl("https://amar-desh24.com/bangla/");
           setTitle("আমার দেশ");
       }
       else if(s== 6)
       {
           webView.loadUrl("https://www.dailynayadiganta.com/");
           setTitle("নয়াদিগন্ত");
       }
       else if(s== 7)
       {
           webView.loadUrl("https://www.bd-pratidin.com/");
           setTitle("বাংলাদেশ প্রতিদিন");
       }
       else if(s== 8)
       {
           webView.loadUrl("https://www.dailyinqilab.com/");
           setTitle("ইনকিলাব ");
       }
       else if(s== 9)
       {
           webView.loadUrl("https://www.dailyjanakantha.com/");
           setTitle("জনকণ্ঠ");
       }
       else if(s== 10)
       {
           webView.loadUrl("http://shokalerkhobor24.com/");
           setTitle("সকালের খবর ");
       }
       else if(s== 20)
       {
           webView.loadUrl("https://news.google.com/covid19/map?hl=bn&gl=BD&ceid=BD:bn");
           setTitle("বিশ্ব পরিস্থিতি");
       }
       else if(s== 21)
       {
           webView.loadUrl("https://iedcr.gov.bd/website/");
           setTitle("IEDCR");
       }
       else if(s== 22)
       {
           webView.loadUrl("https://corona.gov.bd/");
           setTitle("Corona BD");
       }
       else if(s== 23)
       {
           webView.loadUrl("https://www.who.int/emergencies/diseases/novel-coronavirus-2019?gclid=EAIaIQobChMIncb6kcWE6gIVyX4rCh0yBwEnEAAYASAAEgJcCPD_BwE");
           setTitle("WHO");
       }
       else if(s== 24)
       {
           webView.loadUrl("https://dghs.gov.bd/index.php/bd/");
           setTitle("Health Ministry");
       }
       else if(s== 25)
       {
           webView.loadUrl("http://hhh.pqsnetwork.com/doctors");
           setTitle("Telemedicine");
       }
       else if(s==26)
       {
           webView.loadUrl("https://www.unicef.org/bangladesh/%E0%A6%95%E0%A6%B0%E0%A7%8B%E0%A6%A8%E0%A6%BE%E0%A6%AD%E0%A6%BE%E0%A6%87%E0%A6%B0%E0%A6%BE%E0%A6%B8-%E0%A6%B0%E0%A7%8B%E0%A6%97-%E0%A6%95%E0%A7%8B%E0%A6%AD%E0%A6%BF%E0%A6%A1-%E0%A7%A7%E0%A7%AF-%E0%A6%85%E0%A6%AD%E0%A6%BF%E0%A6%AD%E0%A6%BE%E0%A6%AC%E0%A6%95%E0%A6%A6%E0%A7%87%E0%A6%B0-%E0%A6%95%E0%A7%80-%E0%A6%9C%E0%A6%BE%E0%A6%A8%E0%A6%BE-%E0%A6%89%E0%A6%9A%E0%A6%BF%E0%A6%A4");
           setTitle("Unicef");
       }
       else if(s== 30)
       {
           webView.loadUrl("https://unb.com.bd/bangla/category/%E0%A6%B2%E0%A6%BE%E0%A6%87%E0%A6%AB%E0%A6%B8%E0%A7%8D%E0%A6%9F%E0%A6%BE%E0%A6%87%E0%A6%B2/%E0%A6%95%E0%A6%B0%E0%A7%8B%E0%A6%A8%E0%A6%BE%E0%A6%AD%E0%A6%BE%E0%A6%87%E0%A6%B0%E0%A6%BE%E0%A6%B8-%E0%A6%A8%E0%A6%BF%E0%A7%9F%E0%A7%87-%E0%A6%AF%E0%A6%A4-%E0%A6%AD%E0%A7%81%E0%A6%B2-%E0%A6%A7%E0%A6%BE%E0%A6%B0%E0%A6%A3%E0%A6%BE/22546");
           setTitle("করোনা নিয়ে ভুল ধারণা");
       }

    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        if(item.getItemId()== android.R.id.home)
        {
            Intent intent = new Intent(WebPortals.this, OthersService.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            switch (keyCode) {
                case KeyEvent.KEYCODE_BACK:
                    if (webView.canGoBack()) {
                        webView.goBack();
                    } else {
                        finish();
                    }
                    return true;
            }

        }
        return super.onKeyDown(keyCode, event);
    }

}