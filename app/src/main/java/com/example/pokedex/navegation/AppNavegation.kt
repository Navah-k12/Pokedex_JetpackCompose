package com.example.pokedex.navegation

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pokedex.data.PokemonRepo
import com.example.pokedex.ui.theme.screens.DetailsPokemon
import com.example.pokedex.ui.theme.screens.HomeScreen
import com.example.pokedex.ui.theme.screens.PokemonScreen
import com.example.pokedex.ui.theme.screens.CharaterScreen



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


    BackHandler(enabled = true) {
        if (!navController.popBackStack()) {
            (navController.context as? android.app.Activity)?.finish()
        }
    }

    // NavHost Construye el gráfico de navegación
    NavHost(
        navController = navController,
        startDestination = "Home"
    ){
        composable("Home"){
            HomeScreen(
                onNavigate ={
                    navController.navigate(route = "Character")

                }
            )
        }
        composable("Character"){
            CharaterScreen(
                onNavigate = {
                    navController.navigate("listaPokemones"){
                        launchSingleTop = true
                    }

                },
                onBack = { navController.popBackStack() }
            )
        }
         composable("listaPokemones"){
             PokemonScreen(
                 onNavigate = { nombrePokemon ->
                     navController.navigate("details/${nombrePokemon}") {
                         launchSingleTop = true
                     }
                 },
                 onBack = { navController.popBackStack() }
             )
         }

        composable("details/{nombrePokemon}"){ backStackEntry -> // Pantalla actuañ de la pila
            // Se extare el nombre del pokemon de la ruta
            val nombrePokemon = backStackEntry.arguments?.getString("nombrePokemon")
            // Buscamos el objeto pokemon en la base de datos con el nombre
            val pokemon = PokemonRepo.pokemones.firstOrNull { it.nombre == nombrePokemon }

            if(pokemon != null){
                DetailsPokemon(
                    pokemon = pokemon,
                    onBack = {
                        if (navController.previousBackStackEntry != null){
                            navController.popBackStack()
                        }

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
