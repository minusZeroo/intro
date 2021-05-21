package com.example.intro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingText(name = "world")
        }
    }
}

@Composable
fun GreetingText(name: String) {
    Text(text = " Hello $name!",
            modifier = Modifier
                .width(200.dp)
                .height(240.dp)
                .clickable(onClick = { /*TODO*/ })
                .padding(all = 24.dp),
            style = MaterialTheme.typography.h5,
            fontWeight = FontWeight.SemiBold
    )
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GreetingText(name = "world")
}