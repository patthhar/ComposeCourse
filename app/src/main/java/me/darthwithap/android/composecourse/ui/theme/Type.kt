package me.darthwithap.android.composecourse.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import me.darthwithap.android.composecourse.R

val Comfortaa = FontFamily(
    listOf(
        Font(R.font.comfortaa_light, weight = FontWeight.Light, style = FontStyle.Normal),
        Font(R.font.comfortaa_regular, weight = FontWeight.Normal, style = FontStyle.Normal),
        Font(R.font.comfortaa_medium, weight = FontWeight.Medium, style = FontStyle.Normal),
        Font(R.font.comfortaa_semibold, weight = FontWeight.SemiBold, style = FontStyle.Normal),
        Font(R.font.comfortaa_bold, weight = FontWeight.Bold, style = FontStyle.Normal),
    )
)

val Roboto = FontFamily(
    listOf(
        Font(R.font.roboto_thin, weight = FontWeight.Thin, style = FontStyle.Normal),
        Font(R.font.roboto_light, weight = FontWeight.Light, style = FontStyle.Normal),
        Font(R.font.roboto_regular, weight = FontWeight.Normal, style = FontStyle.Normal),
        Font(R.font.roboto_medium, weight = FontWeight.Medium, style = FontStyle.Normal),
        Font(R.font.comfortaa_bold, weight = FontWeight.Bold, style = FontStyle.Normal),
        Font(R.font.roboto_black, weight = FontWeight.Black, style = FontStyle.Normal),
    )
)

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)