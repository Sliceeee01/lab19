package com.example.mylab.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Detail : Screen("detail/{bookId}") {
        fun createRoute(bookId: String) = "detail/$bookId"
    }
}