package com.example.lw13v0_2.ui.theme.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Task5Screen() {
    val list = listOf('1', '2', '3', '4', '5')

    Row {
        for (i in list) {
            androidx.compose.material3.Text("$i", modifier = Modifier, color = Color.Black)
        }
    }
}
