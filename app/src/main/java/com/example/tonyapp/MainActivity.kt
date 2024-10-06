package com.example.tonyapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tonyapp.ui.theme.TonyAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TonyAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AffApp(
                        stringResource(R.string.title),
                        stringResource(R.string.p1),
                        stringResource(R.string.p2)
                    )
                }
            }
        }
    }
}

@Composable
fun AffApp(title : String,p1 : String,p2 : String,modifier: Modifier = Modifier) {

    Column(

        verticalArrangement = Arrangement.Center

    ){

        Image(

            painter = painterResource(R.drawable.bg_compose_background),
            contentDescription = "Jet"

        )

        Text(
            text = title,
            fontSize = 24.sp,
            modifier = modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp, top = 16.dp)
        )
        Text(
            text = p1,
            modifier = modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = p2,
            modifier = modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp, top = 16.dp),
            textAlign = TextAlign.Justify
        )

    }


}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    TonyAppTheme {
        AffApp(
            stringResource(R.string.title),
            stringResource(R.string.p1),
            stringResource(R.string.p2)
        )
    }
}