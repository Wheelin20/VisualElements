package com.waldoms.visualelements

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.waldoms.visualelements.ui.theme.VisualElementsTheme

class MainActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContent {
            VisualElementsTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background)
                {
//                    TestModifiers()
//                    TestLayout()
//                    TestSizing()
//                    Exercise01()
//                    TestText()
//                    TestTheme()
//                    TestIMages()
//                    TestButtons()
//                    Exercise02()
//                    TestLazyLists()
//                    TestScrollable()
//                    TestGesturesOne()
//                    TestGestures2()
//                    TestProgressIndicators()
//                    TestSideEffects()
                    Exercise03()
//                    val context = LocalContext.current
//                    Toast.makeText(context, "Hay how's it going", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}
