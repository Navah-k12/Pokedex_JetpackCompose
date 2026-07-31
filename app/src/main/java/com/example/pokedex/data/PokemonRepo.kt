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
            imagenShyni = R.drawable.bulbasaurshiny
        ),

        Pokemon(
            nombre = "Ivysaur",
            tipo = "Planta / Veneno",
            altura = "1.0 m",
            peso = "13.0 kg",
            descripcion = "Cuando el bulbo en su espalda comienza a florecer, indica que su " +
                    "evolución está cerca. Pasa gran parte del tiempo bajo la luz del sol, lo que " +
                    "le otorga la energía necesaria para desarrollar su poderosa planta.",
            imagen = R.drawable.ivysaur,
            imagenShyni = R.drawable.ivysaurshiny
        ),

        Pokemon(
            nombre = "Venusaur",
            tipo = "Planta/Veneno",
            altura = "2.0 m",
            peso = "100.0 kg",
            descripcion = "Posee una gran flor en su espalda que emite un aroma dulce capaz de " +
                    "calmar a otros Pokémon. Es un Pokémon imponente y tranquilo que utiliza la" +
                    " energía solar para ejecutar ataques devastadores.",
            imagen = R.drawable.venusaur,
            imagenShyni = R.drawable.venusaurshiny
        ),

        Pokemon(
            nombre = "Raycuaza",
            tipo = "Dragón/Volador",
            altura = "7.0 m",
            peso = "100 kg",
            descripcion = "Posee una gran flor en su espalda que emite un aroma dulce capaz de " +
                    "calmar a otros Pokémon. Es un Pokémon imponente y tranquilo que utiliza la " +
                    "energía solar para ejecutar ataques devastadores.",
            imagen = R.drawable.rayquaza,
            imagenShyni = R.drawable.rayquazashiny
        ),
        Pokemon(
            nombre = "Lugia",
            tipo = "Psíquico/Volador",
            altura = "5.0 m",
            peso = "150 kg",
            descripcion = "Conocido como el guardián de los mares, posee un poder tan inmenso que" +
                    " debe vivir en las profundidades del océano para no causar tormentas " +
                    "devastadoras con el simple aleteo de sus alas.",
            imagen = R.drawable.lugia,
            imagenShyni = R.drawable.lugiashiny
        ),

        Pokemon(
            nombre = "Mewtwo",
            tipo = "Psíquico",
            altura = "5.0 m",
            peso = "150 kg",
            descripcion = "Creado artificialmente a partir del ADN del Pokémon singular Mew, " +
                    "posee un poder psíquico abrumador y una inteligencia superior, lo que lo " +
                    "convierte en uno de los Pokémon más poderosos que existen.",
            imagen = R.drawable.mewtwo,
            imagenShyni = R.drawable.mewtwoshiny
        ),
        Pokemon(
            nombre = "Gyarados",
            tipo = "Agua/Volador",
            altura = "5.0 m",
            peso = "150 kg",
            descripcion = "Feroz y destructivo por naturaleza, se dice que es capaz de arrasar " +
                    "ciudades enteras cuando se enfurece. Aparece en medio de grandes tormentas" +
                    " y es conocido por su temperamento explosivo.",
            imagen = R.drawable.gyarados,
            imagenShyni = R.drawable.gyaradosshiny
        ),
        Pokemon(
            nombre = "Mimikyu",
            tipo = "Fantasma/Hada",
            altura = "5.0 m",
            peso = "150 kg",
            descripcion = "Un Pokémon solitario que se cubre con un saco que imita a Pikachu para" +
                    " intentar hacer amigos. Prefiere la oscuridad y se dice que su verdadera forma" +
                    " es tan aterradora que no debe ser vista.",
            imagen = R.drawable.mimikyu,
            imagenShyni = R.drawable.mimikyushyni
        ),
        Pokemon(
            nombre = "Eevee",
            tipo = "Normal",
            altura = "5.0 m",
            peso = "150 kg",
            descripcion = "Posee una estructura genética inestable que le permite evolucionar en" +
                    " diversas formas dependiendo34 del entorno o los estímulos que reciba, " +
                    "adaptándose a múltiples situaciones.",
            imagen = R.drawable.eevee,
            imagenShyni = R.drawable.eeveeshyni
        ),
        Pokemon(
            nombre = "Umbreom",
            tipo = "Siniestro",
            altura = "5.0 m",
            peso = "150 kg",
            descripcion = "Este Pokémon evoluciona al ser expuesto a la energía lunar. Sus anillos " +
                    "brillan cuando se siente amenazado o bajo la luz de la luna, y es conocido por " +
                    "su gran capacidad defensiva.",
            imagen = R.drawable.umbreon,
            imagenShyni = R.drawable.umbreonshiny
        ),
        Pokemon(
            nombre = "Excadrill",
            tipo = "Tierra/Acero",
            altura = "0.7 m",
            peso = "40.4 kg",
            descripcion = "Excava túneles a gran velocidad girando su cuerpo como un taladro. " +
                    "Es capaz de perforar incluso planchas de hierro.",
            imagen = R.drawable.excadrill,
            imagenShyni = R.drawable.excadrillshiny
        ),
        Pokemon(
            nombre = "Garchomp",
            tipo = "Dragón / Tierra",
            altura = "1.9 m",
            peso = "95.0 kg",
            descripcion = "Vuela a una velocidad increíble para atrapar a sus presas. " +
                    "Sus alas son finas y afiladas, capaces de cortar árboles.",
            imagen = R.drawable.garchomp,
            imagenShyni = R.drawable.garchompshiny

        ),
        Pokemon(
            nombre = "Hawlucha",
            tipo = "Lucha / Volador",
            altura = "0.8 m",
            peso = "21.5 kg",
            descripcion = "Lucha con acrobacias aéreas y ataques vistosos. Le gusta el " +
                    "espectáculo y tiende a posar antes de dar el golpe final.",
            imagen = R.drawable.hawlucha,
            imagenShyni = R.drawable.hawluchashiny
        ),
        Pokemon(
            nombre = "Mew",
            tipo = "Psíquico",
            altura = "0.4 m",
            peso = "4.0 kg",
            descripcion = "Se dice que posee el ADN de todos los Pokémon existentes. " +
                    "Puede hacerse invisible a voluntad y aprender cualquier movimiento.",
            imagen = R.drawable.mew,
            imagenShyni = R.drawable.mewtwoshiny
        ),
        Pokemon(
            nombre = "Tyrantrum",
            tipo = "Roca / Dragón",
            altura = "2.5 m",
            peso = "270.0 kg",
            descripcion = "Dominaba el mundo hace 100 millones de años." +
                    " Sus mandíbulas son tan potentes que pueden triturar coches.",
            imagen = R.drawable.tyrantrum,
            imagenShyni = R.drawable.tyrantrumshiny
        ),
        Pokemon(
            nombre = "Tyranitar",
            tipo = "Roca / Siniestro",
            altura = "2.0 m",
            peso = "202.0 kg",
            descripcion = "Es tan fuerte que puede cambiar el paisaje con sus movimientos. " +
                    "Posee una piel extremadamente dura y resistente.",
            imagen = R.drawable.tyranitar,
            imagenShyni = R.drawable.tyranitarshiny
        )

    )

}