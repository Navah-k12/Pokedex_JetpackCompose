package com.example.pokedex.model

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Project: Pokédex
 * From: com.example.Pokédex.model
 * Created by: navah
 * On: 23/7/26
 * All rights reserved: 2026
 */

@Composable
fun obtenerColorTipo(tipo: String): Pair<Color, Color>{
    val colorTipo = tipo.trim()
    return when{
        colorTipo.contains("Planta") -> Pair(Color(0xFFDCFCE7), Color(0xFF15803D))
        colorTipo.contains("Veneno") -> Pair(Color(0xFFF3E8FF), Color(0xFF7E22CE))
        colorTipo.contains("Fuego") -> Pair(Color(0xFFFFEDD5), Color(0xFFC2410C))
        colorTipo.contains("Agua") -> Pair(Color(0xFFE0F2FE), Color(0xFF0369A1))
        colorTipo.contains("Electr") -> Pair(Color(0xFFFEF9C3), Color(0xFFA16207))
        colorTipo.contains("Drag") -> Pair(Color(0xFFE0E7FF), Color(0xFF3730A3))
        colorTipo.contains("Fantasma") -> Pair(Color(0xFFF3E8FF), Color(0xFF581C87))
        colorTipo.contains("Normal") -> Pair(Color(0xFFF1F5F9), Color(0xFF475569))
        colorTipo.contains("Psíquico") -> Pair(Color(0xFFFCE7F3), Color(0xFFBE185D))
        colorTipo.contains("Hada") -> Pair(Color(0xFFFDF2F8), Color(0xFF9D174D))
        colorTipo.contains("Lucha") -> Pair(Color(0xFFFEE2E2), Color(0xFFB91C1C))
        colorTipo.contains("Tierra") -> Pair(Color(0xFFFED7AA), Color(0xFF9A3412))
        colorTipo.contains("Roca") -> Pair(Color(0xFFE5E7EB), Color(0xFF374151))
        colorTipo.contains("Volador") -> Pair(Color(0xFFE0F2FE), Color(0xFF075985))
        colorTipo.contains("Bicho") -> Pair(Color(0xFFECFCCB), Color(0xFF3F6212))
        colorTipo.contains("Hielo") -> Pair(Color(0xFFE0F2FE), Color(0xFF0E7490))
        colorTipo.contains("Siniestro") -> Pair(Color(0xFFE5E7EB), Color(0xFF1F2937))
        else -> Pair(Color(0xFFF1F5F9), Color(0xFF475569))
    }
}


@Composable
fun BadgeType(tipo: String){

    val (colorFondo, colorTexto) = obtenerColorTipo(tipo)

    Surface(
        color = colorFondo,
        shape = RoundedCornerShape(50)
    ){
        Text(
            text = tipo.trim(),
            color = colorTexto,
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)
        )
    }

}


