package com.primalabs.devchallengemysoothe.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.primalabs.devchallengemysoothe.R

private val KulimParkBold = FontFamily(Font(R.font.kulimpark_bold))
private val KulimParkRegular = FontFamily(Font(R.font.kulimpark_regular))
private val KulimParkLight = FontFamily(Font(R.font.kulimpark_light))

// Set of Material typography styles to start with
val Typography = Typography(
   h1 = TextStyle(
       fontFamily = KulimParkLight,
       fontSize = 28.sp,
       letterSpacing = 1.15.sp
   ),
    h2 = TextStyle(
        fontFamily = KulimParkRegular,
        fontSize = 15.sp,
        letterSpacing = 1.15.sp
    ),
    h3 = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold
    ),
    body1 = TextStyle(
        fontSize = 14.sp
    ),
    button = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        letterSpacing = 1.15.sp
    ),
    caption = TextStyle(
        fontFamily = KulimParkRegular,
        fontSize = 12.sp,
        letterSpacing = 1.15.sp
    )
)