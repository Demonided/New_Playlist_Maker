package com.example.new_playlist_maker.presentation.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.new_playlist_maker.presentation.ui.theme.MediaTheme
import com.example.new_playlist_maker.presentation.ui.theme.NewPlaylistMakerTheme

@Composable
fun MediaScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text("Прости, действительно стоял приватный репозиторий",
            color = MediaTheme.color.testColorOne)
    }
}

@Preview
@Composable
fun MediaScreenPreview() {
    NewPlaylistMakerTheme {
        MediaScreen()
    }
}