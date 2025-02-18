package com.example.lw13v0_2.ui.theme.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Task1Screen(name: String, modifier: Modifier = Modifier) {
    Box {
        androidx.compose.material3.Text(
            text = "Привет, $name!",
            modifier = modifier.padding(30.dp)
        )
    }
}
