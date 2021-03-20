package com.primalabs.devchallengemysoothe.ui.composables

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ThemedButton(
    text: String,
    colors: ButtonColors = ButtonDefaults.buttonColors()
){
    Button(
        onClick = {},
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier
            .height(72.dp)
            .fillMaxWidth(),
        colors = colors
    ) {
        Text(text = text)
    }
}