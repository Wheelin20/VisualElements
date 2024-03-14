package com.waldoms.visualelements

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun TestIMages()
{
    Column(horizontalAlignment = Alignment.CenterHorizontally)
    {
        Row(
            modifier = Modifier
                .fillMaxWidth(1f)
                .height(100.dp), horizontalArrangement = Arrangement.Center
        )
        {
            val imgRes = painterResource(id = R.drawable.cessna_210)
            Image(painter = imgRes, contentDescription = null, contentScale = ContentScale.FillWidth)
        }

        val iconRes = painterResource(id = R.drawable.ic_celebration)
        Image(painter = iconRes, contentDescription = null, colorFilter = ColorFilter.tint(Color.Green))

        AsyncImage(
            model = "https://upload.wikimedia.org/wikipedia/commons/thumb/6/63/Tower_Bridge_from_Shad_Thames.jpg/2560px-Tower_Bridge_from_Shad_Thames.jpg",
            contentDescription = null
        )
    }
}