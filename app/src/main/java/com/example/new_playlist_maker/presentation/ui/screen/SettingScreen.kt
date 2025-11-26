package com.example.new_playlist_maker.presentation.ui.screen

import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.new_playlist_maker.R
import com.example.new_playlist_maker.presentation.ui.component.SettingsItem
import com.example.new_playlist_maker.presentation.ui.theme.MediaTheme
import com.example.new_playlist_maker.presentation.ui.theme.NewPlaylistMakerTheme
import androidx.core.net.toUri

@Composable
fun SettingScreen(
    stateDarkTheme: Boolean,
    onThemeChange: (Boolean) -> Unit = {}
) {
    val context = LocalContext.current

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(WindowInsets.systemBars.asPaddingValues())
            .background(color = MediaTheme.color.backgroundSetting)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = dimensionResource(id = R.dimen.padding_24))
        ) {
            Icon(
                painter = painterResource(id = R.drawable.icon_back),
                contentDescription = null,
                modifier = Modifier
                    .padding(dimensionResource(id = R.dimen.padding_16))
            )

            Text(
                text = stringResource(id = R.string.title_settings),
                color = MediaTheme.color.titleTextSetting,
                style = MediaTheme.typography.titleTextMedium,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = dimensionResource(id = R.dimen.padding_12))
            )
        }

        SettingsItem(
            onClick = { onThemeChange(!stateDarkTheme) },
            text = R.string.settings_screen_theme,
        ) {
            Switch(
                checked = stateDarkTheme,
                onCheckedChange = { onThemeChange(it) },
                colors = SwitchDefaults.colors(
                    checkedThumbColor = MediaTheme.color.checkedThumbColor,
                    checkedTrackColor = MediaTheme.color.checkedTrackColor,
                    uncheckedThumbColor = MediaTheme.color.uncheckedThumbColor,
                    uncheckedTrackColor = MediaTheme.color.uncheckedTrackColor,
                    checkedBorderColor = Color.Transparent,
                    uncheckedBorderColor = Color.Transparent
                )
            )
        }

        SettingsItem(
            onClick = {
                val message =
                    "Смотри какое классное приложение попало мне в руки, вот ссылка разработчика " +
                            "Максима Шостак в телеграамм. \nTelegram: @Maksim_Shostak."
                val sendIntent = Intent(Intent.ACTION_SEND).apply {
                    type = "text/plain"
                    putExtra(Intent.EXTRA_TEXT, message)
                }

                context.startActivity(sendIntent)
            },
            text = R.string.settings_screen_shape,
        ) {
            Icon(
                painter = painterResource(id = R.drawable.icon_shape),
                contentDescription = null,
                tint = MediaTheme.color.tintIconSetting
            )
        }

        SettingsItem(
            onClick = {
                val message = "Привет, меня зовут Максим. Если ты хочешь связаться со мной, " +
                        "вот мой\n Telegram: @Maksim_Shostak."

                val shareIntent = Intent(Intent.ACTION_SENDTO).apply {
                    data = "mailto:".toUri()
                    putExtra(Intent.EXTRA_EMAIL, arrayOf("makss.impeks@gmail.com"))
                    putExtra(Intent.EXTRA_TEXT, message)
                }

                context.startActivity(shareIntent)
            },
            text = R.string.settings_screen_write_support,
        ) {
            Icon(
                painter = painterResource(id = R.drawable.icon_support),
                contentDescription = null,
                tint = MediaTheme.color.tintIconSetting
            )
        }

        SettingsItem(
            onClick = {
                val url = "https://yandex.ru/legal/practicum_offer/ru/"
                val intent = Intent(Intent.ACTION_SEND, url.toUri())
                context.startActivity(intent)
            },


            text = R.string.settings_screen_user_agreement,
        ) {
            Icon(
                painter = painterResource(id = R.drawable.icon_right_arrow),
                contentDescription = null,
                tint = MediaTheme.color.tintIconSetting
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SettingScreenPreview() {
    NewPlaylistMakerTheme {
        SettingScreen(
            stateDarkTheme = false,
            onThemeChange = { }
        )
    }
}