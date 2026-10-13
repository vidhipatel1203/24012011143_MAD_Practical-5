package com.example.a24012011143_mad_prqctical_5

import com.example.a24012011143_mad_prqctical_5.ui.theme._24012011143_MAD_Prqctical5Theme

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.a24012011143_mad_prqctical_5.ui.theme._24012011143_MAD_Prqctical5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _24012011143_MAD_Prqctical5Theme {
                AppNavigation(this)
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    androidx.compose.material3.Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    _24012011143_MAD_Prqctical5Theme() {
        Greeting("Android")
    }
}
@Composable
@Preview
fun ButtonDemo(){
    var counter by remember { mutableStateOf(1) }
    Button(
        onClick = {
            counter+=1
        }
    ){
        Text(
            text = counter.toString(),
        )

    }
}