package com.example.shakeit.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.shakeit.R

val Pontiac = FontFamily(
    Font(R.font.fontspring_pontiac_regular, FontWeight.Normal, FontStyle.Normal),
    Font(R.font.fontspring_pontiac_light_italic, FontWeight.Light, FontStyle.Italic),
    Font(R.font.fontspring_pontiac_bold, FontWeight.Bold, FontStyle.Normal)
)

// Set di stili di testo personalizzati
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = Pontiac,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = Pontiac,
        fontWeight = FontWeight.Light,
        fontSize = 14.sp,
        fontStyle = FontStyle.Italic,
        lineHeight = 20.sp,
        letterSpacing = 0.5.sp
    ),
    bodySmall = TextStyle(
        fontFamily = Pontiac,
        fontWeight = FontWeight.Light,
        fontSize = 12.sp,
        fontStyle = FontStyle.Italic,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    ),

    titleLarge = TextStyle(
        fontFamily = Pontiac,
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp,
        lineHeight = 34.sp,
        letterSpacing = 0.sp
    ),

    headlineMedium = TextStyle(
        fontFamily = Pontiac,
        fontWeight = FontWeight.Medium,
        fontSize = 10.sp,
        lineHeight = 22.sp,
        letterSpacing = 0.15.sp
    )
)
