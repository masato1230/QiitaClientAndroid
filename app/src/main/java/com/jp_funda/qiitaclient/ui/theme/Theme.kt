package com.jp_funda.qiitaclient.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = Purple200,
    primaryVariant = QiitaGreen,
    secondary = Teal200
)

private val LightColorPalette = lightColors(
    primary = Purple500,
    primaryVariant = QiitaGreen,
    secondary = Teal200
)

@Composable
fun QiitaClientTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    MaterialTheme(
        colors = DarkColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}