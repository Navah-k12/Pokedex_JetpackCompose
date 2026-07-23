package com.example.pokedex.ui.theme.components


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.pokedex.model.Pokemon
import com.example.pokedex.model.BadgeType

/**
 * Project: Pokédex
 * From: com.example.Pokédex.ui.theme.components
 * Created by: navah
 * On: 5/7/26
 * All rights reserved: 2026
 */

@Composable
fun PokemonCard(pokemon : Pokemon, onClick: ()-> Unit){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable{onClick()},
        colors = CardDefaults.cardColors(Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            AsyncImage(model = pokemon.imagen,
                contentDescription = pokemon.nombre,
                modifier = Modifier.size(150.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))

            Column(
                modifier = Modifier.fillMaxWidth(),
            ) {
                Text(
                    text = "Nombre",
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = pokemon.nombre,
                    fontSize = 20.sp
                )

                val tipo = pokemon.tipo.split("/")
                Spacer(modifier = Modifier.height(12.dp))
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    tipo.forEach { tipoTexto ->
                        BadgeType(tipo = tipoTexto)
                    }
                }
//
//                Text(
//                    text = "Tipo ",
//                    fontWeight = FontWeight.Bold
//                )
//                Text(
//                    text = pokemon.tipo,
//                    fontSize = 20.sp
//                )
//                Spacer(modifier = Modifier.height(12.dp)
//                )
//
//                Text(
//                    text = "Altura",
//                    fontWeight = FontWeight.Bold
//                )
//                Text(
//                    text = pokemon.altura,
//                    fontSize = 20.sp
//                )
//                Spacer(modifier = Modifier.height(12.dp)
//                )
//
//                Text(
//                    text = "Peso",
//                    fontWeight = FontWeight.Bold
//                )
//                Text(
//                    text = pokemon.peso,
//                    fontSize = 20.sp
//                )
//
            }
        }
    }
}

//@Preview(showSystemUi = true)
//@Composable
//fun PokemonCardPreview(){
//    val CardPreview = PokemonRepo.pokemones[0]
//    PokemonCard(pokemon = CardPreview)
//}