package com.example.lw13v0_2.ui.theme.screens

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun Task6Screen() {
    var login by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column (modifier =  Modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        androidx.compose.material3.TextField(
            value = login,
            onValueChange = { login = it },
            label = { androidx.compose.material3.Text("Введите логин") },
            maxLines = 2,
            textStyle = TextStyle(color = Color.Black, fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(20.dp)
        )

        androidx.compose.material3.TextField(
            value = password,
            onValueChange = { password = it },
            label = { androidx.compose.material3.Text("Введите пароль") },
            maxLines = 2,
            textStyle = TextStyle(color = Color.Black, fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(20.dp)
        )

        androidx.compose.material3.Button(onClick = {}) {
            androidx.compose.material3.Text("Ok")
        }
    }


}
