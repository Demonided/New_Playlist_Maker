package com.example.new_playlist_maker.presentation.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf

val LocalMediaColors = staticCompositionLocalOf { LightMediaColor }

val LocalMediaTypography = staticCompositionLocalOf {
    MediaTypography()
}

object MediaTheme {
    val color: MediaColor
        @Composable
        get() = LocalMediaColors.current

    val typography: MediaTypography
        @Composable
        get() = LocalMediaTypography.current
}

@Composable
fun NewPlaylistMakerTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val color = if (darkTheme) DarkMediaColor else LightMediaColor

    CompositionLocalProvider(
        LocalMediaTypography provides MediaTypography(),
        LocalMediaColors provides color,
        content = content
    )
}