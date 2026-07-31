package com.example.pokedex.ui.theme.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.pokedex.data.PokemonRepo
import com.example.pokedex.model.Pokemon
import com.example.pokedex.model.BadgeType

/**
 * Project: Pokédex
 * From: com.example.Pokédex.ui.theme.screens
 * Created by: navah
 * On: 18/7/26
 * All rights reserved: 2026
 */

@Composable
fun DetailsPokemon(pokemon: Pokemon, onBack: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Brush.verticalGradient(
                colors = listOf(
                    Color(0xFFF8FBFF),
                    Color(0xFF2A4C84)
                )
            ))
            .padding(16.dp)
    ) {

        Spacer(modifier = Modifier.height(20.dp))

        // Tarjeta principal con sombras suaves y esquinas redondeadas
        Card(
            modifier = Modifier.fillMaxWidth(),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            shape = RoundedCornerShape(20.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                // Contenedor marco para la imagen principal
                Surface(
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(0xFFF1F5F9),
                    shape = RoundedCornerShape(16.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        AsyncImage(
                            model = pokemon.imagen,
                            contentDescription = pokemon.nombre,
                            modifier = Modifier.size(180.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                // Nombre del Pokémon
                Text(
                    text = pokemon.nombre,
                    fontSize = 28.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color(0xFF0F172A)
                )

                Spacer(modifier = Modifier.height(16.dp))

                // Fila de Estadísticas Rápidas (Altura, Peso, Tipo)
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    // Módulo Altura
                    Surface(
                        color = Color(0xFFF8FAFC),
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier.padding(4.dp)
                    ) {
                        Column(
                            modifier = Modifier.padding(vertical = 10.dp, horizontal = 14.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(text = "Altura", fontSize = 12.sp, color = Color(0xFF64748B))
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(text = pokemon.altura,
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF0F172A))
                        }
                    }

                    // Módulo Peso
                    Surface(
                        color = Color(0xFFF8FAFC),
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier.padding(4.dp)
                    ) {
                        Column(
                            modifier = Modifier.padding(vertical = 10.dp, horizontal = 14.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(text = "Peso", fontSize = 12.sp, color = Color(0xFF64748B))
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(text = pokemon.peso, fontSize = 15.sp, fontWeight = FontWeight.Bold, color = Color(0xFF0F172A))
                        }
                    }

                    // Módulo Tipo
                    Surface(
                        color = Color(0xFFF8FAFC),
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier.padding(4.dp)
                    ) {
                        Column(
                            modifier = Modifier.padding(vertical = 10.dp, horizontal = 14.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(text = "Tipo", fontSize = 12.sp, color = Color(0xFF64748B))
                            Spacer(modifier = Modifier.height(4.dp))
                            val tipos = pokemon.tipo.split("/")
                            Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                                tipos.forEach {
                                    BadgeType(tipo = it)
                                }
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                // Sección Versión Shiny
                Surface(
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(0xFFFEF9C3), // amarillo muy suave
                    shape = RoundedCornerShape(14.dp)
                ) {
                    Column(
                        modifier = Modifier.padding(14.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "✨ Versión Shiny",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFA16207)
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        AsyncImage(
                            model = pokemon.imagenShyni,
                            contentDescription = pokemon.nombre,
                            modifier = Modifier.size(130.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                // Sección Descripción / Reporte
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = "Información Biológica",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF0F172A)
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = pokemon.descripcion,
                        fontSize = 14.sp,
                        color = Color(0xFF475569),
                        lineHeight = 20.sp,
                        textAlign = TextAlign.Start
                    )
                    
                    Spacer(Modifier.height(15.dp))

                    Box(modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center){
                        Button(onClick = onBack,
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Red)){
                            Text(text = "Regresar",
                            )
                        }
                    }

                }
            }
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
