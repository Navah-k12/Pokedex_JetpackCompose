package com.example.pokedex.data

import com.example.pokedex.R
import com.example.pokedex.model.Pokemon // Importamos cada constructor

/**
 * Project: Pokédex
 * From: com.example.Pokédex.data
 * Created by: navah
 * On: 3/7/26
 * All rights reserved: 2026
 */

// En DATA van los datos de los elementos que estamos construyendo

// Al ser un objeto se habre con {}
object PokemonRepo {
//    val bulbasaur = Pokemon(
//        nombre = "Bulbasaur",
//        tipo = "Planta / Veneno",
//        altura = "0.7 cm",
//        peso = "6.9 kg",
//        imagen = R.drawable.bulbasaur
//    )


    // Base de datos Estatica
    val pokemones = listOf(
        Pokemon(
            nombre = "Bulbasaur",
            tipo = "Planta / Veneno",
            altura = "0.7",
            peso = "6.9 kg",
            imagen = R.drawable.bulbasaur,
        ),

        Pokemon(
            nombre = "Ivysaur",
            tipo = "Planta / Veneno",
            altura = "1.0 m",
            peso = "13.0 kg",
            imagen = R.drawable.ivysaur
        ),

        Pokemon(
            nombre = "Venusaur",
            tipo = "Planta / Veneno",
            altura = "2.0 m",
            peso = "100.0 kg",
            imagen = R.drawable.venusaur
        )
    )

}