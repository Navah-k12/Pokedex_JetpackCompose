package com.example.pokedex.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pokedex.data.PokemonRepo // Importacion del archivo de la carpeta Data
import com.example.pokedex.ui.theme.components.PokemonCard
import com.example.pokedex.R


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
fun PokemonScreen(onNavigate: (String) -> Unit, onBack: () -> Unit) {
    var indice by remember {
        mutableStateOf( 0)
    }

    val pokemon = PokemonRepo.pokemones[indice]
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF8FAFC))
            .padding(24.dp),
        horizontalAlignment = Alignment.Start

    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(46.dp)
                    .background(Color(0xFF2D2D2D), shape = RoundedCornerShape(10.dp)),
                contentAlignment = Alignment.Center,
            ) {
                Image(
                    painter = painterResource(R.drawable.pokebola3),
                    contentDescription = "Pokébola",
                    modifier = Modifier.size(28.dp)
                )
            }

            Spacer(modifier = Modifier.width(12.dp))

            Text(
                text = "Pokédex",
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF800000)
            )

            Column(horizontalAlignment = Alignment.End) {
                Button(onClick = onBack) {
                    Text(
                        text = "Regresar"
                    )
                }
            }



        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Pokémon Capturados",
            fontSize = 34.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color(0xFF0F172A),
            lineHeight = 40.sp
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Conoce la información de cada Pokémon que has capturado, como su naturaleza " +
                    "entre otras características destacadas.",
            fontSize = 15.sp,
            color = Color(0xFF64748B),
            lineHeight = 22.sp
        )

        Spacer(modifier = Modifier.height(20.dp))


        LazyColumn(
            modifier = Modifier
                .fillMaxSize(),
            contentPadding = PaddingValues(vertical = 8.dp),// Separación vertical
            verticalArrangement = Arrangement.spacedBy(25.dp) // Separación de espacios de el card
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
    PokemonScreen(
        onNavigate = {},
        onBack = {}
    )

}