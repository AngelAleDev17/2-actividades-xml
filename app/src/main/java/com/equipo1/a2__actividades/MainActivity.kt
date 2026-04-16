package com.equipo1.a2__actividades

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.equipo1.a2__actividades.ui.theme._2actividadesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _2actividadesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ActivityOneScreen(
                        modifier = Modifier.padding(innerPadding),
                        onGoToActivityTwo = {
                            startActivity(Intent(this, SecondActivity::class.java))
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun ActivityOneScreen(
    onGoToActivityTwo: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = stringResource(R.string.activity_one_hello))
        Button(onClick = onGoToActivityTwo) {
            Text(text = stringResource(R.string.go_to_activity_two))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    _2actividadesTheme {
        ActivityOneScreen(onGoToActivityTwo = {})
    }
}