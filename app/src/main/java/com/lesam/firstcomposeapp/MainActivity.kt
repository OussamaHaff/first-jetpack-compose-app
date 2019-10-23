package com.lesam.firstcomposeapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Sp
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.foundation.DrawImage
import androidx.ui.graphics.Color
import androidx.ui.graphics.Image
import androidx.ui.layout.Column
import androidx.ui.layout.CrossAxisAlignment
import androidx.ui.material.MaterialTheme
import androidx.ui.res.imageResource
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontFamily
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                MultipleGreetings()
            }
        }
    }
}

@Preview
@Composable
fun MultipleGreetingsPreview() {
    MaterialTheme {
        MultipleGreetings()
    }
}

@Composable
fun MultipleGreetings() {
    val image = +imageResource(R.drawable.bmp_nicolas_cage_meme)
    MaterialTheme {
        Column(crossAxisAlignment = CrossAxisAlignment.Center) {
            DrawImage(image = image)
            Greeting(name = "Android Candy")
            GentleGreeting()
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(
            text = "Yo, $name!",
            style = TextStyle(
                    color = Color.Yellow,
                    fontSize = Sp(28f),
                    fontFamily = FontFamily.Cursive
            )
    )
}
@Preview
@Composable
fun GentleGreeting() {
    Text(text = "😊")
}

@Preview
@Composable
fun DefaultPreview() {
    MaterialTheme {
        Greeting("Android Rocks")
    }
}
