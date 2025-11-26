package com.example.new_playlist_maker.presentation.navigation

interface NavigationDestination {
    val route: String
}

object HomeDestination : NavigationDestination {
    override val route: String
        get() = "home"
}

object SearchDestination : NavigationDestination {
    override val route: String
        get() = "search"
}

object MediaDestination : NavigationDestination {
    override val route: String
        get() = "media"
}

object SettingsDestination : NavigationDestination {
    override val route: String
        get() = "settings"
}

