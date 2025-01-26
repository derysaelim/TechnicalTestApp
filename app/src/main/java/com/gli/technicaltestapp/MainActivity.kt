package com.gli.technicaltestapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.gli.technicaltestapp.ui.presentation.TechnicalTestApp
import com.gli.technicaltestapp.ui.theme.TechnicalTestAppTheme
import com.gli.technicaltestapp.utils.SetStatusBarColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            TechnicalTestAppTheme {
                SetStatusBarColor(color = Color(0xFFCF0B0C))
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TechnicalTestApp()
                }
            }
        }
    }
}
