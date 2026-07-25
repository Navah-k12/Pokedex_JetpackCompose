package com.example.pokedex.model

/**
 * Project: Pokédex
 * From: com.example.Pokédex.model
 * Created by: navah
 * On: 3/7/26
 * All rights reserved: 2026
 */
// MODEL es la frabrica, donde van todas las clases que va a reprecentar todos los datos


data class Pokemon(
    // Es una ficha o model,
    // Es como una fabrica
    val nombre: String,
    val tipo : String,
    val altura : String,
    val peso : String,
    val descripcion : String,
    val imagen : Int,
    val imagenShyni : Int
)

