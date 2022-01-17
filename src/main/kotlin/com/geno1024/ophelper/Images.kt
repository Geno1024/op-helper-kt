package com.geno1024.ophelper

import androidx.compose.ui.graphics.toPainter
import javax.imageio.ImageIO

object Images
{
    val launcher = ImageIO.read(ClassLoader.getSystemResource("images/op.png")).toPainter()
}
