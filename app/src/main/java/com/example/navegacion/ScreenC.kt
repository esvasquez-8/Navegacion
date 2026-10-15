package com.example.navegacion

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.navegacion.ui.theme.NavegacionTheme

@Composable
fun ScreenC(
    onNavigateToB: () -> Unit,
    onNavigateToA: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Pantalla C",
            style = MaterialTheme.typography.headlineLarge
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(onClick = onNavigateToB) {
            Text(text = "Ir a Pantalla B")
        }

        Spacer(modifier = Modifier.height(24.dp))

        Button(onClick = onNavigateToA) {
            Text(text = "Ir a Pantalla A")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ScreenCPreview() {
    NavegacionTheme {
        ScreenC(
            onNavigateToB = {},
            onNavigateToA = {}
        )
    }
}