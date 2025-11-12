package com.example.new_playlist_maker.presentation.ui.component

import androidx.annotation.StringRes
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.new_playlist_maker.R
import com.example.new_playlist_maker.presentation.ui.theme.MediaTheme
import com.example.new_playlist_maker.presentation.ui.theme.NewPlaylistMakerTheme

@Composable
fun SettingsItem(
    onClick: () -> Unit,
    @StringRes text: Int,
    content: @Composable (() -> Unit)? = null
) {
    Row(
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .clickable(onClick = onClick)
            .padding(horizontal = 16.dp)
    ) {
        Text(
            text = stringResource(id = text),
            style = MediaTheme.typography.textRegularSettings,
            color = MediaTheme.color.textSettings,
            modifier = Modifier
                .weight(1f)
        )

        content?.invoke()
    }
}

@Preview(showBackground = true)
@Composable
fun SettingsItemPreview() {
    NewPlaylistMakerTheme {
        SettingsItem(
            onClick = { },
            text = R.string.title_settings
        ) { }
    }
}