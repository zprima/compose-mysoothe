package com.primalabs.devchallengemysoothe.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.primalabs.devchallengemysoothe.R
import com.primalabs.devchallengemysoothe.ui.theme.DevChallengeMySootheTheme


@Composable
fun WelcomeScreen(){
    val backgroundImage = if(MaterialTheme.colors.isLight){
        R.drawable.light_welcome
    } else {
        R.drawable.dark_welcome
    }

    Surface{
        Image(
            painterResource(id = backgroundImage),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize()
        )

        Column(
            modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            LogoImage()

            Spacer(Modifier.height(32.dp))

            SignUpButton()

            Spacer(Modifier.height(8.dp))

            LogInButton()
        }
    }
}

@Composable
private fun LogInButton() {
    Button(
        onClick = {},
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier
            .height(72.dp)
            .fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = MaterialTheme.colors.secondary,

            )
    ) {
        Text(text = "LOGIN IN")
    }
}

@Composable
private fun SignUpButton() {
    Button(
        onClick = { /*TODO*/ },
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier
            .height(72.dp)
            .fillMaxWidth()
    ) {
        Text(text = "SIGN UP")
    }
}

@Composable
private fun LogoImage() {
    val logoImage = if (MaterialTheme.colors.isLight) {
        R.drawable.light_logo
    } else {
        R.drawable.dark_logo
    }

    Image(
        painterResource(id = logoImage),
        contentDescription = null
    )
}

@Composable
@Preview
fun PreviewLightWelcomeScreen(){
    DevChallengeMySootheTheme(darkTheme = false) {
        WelcomeScreen()
    }
}

@Composable
@Preview
fun PreviewDarkWelcomeScreen(){
    DevChallengeMySootheTheme(darkTheme = true) {
        WelcomeScreen()
    }
}