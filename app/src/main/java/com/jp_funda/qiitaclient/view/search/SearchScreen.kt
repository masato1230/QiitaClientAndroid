package com.jp_funda.qiitaclient.view.search

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.text.input.TextFieldValue
import androidx.navigation.NavController
import com.jp_funda.qiitaclient.view.component.SearchView

@Composable
fun SearchScreen(navController: NavController) {
    Scaffold {
        Column {
            val textFieldState = remember { mutableStateOf(TextFieldValue("")) }
            SearchView(textFieldState = textFieldState) {
                // TODO 検索バーに入力された文字でQiitaのAPIを叩く
            }
            Text(text = "検索画面")
            Button(onClick = { navController.navigate("detail") }) {
                Text(text = "詳細画面へ")
            }
        }
    }
}