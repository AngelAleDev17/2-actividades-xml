package com.equipo1.a2__actividades

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.equipo1.a2__actividades.ui.theme._2actividadesTheme

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _2actividadesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ActivityTwoScreen(
                        modifier = Modifier.padding(innerPadding),
                        onBackToActivityOne = { finish() }
                    )
                }
            }
        }
    }
}

@Composable
fun ActivityTwoScreen(
    onBackToActivityOne: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = stringResource(R.string.activity_two_message))
        Button(onClick = onBackToActivityOne) {
            Text(text = stringResource(R.string.back_to_activity_one))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ActivityTwoPreview() {
    _2actividadesTheme {
        ActivityTwoScreen(onBackToActivityOne = {})
    }
}
