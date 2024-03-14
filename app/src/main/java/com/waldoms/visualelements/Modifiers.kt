package com.waldoms.visualelements

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun TestModifiers()
{
    Column(modifier = Modifier
        .padding(20.dp)
        .background(Color(0x440000FF ))
        .clickable {  }
    )
    {
        Text(text = "Test modifiers", modifier = Modifier.background(Color.Red))
    }
}