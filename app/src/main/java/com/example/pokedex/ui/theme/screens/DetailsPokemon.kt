package com.example.pokedex.ui.theme.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pokedex.data.PokemonRepo
import com.example.pokedex.model.Pokemon
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage

/**
 * Project: Pokédex
 * From: com.example.Pokédex.ui.theme.screens
 * Created by: navah
 * On: 18/7/26
 * All rights reserved: 2026
 */

@Composable
fun DetailsPokemon(pokemon: Pokemon,onBack: () -> Unit) {
    Box(modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center){

        Card(modifier = Modifier.padding(30.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 20.dp),
            colors = CardDefaults.cardColors(Color.White),

            ) {
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(Modifier.padding(15.dp))}

            AsyncImage(model = pokemon.imagen,
                contentDescription = pokemon.nombre,
                modifier = Modifier.size(200.dp))

                Spacer(modifier = Modifier.padding(15.dp))

                Text(
                    text = pokemon.nombre,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(Modifier.padding(5.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "Altura", fontWeight = FontWeight.SemiBold)
                        Text(text = pokemon.altura)
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "Peso", fontWeight = FontWeight.SemiBold)
                        Text(text = pokemon.peso)
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "Tipo", fontWeight = FontWeight.SemiBold)
                        Text(text = pokemon.tipo)
                    }
                }
                Spacer(Modifier.padding(10.dp))
                Column(modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "Shymin", fontWeight = FontWeight.SemiBold,color =Color.Yellow)

                    AsyncImage(model = pokemon.imagen,
                        contentDescription = pokemon.nombre,
                        modifier = Modifier.size(150.dp))
                    Text(text = "Información", fontWeight = FontWeight.SemiBold)
                    Text(text = pokemon.descripcion)

                }
                Spacer(Modifier.padding(10.dp))


            }
        }

    }



@Preview(showSystemUi = true)
@Composable
fun DetailsPokemonPreview(){
    DetailsPokemon(
        pokemon = PokemonRepo.pokemones[0],
        onBack = {}
    )

}
