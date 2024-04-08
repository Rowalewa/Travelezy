package com.example.travelezy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.travelezy.ui.theme.TravelezyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TravelezyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Green
                ) {
                    Travel()
                }
            }
        }
    }
}
@Composable
fun Travel(){
    val image = painterResource(R.drawable.bckgnd)
    Image(
        painter = image,
        contentDescription = "background image",
        modifier = Modifier
    )
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Row(
            modifier = Modifier.padding(
                start = 0.dp,
                top = 40.dp,
                end = 0.dp,
                bottom = 0.dp
            )

        ) {
            Icon(
                Icons.Filled.Home,
                contentDescription = "Localized description",
                tint = Color.White,
                modifier = Modifier.size(55.dp)
            )
            Text(
                text = "travelezy",
                fontSize = 40.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Red
            )
        }
        Card(
            colors = CardDefaults.cardColors(
                Color.Black
            ),
            modifier = Modifier
                .wrapContentHeight()
                .padding(
                    start = 10.dp,
                    end = 10.dp,
                    top = 400.dp,
                    bottom = 5.dp
                )
                .clip(shape = RoundedCornerShape(30.dp))
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Bottom
            ) {
                Text(
                    text = "Explore the world here",
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier.padding(15.dp),
                    fontSize = 30.sp
                )
                Text(
                    text = "The best travel app in the world in 2021. Answer of traveller to find journey",
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    fontSize = 16.sp
                )
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .align(alignment = Alignment.CenterHorizontally)
                        .padding(15.dp)
                        .fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(Color.White)
                ) {
                    Text(
                        text = "Create an account",
                        color = Color.Black
                    )
                }
                Text(
                    text = "Already have an account?",
                    textDecoration = TextDecoration.Underline,
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    modifier = Modifier.padding(
                        start = 0.dp,
                        top = 5.dp,
                        bottom = 15.dp,
                        end = 0.dp
                    )
                )
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "My Preview"
)
@Composable
fun TravelProjectPreview() {
    TravelezyTheme {
        Travel()
    }
}