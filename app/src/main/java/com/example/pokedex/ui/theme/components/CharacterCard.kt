package com.example.pokedex.ui.theme.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.pokedex.data.CharacterRepository
import com.example.pokedex.model.Character

/**
 * Project: Pokédex
 * From: com.example.Pokédex.ui.theme.components
 * Created by: navah
 * On: 24/7/26
 * All rights reserved: 2026
 */

@Composable
fun CharacterCard(character: Character, onClick: () -> Unit){

    Column(Modifier.fillMaxWidth().padding(15.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Card(modifier = Modifier.fillMaxWidth()
            .clickable{onClick()},
            elevation = CardDefaults.cardElevation(6.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White)
        ) {
            Column(modifier = Modifier.fillMaxWidth().padding(40.dp),
                horizontalAlignment = Alignment.CenterHorizontally)
            {
                Surface(
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(0xFFEFF6FF),
                    shape = RoundedCornerShape(18.dp),

                ) {

                    AsyncImage(model = character.imagen,
                        contentDescription = character.nombre,
                        modifier = Modifier.size(150.dp).padding(10.dp)

                    )
                }

                Spacer(Modifier.height(20.dp))

                Text(text = character.nombre,fontSize = 20.sp,
                    fontWeight = FontWeight.Bold)
                Surface(
                    color = Color(0xFFFCFDFF),
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier.padding(4.dp).fillMaxWidth()
                ) {
                    Text(text = character.descripcion, Modifier.padding(8.dp))
                }

            }
        }
    }



}

@Preview(showSystemUi = true)
@Composable
fun CharacterCardPreview(){
    CharacterCard(
        character = CharacterRepository.characters[0],
    ) {}
}
