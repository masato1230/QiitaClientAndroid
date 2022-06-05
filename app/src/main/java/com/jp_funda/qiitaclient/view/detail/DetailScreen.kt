package com.jp_funda.qiitaclient.view.detail

import androidx.compose.runtime.Composable
import com.google.accompanist.web.WebView
import com.google.accompanist.web.rememberWebViewState

@Composable
fun DetailScreen(url: String) {
    val state = rememberWebViewState(url)
    WebView(state = state)
}