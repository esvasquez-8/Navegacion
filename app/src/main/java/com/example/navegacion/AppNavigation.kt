package com.example.navegacion

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = ScreenA,
        modifier = modifier
    ) {
        composable<ScreenA> {
            ScreenA(
                onNavigateToB = { navController.navigate(ScreenB) },
                onNavigateToC = { navController.navigate(ScreenC) }
            )
        }
        composable<ScreenB> {
            ScreenB(
                onNavigateToA = { navController.navigate(ScreenA) },
                onNavigateToC = { navController.navigate(ScreenC) }
            )
        }
        composable<ScreenC> {
            ScreenC(
                onNavigateToA = { navController.navigate(ScreenA) },
                onNavigateToB = { navController.navigate(ScreenB) }
            )
        }
    }
}
