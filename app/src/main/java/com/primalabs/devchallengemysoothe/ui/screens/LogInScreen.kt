package com.primalabs.devchallengemysoothe.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.TextFieldDefaults.textFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.primalabs.devchallengemysoothe.R
import com.primalabs.devchallengemysoothe.ui.composables.ThemedButton
import com.primalabs.devchallengemysoothe.ui.theme.DevChallengeMySootheTheme

@Composable
fun LoginScreen(){
    Surface(){
        LogInBackground()

        Column(
            modifier = Modifier.fillMaxSize().padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "LOGIN IN",
                modifier = Modifier.paddingFromBaseline(top = 200.dp, bottom = 32.dp),
                style = MaterialTheme.typography.h1
            )

            val emailText = remember { mutableStateOf("")}

            TextField(
                value = emailText.value,
                onValueChange = { emailText.value = it },
                label = { Text("Email address") },
                textStyle = MaterialTheme.typography.body1,
                modifier = Modifier.height(56.dp).fillMaxWidth(),
                colors = textFieldColors(
                    focusedLabelColor = MaterialTheme.colors.onSurface,
                ),

            )

            Spacer(Modifier.height(8.dp))

            TextField(
                value = "",
                onValueChange = { /*TODO*/ },
                label = { Text("Password") },
                textStyle = MaterialTheme.typography.body1,
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Password
                ),
                modifier = Modifier.height(56.dp).fillMaxWidth()
            )

            Spacer(Modifier.height(8.dp))

            ThemedButton(
                text = "LOG IN"
            )

            Text(buildAnnotatedString {
                append("Don't have an account? ")
                withStyle(style = SpanStyle(textDecoration = TextDecoration.Underline)){
                    append("Sign Up")
                }
            }, modifier = Modifier.paddingFromBaseline(top = 32.dp))
        }
    }
}

@Composable
private fun LogInBackground() {
    val backgroundImage = if (MaterialTheme.colors.isLight) {
        R.drawable.light_login
    } else {
        R.drawable.dark_login
    }

    Image(
        painterResource(id = backgroundImage),
        contentDescription = null,
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.FillBounds
    )
}

@Composable
@Preview
fun PreviewLightLoginScreen(){
    DevChallengeMySootheTheme(darkTheme = false) {
        LoginScreen()
    }
}

@Composable
@Preview
fun PreviewDarkLoginScreen(){
    DevChallengeMySootheTheme(darkTheme = true) {
        LoginScreen()
    }
}

