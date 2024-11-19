package com.example.shakeit.ui.elements

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.shakeit.R

@Composable
fun HomePage() {
    Image(
        painter = painterResource(id = R.drawable.background_xxxhdpi), // Sostituisci con il tuo sfondo
        contentDescription = null,
        modifier = Modifier.fillMaxSize()
    )
}
