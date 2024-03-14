package com.waldoms.visualelements

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun Exercise02() {
    val context = LocalContext.current
    Column() {
        val profileImage = painterResource(id = R.drawable.thispersondoesnotexist)
        val image01 = painterResource(id = R.drawable.delta_flyer)
        val image02 = painterResource(id = R.drawable.enterpriserefit_900x596)
        val image03 = painterResource(id = R.drawable.maxresdefault)
        val image04 = painterResource(id = R.drawable.starships_star_trek_discovery_1628012114728)
        val image05 = painterResource(id = R.drawable.uss_stargazer)
        val image06 = painterResource(id = R.drawable.large_thumbnail)
        Column(
            modifier = Modifier
                .padding(24.dp)
                .fillMaxWidth(1f)
                .fillMaxHeight(0.5f), horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Header
            Row(
                horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier
                    .fillMaxWidth(1f)
                    .height(150.dp)
                    .padding(8.dp)
            ) {
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight(1f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
                ) {
                    Image(painter = profileImage, contentDescription = null, modifier = Modifier.clip(CircleShape))
                }
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight(1f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
                ) {
                    Text(text = "120", fontWeight = FontWeight.Bold)
                    Text(text = stringResource(id = R.string.posts))
                }
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight(1f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
                ) {
                    Text(text = "567", fontWeight = FontWeight.Bold)
                    Text(text = stringResource(id = R.string.followers))
                }
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight(1f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
                ) {
                    Text(text = "123", fontWeight = FontWeight.Bold)
                    Text(text = stringResource(id = R.string.following))
                }
            }

            //Info
            Column(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(1f)
            ) {
                Text(text = stringResource(id = R.string.user_name), fontWeight = FontWeight.Bold)
                Text(text = stringResource(id = R.string.ig_profile_description))
            }

            // Button
            Row(modifier = Modifier.padding(8.dp)) {
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray, contentColor = Color.Black),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.fillMaxWidth(1f)
                ) {
                    Text(text = stringResource(id = R.string.ig_profile_button), fontWeight = FontWeight.Bold, modifier = Modifier.padding(4.dp))
                }
            }
        }

            // Posts
        Column(modifier = Modifier
            .fillMaxWidth(1f)
            .fillMaxHeight(1f))
        {
            Row(modifier = Modifier.fillMaxWidth(1f))
            {
                Image(painter = image01, contentDescription = null, modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f)
                    .padding(end = 1.dp, bottom = 1.dp), contentScale = ContentScale.Crop)
                Image(painter = image02, contentDescription = null, modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f)
                    .padding(end = 1.dp, bottom = 1.dp), contentScale = ContentScale.Crop)
                Image(painter = image03, contentDescription = null, modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f)
                    .padding(bottom = 1.dp), contentScale = ContentScale.Crop)
            }
            Row(modifier = Modifier.fillMaxWidth(1f))
            {
                Image(painter = image04, contentDescription = null, modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f)
                    .padding(end = 1.dp, bottom = 1.dp), contentScale = ContentScale.Crop)
                Image(painter = image05, contentDescription = null, modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f)
                    .padding(end = 1.dp, bottom = 1.dp), contentScale = ContentScale.Crop)
                Image(painter = image06, contentDescription = null, modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f)
                    .padding(bottom = 1.dp), contentScale = ContentScale.Crop)
            }
        }
    }
}