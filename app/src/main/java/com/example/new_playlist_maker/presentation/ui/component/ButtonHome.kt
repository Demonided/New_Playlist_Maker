package com.example.new_playlist_maker.presentation.ui.component

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.new_playlist_maker.R
import com.example.new_playlist_maker.presentation.ui.theme.MediaTheme
import com.example.new_playlist_maker.presentation.ui.theme.NewPlaylistMakerTheme

@Composable
fun ButtonClickHome(
    @DrawableRes iconAsset: Int,
    @StringRes text: Int,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            contentColor = MediaTheme.color.textOnButtonHome,
            containerColor = MediaTheme.color.backgroundButtonHome,
        ),
        shape = RoundedCornerShape(16.dp),
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Row {
            Icon(
                painter = painterResource(id = iconAsset),
                contentDescription = null,
            )
            Text(
                text = stringResource(id = text),
                style = MediaTheme.typography.textMedium,
                modifier = Modifier.padding(start = 8.dp)
            )
        }
    }
}

@Preview
@Composable
fun ButtonHomePreview() {
    NewPlaylistMakerTheme {
        ButtonClickHome(
            iconAsset = R.drawable.icon_search,
            text = R.string.button_click_home_search,
            modifier = Modifier.height(220.dp)
        )
    }
}