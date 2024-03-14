package com.waldoms.visualelements

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TestScrollable()
{
    Column(modifier = Modifier.verticalScroll(rememberScrollState()))
    {
        val tf = remember { mutableStateOf(TextFieldValue("")) }
        Text(text = "Terms and Conditions", fontWeight = FontWeight.Bold)
        TextField(value = tf.value, onValueChange = { tf.value = it})
        Text(text = stringResource(id = R.string.lorem_ipsum))
    }
}