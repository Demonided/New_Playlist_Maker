package com.example.new_playlist_maker.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.new_playlist_maker.presentation.ui.screen.HomeScreen
import com.example.new_playlist_maker.presentation.ui.screen.MediaScreen
import com.example.new_playlist_maker.presentation.ui.screen.SettingScreen

@Composable
fun MediaNavHost(
    route: String,
    stateDarkTheme: Boolean,
    onThemeChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = route,
        modifier = modifier
    ) {
        composable(route = HomeDestination.route) {
            HomeScreen(
                onClickSearch = { navController.navigate(SearchDestination.route) },
                onClickMedia = { navController.navigate(MediaDestination.route) },
                onClickSetting = { navController.navigate(SettingsDestination.route) }
            )
        }

        composable(route = SearchDestination.route) {

        }

        composable(route = MediaDestination.route) {
            MediaScreen()
        }

        composable(route = SettingsDestination.route) {
            SettingScreen(
                stateDarkTheme = stateDarkTheme,
                onThemeChange = onThemeChange
            )
        }
    }
}