package com.jp_funda.qiitaclient.view.search

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.text.input.TextFieldValue
import androidx.navigation.NavController
import com.jp_funda.qiitaclient.view.component.SearchView

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SearchScreen(navController: NavController) {
    Scaffold {
        Column {
            val textFieldState = remember { mutableStateOf(TextFieldValue("")) }
            SearchView(textFieldState = textFieldState) {
                // TODO 検索バーに入力された文字でQiitaのAPIを叩く
            }
            LazyColumn {
                items(50) {
                    SearchResultCell()
                }
            }
        }
    }
}