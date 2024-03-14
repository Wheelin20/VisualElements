package com.waldoms.visualelements

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TestSizing()
{
    Row( modifier = Modifier.background(Color(0xffcccccc)))
    {
//        Column(modifier = Modifier
//            .width(200.dp)
//            .height(100.dp)
//            .background(Color.Blue)) { }

//        Column(modifier = Modifier
//            .fillMaxWidth(0.6f)
//            .height(100.dp)
//            .background(Color.Blue)) { }

//            Column(modifier = Modifier
//            .fillMaxWidth(0.6f)
//            .aspectRatio(1f)
//            .background(Color.Blue)) { }

//        Column(modifier = Modifier
//            .weight(1f)
//            .height(100.dp)
//            .background(Color.Blue)) {}
//
//        Column(modifier = Modifier
//            .weight(2f)
//            .height(100.dp)
//            .background(Color.Red)) {}

        Column(modifier = Modifier
            .width(100.dp)
            .height(100.dp)
            .background(Color.Blue)) {}

        Spacer(modifier = Modifier.width(30.dp))
        
        Column(modifier = Modifier
            .width(100.dp)
            .height(100.dp)
            .background(Color.Red)) {}

        Spacer(modifier = Modifier.width(10.dp))

        Text(text = "This is a sample text", fontSize = 20.sp)
    }
}