package com.example.roomdbmvvm

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme{
                MyButton()
            }
        }
    }
}

@Composable
fun MyButton(){
    val context = LocalContext.current
    val launcher= rememberLauncherForActivityResult(
        contract = ActivityResultContracts.StartActivityForResult()
    ){ result ->
        // handle results of launch
    }
    Button(onClick = {
        val intent= Intent(context, MvvM::class.java)
        launcher.launch(intent)
    }
    ) {
        Text(text = "New activity")
    }
}

//https://paulallies.medium.com/jetpack-compose-mvvm-6a5033ed54d9 - mvvm