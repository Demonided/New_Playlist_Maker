package com.example.new_playlist_maker.presentation.ui.theme

import androidx.compose.ui.graphics.Color

val LightMediaColor = MediaColor(
    titleTextHome = Color(0xFFFFFFFF),
    titleTextSetting = Color(0xFF1A1B22),
    backgroundHome = Color(0xFF3772E7),
    backgroundSetting = Color(0xFFFFFFFF),
    backgroundButtonHome = Color(0xFFFFFFFF),
    textOnButtonHome = Color(0xFF1A1B22),
    textSettings = Color(0xFF000000),

    checkedThumbColor = Color(0xFF00D6C3),
    checkedTrackColor = Color(0xFF76EAE0),
    uncheckedThumbColor = Color(0xFFAEAFB4),
    uncheckedTrackColor = Color(0xFFAEAFB4).copy(alpha = 0.4f),

    tintIconSetting = Color(0xFFAEAFB4),

    testColorOne = Color(0xFFB70000),
    testColorTwo = Color(0xFF001A5B)
    )

val DarkMediaColor = MediaColor(
    titleTextHome = Color(0xFFFFFFFF),
    titleTextSetting = Color(0xFFFFFFFF),

    backgroundHome = Color(0xFF1A1B22),
    backgroundSetting = Color(0xFF1A1B22),
    backgroundButtonHome = Color(0xFFFFFFFF),

    textOnButtonHome = Color(0xFF1A1B22),
    textSettings = Color(0xFFFFFFFF),

    checkedThumbColor = Color(0xFF3772E7),
    checkedTrackColor = Color(0xFF9FBBF3),
    uncheckedThumbColor = Color(0xFFAEAFB4),
    uncheckedTrackColor = Color(0xFFE6E8EB),

    tintIconSetting = Color(0xFFFFFFFF),

    testColorOne = Color(0xFFAFDEB9),
    testColorTwo = Color(0xFF9A076A)
)

data class MediaColor(
    val titleTextHome: Color,
    val titleTextSetting: Color,

    val backgroundHome: Color,
    val backgroundSetting: Color,
    val backgroundButtonHome: Color,

    val textOnButtonHome: Color,
    val textSettings: Color,

    val checkedThumbColor: Color,
    val checkedTrackColor: Color,
    val uncheckedThumbColor: Color,
    val uncheckedTrackColor: Color,

    val tintIconSetting: Color,

    val testColorOne: Color,
    val testColorTwo: Color
)