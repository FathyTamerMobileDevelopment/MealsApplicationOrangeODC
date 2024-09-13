package com.android.mealsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.android.mealsapp.ui.theme.MealsApplicationTheme
import com.android.mealsapp.ui.theme.screen.MealsApplicationScreen

import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MealsApplicationTheme {
                Box(modifier = Modifier.fillMaxSize()) {
                    MealsApplicationScreen()
                }
            }
        }
    }
}
