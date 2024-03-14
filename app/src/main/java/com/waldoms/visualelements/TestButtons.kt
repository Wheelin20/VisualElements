package com.waldoms.visualelements

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.waldoms.visualelements.ui.theme.Shapes

@Composable
fun TestButtons()
{
    val context = LocalContext.current
    val btnImage = painterResource(id = R.drawable.ic_user)
    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center)
    {
        Button(
            onClick = { Toast.makeText(context, "Button Clicked!!", Toast.LENGTH_LONG).show() },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue,
                contentColor = Color.Green,
            )
        )
        {
            Image(painter = btnImage, contentDescription = null, colorFilter = ColorFilter.tint(Color.Green))
            Spacer(modifier = Modifier.width(5.dp))
            Text(text = "Profile")
        }
    }
}