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
            descripcion = "El legendario Entrenador de Pueblo Paleta. Silencioso, decidido y de" +
                    " pocas palabras, es ampliamente considerado como uno de los más fuertes de la " +
                    "historia tras conquistar la Liga Añil y superar numerosos desafíos.",
            imagen = R.drawable.rojopersonaje
        ),

        Character(
            nombre = "Nadadora",
            descripcion = "Una Entrenadora experta en la vida marina y los combates" +
                    " acuáticos. Siempre lista para nadar junto a sus Pokémon de tipo Agua y " +
                    "explorar rutas oceánicas.",
            imagen = R.drawable.nadadoracharacter
        ),

        Character(
            nombre = "Ranger",
            descripcion = "Miembro de la Unión de Élite de los Pokémon Rangers. Su labor principal" +
                    " es proteger la naturaleza, cuidar el hábitat silvestre y resolver emergencias " +
                    "usando la amistad con los Pokémon en lugar de capturarlos.",
            imagen = R.drawable.ragercharacter
        )
    )


}