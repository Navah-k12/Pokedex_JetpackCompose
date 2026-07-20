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
            descripcion = "Este Pokémon es conocido por ser leal y protector. Suele actuar " +
                    "como mediador en conflictos entre otros Pokémon y absorbe energía solar " +
                    "a través del bulbo en su espalda para fortalecerse.",
            imagen = R.drawable.bulbasaur,
        ),

        Pokemon(
            nombre = "Ivysaur",
            tipo = "Planta / Veneno",
            altura = "1.0 m",
            peso = "13.0 kg",
            descripcion = "",
            imagen = R.drawable.ivysaur
        ),

        Pokemon(
            nombre = "Venusaur",
            tipo = "Planta/Veneno",
            altura = "2.0 m",
            peso = "100.0 kg",
            descripcion = "",
            imagen = R.drawable.venusaur
        ),

        Pokemon(
            nombre = "Raycuaza",
            tipo = "Legendario",
            altura = "7.0 m",
            peso = "100 kg",
            descripcion = "",
            imagen = R.drawable.rayquaza
        ),
        Pokemon(
            nombre = "Lugia",
            tipo = "Legendario",
            altura = "5.0 m",
            peso = "150 kg",
            descripcion = "",
            imagen = R.drawable.lugia
        ),

        Pokemon(
            nombre = "Lugia",
            tipo = "Legendario",
            altura = "5.0 m",
            peso = "150 kg",
            descripcion = "",
            imagen = R.drawable.mewtwo
        ),
        Pokemon(
            nombre = "Gyarados",
            tipo = "Legendario",
            altura = "5.0 m",
            peso = "150 kg",
            descripcion = "",
            imagen = R.drawable.gyarados
        ),        Pokemon(
            nombre = "Gyarados",
            tipo = "Legendario",
            altura = "5.0 m",
            peso = "150 kg",
            descripcion = "",
            imagen = R.drawable.mimikyushyni
        ),
        Pokemon(
            nombre = "Gyarados",
            tipo = "Legendario",
            altura = "5.0 m",
            peso = "150 kg",
            descripcion = "",
            imagen = R.drawable.eevee
        ),
        Pokemon(
            nombre = "Lugia",
            tipo = "Legendario",
            altura = "5.0 m",
            peso = "150 kg",
            descripcion = "",
            imagen = R.drawable.umbreon
        )
    )

}