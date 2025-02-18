package com.example.lw13v0_2.ui.theme.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Task4_1Screen() {
    BoxWithConstraints(
        modifier = Modifier.fillMaxSize()
    ) {
        val screenWidth = maxWidth
        val screenHeight = maxHeight

        Box(
            modifier = Modifier
                .size(screenWidth * 0.2f, screenHeight * 0.2f)
                .background(Color.Red, shape = RoundedCornerShape(8.dp))
                .align(Alignment.TopStart)
        )
        Box(
            modifier = Modifier
                .size(screenWidth * 0.2f, screenHeight * 0.2f)
                .background(Color.Cyan, shape = RoundedCornerShape(8.dp))
                .align(Alignment.TopCenter)
        )
        Box(
            modifier = Modifier
                .size(screenWidth * 0.2f, screenHeight * 0.2f)
                .background(Color(255, 128, 0), shape = RoundedCornerShape(8.dp))
                .align(Alignment.TopEnd)
        )
        Box(
            modifier = Modifier
                .size(screenWidth * 0.2f, screenHeight * 0.2f)
                .background(Color.Green, shape = RoundedCornerShape(8.dp))
                .align(Alignment.CenterStart)
        )


        Box(
            modifier = Modifier
                .size(screenWidth * 0.2f, screenHeight * 0.2f)
                .background(color = Color(255, 192, 203), shape = RoundedCornerShape(8.dp))
                .align(Alignment.CenterEnd)
        )
        Box(
            modifier = Modifier
                .size(screenWidth * 0.2f, screenHeight * 0.2f)
                .background(Color.Blue, shape = RoundedCornerShape(8.dp))
                .align(Alignment.BottomStart)
        )
        Box(
            modifier = Modifier
                .size(screenWidth * 0.2f, screenHeight * 0.2f)
                .background(Color.DarkGray, shape = RoundedCornerShape(8.dp))
                .align(Alignment.BottomCenter)
        )
        Box(
            modifier = Modifier
                .size(screenWidth * 0.2f, screenHeight * 0.2f)
                .background(Color.Yellow, shape = RoundedCornerShape(8.dp))
                .align(Alignment.BottomEnd)
        )
        Box(
            modifier = Modifier
                .size(screenWidth * 0.8f, screenHeight * 0.7f)
                .background(Color.Black, shape = RoundedCornerShape(8.dp))
                .align(Alignment.Center)
        )
    }
}
