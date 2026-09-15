package com.luxe.player
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.luxe.player.data.AdBlocker

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val wv = WebView(this)
    wv.settings.javaScriptEnabled = true
    wv.webViewClient = object : WebViewClient() {
      override fun shouldOverrideUrlLoading(v: WebView, u: String): Boolean {
        return if (AdBlocker.isAd(u)) true else false
      }
    }
    wv.loadUrl("https://google.com")
    setContentView(wv)
  }
}
