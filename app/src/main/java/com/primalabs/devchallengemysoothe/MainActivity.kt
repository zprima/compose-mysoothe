package com.primalabs.devchallengemysoothe

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults.buttonColors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.primalabs.devchallengemysoothe.ui.screens.HomeScreen
import com.primalabs.devchallengemysoothe.ui.screens.LoginScreen
import com.primalabs.devchallengemysoothe.ui.screens.WelcomeScreen
import com.primalabs.devchallengemysoothe.ui.theme.DevChallengeMySootheTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DevChallengeMySootheTheme {
                HomeScreen()
            }
        }
    }
}
