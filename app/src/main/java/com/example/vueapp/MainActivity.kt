package com.example.vueapp

import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.vueapp.ui.theme.VueAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var mWebview = WebView(this);

        val webSettings: WebSettings = mWebview.settings
        webSettings.javaScriptEnabled = true

        mWebview.loadUrl("https://gui-rossi.github.io/");
        setContentView(mWebview);
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Hello $name!",
            modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    VueAppTheme {
        Greeting("Android")
    }
}