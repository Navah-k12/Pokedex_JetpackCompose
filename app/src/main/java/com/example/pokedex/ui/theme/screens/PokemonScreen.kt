package com.example.pokedex.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pokedex.data.PokemonRepo // Importacion del archivo de la carpeta Data
import com.example.pokedex.ui.theme.components.PokemonCard


/**
 * Project: Pokédex
 * From: com.example.Pokédex.ui.theme.screens
 * Created by: navah
 * On: 3/7/26
 * All rights reserved: 2026
 */

//SCREENS va a mostrar cada pantalla del sistema

// Screen Maneja toda la logica de programación

@Composable
fun PokemonScreen(onNavigate: (String) -> Unit) {
    var indice by remember {
        mutableStateOf( 0)
    }

    val pokemon = PokemonRepo.pokemones[indice]
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(
            text = "POKÉDEX",
            fontSize = 30.sp,
            fontWeight = FontWeight.Black,
            color = Color.Red,
            modifier = Modifier.padding(top = 75.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        LazyColumn(
            modifier = Modifier
                .fillMaxSize(),
            contentPadding = PaddingValues(vertical = 8.dp),
            verticalArrangement = Arrangement.spacedBy(15.dp)
        ) {
            items(PokemonRepo.pokemones){ pokemon ->
                PokemonCard(pokemon = pokemon,
                    onClick = {onNavigate(pokemon.nombre)}) //Colcamos onClick aqui tambien
            }
        }


//        Row(
//            modifier = Modifier.fillMaxWidth(),
//            horizontalArrangement = Arrangement.SpaceBetween
//        ) {
//            Button(
//                onClick = {
//                    if (indice == 0){
//                        indice = PokemonRepo.pokemones.lastIndex
//                    }else{
//                        indice--
//                    }
//                },
//                modifier = Modifier
//                    .width(150.dp)
//                    .padding(top = 75.dp),
//                colors = ButtonDefaults.buttonColors(
//                    containerColor = Color.Red,
//                    contentColor = Color.White
//                )
//            ) {
//                Text("Regresar")
//            }

//            Button(
//                onClick = {
//                    if (indice == PokemonRepo.pokemones.lastIndex){
//                        indice = 0
//                    }else{
//                        indice++
//                    }
//                },
//                modifier = Modifier
//                    .width(150.dp)
//                    .padding(top = 75.dp),
//                colors = ButtonDefaults.buttonColors(
//                    containerColor = Color.Red,
//                    contentColor = Color.White
//                )
//            ) {
//                Text("Siguiente")
//            }
        }

    }
//}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PokemoScreenPreview(){
    //PokemonScreen()
}