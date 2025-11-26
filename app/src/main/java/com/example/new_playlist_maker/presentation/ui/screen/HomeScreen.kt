package com.example.new_playlist_maker.presentation.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.new_playlist_maker.R
import com.example.new_playlist_maker.presentation.ui.component.ButtonClickHome
import com.example.new_playlist_maker.presentation.ui.theme.MediaTheme
import com.example.new_playlist_maker.presentation.ui.theme.NewPlaylistMakerTheme

@Composable
fun HomeScreen(
    onClickSearch: () -> Unit,
    onClickMedia: () -> Unit,
    onClickSetting: () -> Unit,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(WindowInsets.systemBars.asPaddingValues())
            .background(color = MediaTheme.color.backgroundHome)
    ) {
        Text(
            text = stringResource(id = R.string.title_home),
            color = MediaTheme.color.titleTextHome,
            style = MediaTheme.typography.titleTextMedium,
            modifier = Modifier
                .fillMaxWidth()
                .height(dimensionResource(id = R.dimen.height_56))
                .padding(horizontal = dimensionResource(id = R.dimen.padding_12))
                .padding(
                    top = dimensionResource(id = R.dimen.padding_10),
                    bottom = dimensionResource(id = R.dimen.padding_20)
                )
        )

        ButtonClickHome(
            onClick = onClickSearch,
            iconAsset = R.drawable.icon_search,
            text = R.string.button_click_home_search,
            modifier = Modifier.weight(1f)
        )
        ButtonClickHome(
            onClick = onClickMedia,
            iconAsset = R.drawable.icon_mediateka,
            text = R.string.button_click_home_mediateka,
            modifier = Modifier.weight(1f)
        )
        ButtonClickHome(
            onClick = onClickSetting,
            iconAsset = R.drawable.icon_setting,
            text = R.string.button_click_home_setting,
            modifier = Modifier.weight(1f)
        )
        Spacer(modifier = Modifier.height(20.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHomeScreen() {
    NewPlaylistMakerTheme {
        HomeScreen(
            onClickSearch = {},
            onClickMedia = {},
            onClickSetting = {}
        )
    }
}