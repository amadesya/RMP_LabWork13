package com.example.lw13v0_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.*
import com.example.lw13v0_2.ui.theme.screens.*


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppNavigation()
        }
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = { BottomNavigationBar(navController) }
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = "task1",
            modifier = Modifier.padding(paddingValues)
        ) {
            composable("task1") { Task1Screen("ИСПП-35") }
            composable("task2") { Task2Screen() }
            composable("task3") { Task3ScreenWrapper() }
            composable("task4_1") { Task4_1Screen() }
            composable("task4_2") { Task4_2Screen() }
            composable("task5") { Task5Screen() }
            composable("task6") { Task6Screen() }
        }
    }
}

@Composable
fun Task3ScreenWrapper() {
    val task3Screen = Task3Screen()

    Column {
        Text("composable-функция Task3")
        task3Screen.Task3()
        Text("реализация Column")
        task3Screen.Task3Column()
        Text("Реализация Box")
        task3Screen.Task3Box()
        Text("Реализация Row")
        task3Screen.Task3Row()
    }

}

@Composable
fun BottomNavigationBar(navController: NavHostController) {
    BottomAppBar {
        val screens = listOf(
            "task1" to "1",
            "task2" to "2",
            "task3" to "3",
            "task4_1" to "4/1",
            "task4_2" to "4/2",
            "task5" to "5",
            "task6" to "6"
        )
        screens.forEach { (route, label) ->
            Button(
                onClick = { navController.navigate(route) },
                modifier = Modifier.weight(1f)
            ) {
                Text(label)
            }
        }
    }
}
