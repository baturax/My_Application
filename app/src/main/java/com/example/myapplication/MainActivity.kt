package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme
import compose.icons.FeatherIcons
import compose.icons.feathericons.Github
import sh.calvin.autolinktext.rememberAutoLinkText

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    Column /*Main Column*/(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Column /* Center Column*/(
            Modifier.weight(1f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Image(
                painter = painterResource(R.drawable.android_logo),
                contentScale = ContentScale.Fit,
                contentDescription = null,
                modifier = Modifier.weight(1f)
            )
            Text(
                text = "Bai",
                fontSize = 30.sp,
                fontFamily = FontFamily.Monospace,
                textAlign = TextAlign.Center
            )
            Text(
                text = "Learning Developer",
                fontFamily = FontFamily.Monospace,
                textAlign = TextAlign.Center,

                )
        }

        Column /* Bottom Column */(
            Modifier
                .weight(1f)
                .padding(top = 30.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        )
        {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Absolute.Center
            ) {
                Icon(Icons.Rounded.Email, contentDescription = null)
                Text(
                    AnnotatedString.rememberAutoLinkText(
                        "bai@baturax.com"
                    ),
                    modifier = Modifier.padding(start = 5.dp)
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Absolute.Center
            ) {
                Icon(Icons.Rounded.Phone, contentDescription = null)
                Text(
                    AnnotatedString.rememberAutoLinkText(
                        "+90 000 000 0000"
                    ),
                    modifier = Modifier.padding(start = 5.dp)
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Absolute.Center
            ) {
                Icon(Icons.Rounded.Home, contentDescription = null)
                Text(
                    AnnotatedString.rememberAutoLinkText(
                        "https://baturax.com"
                    ),
                    modifier = Modifier.padding(start = 5.dp)
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Absolute.Center
            ) {
                Icon(FeatherIcons.Github, contentDescription = null)
                Text(
                    AnnotatedString.rememberAutoLinkText(
                        "https://github.com/baturax"
                    ),
                    modifier = Modifier.padding(start = 5.dp)
                )
            }
        }
    }
}