package com.jp_funda.qiitaclient.view.search

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.jp_funda.qiitaclient.ui.theme.QiitaGreen
import com.jp_funda.qiitaclient.view.component.SearchView
import java.net.URLEncoder
import java.nio.charset.StandardCharsets

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SearchScreen(navController: NavController, searchViewModel: SearchViewModel = viewModel()) {

    LaunchedEffect(Unit) {
        searchViewModel.searchArticles("kotlin")
    }

    Scaffold(backgroundColor = QiitaGreen, contentColor = Color.White) {
        Column {
            val textFieldState = remember { mutableStateOf(TextFieldValue("")) }
            SearchView(textFieldState = textFieldState) {
                searchViewModel.searchArticles(it)
            }

            val observeArticles = searchViewModel.articles.observeAsState()
            observeArticles.value?.let { articles ->
                LazyColumn {
                    items(articles) { article ->
                        SearchResultCell(article) {
                            val encodedUrl = URLEncoder.encode(article.url, StandardCharsets.UTF_8.toString())
                            navController.navigate("detail/$encodedUrl")
                        }
                    }
                }
            }
        }
    }
}