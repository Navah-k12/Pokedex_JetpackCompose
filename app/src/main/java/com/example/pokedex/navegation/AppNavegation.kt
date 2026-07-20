package com.example.pokedex.navegation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pokedex.data.PokemonRepo
import com.example.pokedex.ui.theme.screens.DetailsPokemon
import com.example.pokedex.ui.theme.screens.PokemonScreen


/**
 * Project: Pokédex
 * From: com.example.Pokédex.navegation
 * Created by: navah
 * On: 18/7/26
 * All rights reserved: 2026
 */

@Composable
fun AppNavegation(){

    val navController = rememberNavController()

    // NavHost Construye el gráfico de navegación
    NavHost(
        navController = navController,
        startDestination = "ListaPokemones"
    ){
         composable( "ListaPokemones"){
             PokemonScreen(// Llamamos la funcion a la cual nos va a redirigir
                 onNavigate = { // Se crea un UNIt en la funcion a donde se navegara
                     pokemonNombre ->
                     navController.navigate("details/${pokemonNombre}")
                 }
             )

         }

        composable("details/{pokemonNombre}"){ backStackEntry -> //
            // Se extare el nombre del pokemon de la ruta
            val pokemonNombre = backStackEntry.arguments?.getString("pokemonNombre")
            // Buscamos el objeto pokemon en la base de datos con el nombre
            val pokemon = PokemonRepo.pokemones.firstOrNull { it.nombre == pokemonNombre }

            if(pokemon != null){
                DetailsPokemon(
                    pokemon = pokemon,
                    onBack = {
                        navController.popBackStack()
                    }
                )
            }

        }

    }
}

@Preview(showSystemUi = true)
@Composable
fun AppNavegationPreview(){
    AppNavegation()
}