package com.lhsdevteam.foodpantry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Browser : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_browser)
        val browser: WebView = findViewById(R.id.browser)
        browser.settings.javaScriptEnabled = true
        browser.loadUrl("https://www.google.com")
    }
}
