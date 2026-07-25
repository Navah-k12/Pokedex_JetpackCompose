package com.example.pokedex.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pokedex.data.CharacterRepository
import com.example.pokedex.ui.theme.components.CharacterCard

/**
 * Project: Pokédex
 * From: com.example.Pokédex.ui.theme.screens
 * Created by: navah
 * On: 24/7/26
 * All rights reserved: 2026
 */

@Composable
fun CharaterScreen(onNavigate:() -> Unit,onBack:() -> Unit){
    Column(modifier = Modifier.fillMaxWidth().padding(40.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Escoge tu Personaje",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(Modifier.height(30.dp))
        Column(modifier = Modifier.fillMaxWidth().padding(5.dp),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = {onBack()}
            ) {
                Text(
                    text = "Regresar",

                )
            }
        }

        Text(
            text = "Maestros Pokemón",
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold
        )


        LazyColumn(modifier = Modifier.fillMaxWidth(),
            contentPadding = PaddingValues(vertical = 15.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp),

            )
        {
            items(CharacterRepository.characters){ character ->
                CharacterCard(character = character,
                    onClick = onNavigate,
                    onBack = {})
            }
        }




    }

}


@Preview(showSystemUi = true)
@Composable
fun CharacterScreenPreview(){
    CharaterScreen(
        onNavigate = {},
        onBack = {}
    )
}