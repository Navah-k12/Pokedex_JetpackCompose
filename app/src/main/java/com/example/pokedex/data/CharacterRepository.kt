package com.example.pokedex.data

import com.example.pokedex.R
import com.example.pokedex.model.Character

/**
 * Project: Pokédex
 * From: com.example.Pokédex.data
 * Created by: navah
 * On: 24/7/26
 * All rights reserved: 2026
 */
object CharacterRepository {

    val characters = listOf(
        Character(
            nombre = "Red",
            descripcion = "",
            imagen = R.drawable.rojopersonaje
        ),

        Character(
            nombre = "Nadadora",
            descripcion = "",
            imagen = R.drawable.nadadoracharacter
        ),

        Character(
            nombre = "Ranger",
            descripcion = "",
            imagen = R.drawable.ragercharacter
        )
    )


}