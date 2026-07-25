package com.example.pokedex.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.material3.Button
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pokedex.R

/**
 * Project: Pokédex
 * From: com.example.Pokédex.ui.theme.screens
 * Created by: navah
 * On: 24/7/26
 * All rights reserved: 2026
 */

@Composable
fun HomeScreen(onNavigate: () -> Unit) {

    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(50.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Bienvendio",
            fontSize = 50.sp

        )

        Spacer(Modifier.height(50.dp))

        Image(painter = painterResource(R.drawable.pokebola3),
            contentDescription = "Home")
        Spacer(Modifier.height(30.dp))

        Button(onClick = onNavigate,
            colors = ButtonDefaults.buttonColors(Color.Red)) {
            Text("Iniciar")
        }





    }

}

@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(
        onNavigate = {}
    )
}