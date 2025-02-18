package com.example.lw13v0_2.ui.theme.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Task2Screen(modifier: Modifier = Modifier) {
    Box {
        androidx.compose.material3.Surface(color = Color.Cyan) {
            androidx.compose.material3.Text(
                text = "Sample text",
                modifier = modifier.padding(20.dp),
                fontSize = 10.sp
            )
        }
    }
}
