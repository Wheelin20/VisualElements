package com.waldoms.visualelements

import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.dp

@Composable
fun TestGesturesOne()
{
    val gestureDetection = remember { mutableStateOf("No gesture") }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center)
    {
        Text(text = gestureDetection.value)

        val txtState = remember { mutableStateOf(0) }
        Box(modifier = Modifier
            .size(200.dp)
            .clickable { txtState.value += 1 }
            .pointerInput(Unit) {
                detectTapGestures (
                    onTap = { gestureDetection.value = "onTap x: ${it.x} y: ${it.y}" },
                    onPress = { gestureDetection.value = "onPress" },
                    onDoubleTap = { gestureDetection.value = "onDoubleTap" },
                    onLongPress = { gestureDetection.value = "onLongPress" }
                )
            })
        {
           Text(text = "Clicked ${txtState.value} times", modifier = Modifier.align(Alignment.Center))
        }
    }
}