package com.bekalbu.app

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColors = darkColorScheme(
    primary = Color(0xFF9CCC65),
    secondary = Color(0xFF81C784),
    tertiary = Color(0xFF64B5F6)
)

private val LightColors = lightColorScheme(
    primary = Color(0xFF4CAF50),
    secondary = Color(0xFF66BB6A),
    tertiary = Color(0xFF42A5F5)
)

@Composable
fun BekalBuTheme(content: @Composable () -> Unit) {
    val colors = if (androidx.compose.foundation.isSystemInDarkTheme()) {
        DarkColors
    } else {
        LightColors
    }

    MaterialTheme(
        colorScheme = colors,
        content = content
    )
}
