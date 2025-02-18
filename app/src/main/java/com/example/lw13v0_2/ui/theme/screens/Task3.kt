package com.example.lw13v0_2.ui.theme.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Task3Screen {
    @Composable
    fun Task3Box() {
        Box() {
            Task1Screen("ИСПП-35")
            Task2Screen()
            Task3()
        }
    }

    @Composable
    fun Task3Row() {
        Row() {
            Task1Screen("ИСПП-35")
            Task2Screen()
            Task3()
        }
    }

    @Composable
    fun Task3Column() {
        Column{
            Task1Screen("ИСПП-35")
            Task2Screen()
            Task3()
        }
    }

    @Composable
    fun Task3() {
        Column {
            Surface(color = Color.Cyan, modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = "Добро пожаловать!",
                    fontSize = 24.sp,
                    modifier = Modifier.padding(16.dp)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(onClick = {}) {
                Text("Ok")
            }
        }
    }
}
