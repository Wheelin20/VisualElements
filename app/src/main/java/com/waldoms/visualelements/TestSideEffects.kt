package com.waldoms.visualelements

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalContext
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun TestSideEffects() {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {
        val showProgress = remember { mutableStateOf(false) }
        val launchEffect = remember { mutableStateOf(false) }
        val context = LocalContext.current

        Button(onClick = {
            showProgress.value = true
            launchEffect.value = true
        })
        {
            Text(text = "Start Processing")
        }

        if(showProgress.value) { CircularProgressIndicator() }

        if(launchEffect.value)
        {
            Log.d("KEVINKEVIN", "launched effect")
            LaunchedEffect(key1 = Unit) {
                Log.d("KEVINKEVIN", "launched")
                delay(3000)
                Toast.makeText(context, "Task completed", Toast.LENGTH_SHORT).show()
                showProgress.value = false
                launchEffect.value = false
            }
        }
    }
}