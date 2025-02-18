package com.example.lw13v0_2.ui.theme.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Task4_2Screen(){
    Column(
        modifier = Modifier.fillMaxHeight()
    ) {
        androidx.compose.material3.Text(
            "5%",
            modifier = Modifier
                .weight(0.05f)
                .fillMaxWidth()
                .background(Color.Red)
        )
        androidx.compose.material3.Text(
            "15%",
            modifier = Modifier
                .weight(0.15f)
                .fillMaxWidth()
                .background(Color.Green)
        )
        androidx.compose.material3.Text(
            "30%",
            modifier = Modifier
                .weight(0.3f)
                .fillMaxWidth()
                .background(Color.Blue)
        )
        androidx.compose.material3.Text(
            "50%",
            modifier = Modifier
                .weight(0.5f)
                .fillMaxWidth()
                .background(Color.Yellow)
        )
    }
}
