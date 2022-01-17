package com.geno1024.ophelper

import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.window.Tray
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

object Main
{
    fun main() = application {
        Tray(icon = Images.launcher)
        Window(onCloseRequest = ::exitApplication) {
            MaterialTheme() {
                Button(onClick = {

                }) {
                    Text("Add Op", fontFamily = FontFamily.Monospace)
                }
            }
        }
    }
}

fun main() = Main.main()
