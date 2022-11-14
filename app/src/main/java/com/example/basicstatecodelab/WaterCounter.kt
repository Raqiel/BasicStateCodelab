package com.example.basicstatecodelab

import WellnessTaskItem
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp



@Composable
fun WaterCounter(modifier : Modifier = Modifier) {

    Column(
        modifier = modifier.padding(16.dp)
    ) {
        var count by remember  {mutableStateOf(0)}
        if (count > 0) {
            var showTask by rememberSaveable { mutableStateOf(true) }
            if (showTask) {
                WellnessTaskItem(
                    taskName = "Você caminhou 15 minutos hoje?",
                    onClose = { showTask = false  })
            }
            Text(
                text = "Você tomou $count copos de agua.",

                )}
        Row(Modifier.padding(top = 8.dp)) {
            Button(
                onClick = {
                    count++
                },
                Modifier.padding(top= 8.dp),enabled = count < 10)  {
                Text("Adicionar um copo")

            }

        }
    }
}

