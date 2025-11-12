package com.example.new_playlist_maker.presentation.ui.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.new_playlist_maker.R

data class MediaTypography(
    val textMedium: TextStyle = TextStyle(
        fontFamily = displayYS,
        fontWeight = FontWeight.Medium,
        fontSize = 22.sp,
        lineHeight = 22.sp,
    ),

    val textRegularSettings: TextStyle = TextStyle(
        fontFamily = displayYS,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 16.sp,
    ),

    val titleTextMedium: TextStyle = TextStyle(
        fontFamily = displayYS,
        fontWeight = FontWeight.Medium,
        fontSize = 22.sp,
        lineHeight = 22.sp,
    )
)

val displayYS = FontFamily(
    Font(R.font.yandex_sans_text_medium, FontWeight.Medium),
    Font(R.font.yandex_sans_text_regular, FontWeight.Normal),
)