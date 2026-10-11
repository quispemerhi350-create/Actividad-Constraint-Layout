package com.example.bloom

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
fun ConstraintExample1() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (boxRed, boxBlue, boxMagenta, boxYellow, boxGreen) = createRefs()

        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Red)
                .constrainAs(boxRed) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom)
                }
        )
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Blue)
                .constrainAs(boxBlue) {
                    bottom.linkTo(boxRed.top)
                    end.linkTo(boxRed.start)
                }
        )
        // Magenta: arriba-derecha de la roja
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Magenta)
                .constrainAs(boxMagenta) {
                    bottom.linkTo(boxRed.top)
                    start.linkTo(boxRed.end)
                }
        )
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Yellow)
                .constrainAs(boxYellow) {
                    top.linkTo(boxRed.bottom)
                    end.linkTo(boxRed.start)
                }
        )
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Green)
                .constrainAs(boxGreen) {
                    top.linkTo(boxRed.bottom)
                    start.linkTo(boxRed.end)
                }
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun ConstraintExample2() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (boxGreen, boxBlue, boxYellow, boxRed, boxMagenta, boxCyan, boxBlack) = createRefs()
        val topGuide = createGuidelineFromTop(0.15f)

        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Green)
                .constrainAs(boxGreen) {
                    top.linkTo(topGuide)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        )
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Blue)
                .constrainAs(boxBlue) {
                    top.linkTo(boxGreen.bottom)
                    end.linkTo(boxGreen.start)
                }
        )
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Yellow)
                .constrainAs(boxYellow) {
                    top.linkTo(boxGreen.bottom)
                    start.linkTo(boxGreen.end)
                }
        )
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Red)
                .constrainAs(boxRed) {
                    top.linkTo(boxBlue.bottom)
                    start.linkTo(boxBlue.end)
                }
        )
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Magenta)
                .constrainAs(boxMagenta) {
                    top.linkTo(boxRed.bottom)
                    end.linkTo(boxRed.start)
                }
        )
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Cyan)
                .constrainAs(boxCyan) {
                    top.linkTo(boxRed.bottom)
                    start.linkTo(boxRed.end)
                }
        )
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Black)
                .constrainAs(boxBlack) {
                    top.linkTo(boxMagenta.bottom)
                    start.linkTo(boxMagenta.end)
                }
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
fun ConstraintExample3() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (boxRed, boxBlue, boxMagenta, boxYellow, boxGreen) = createRefs()
        val (smallCyan, smallBlack1, smallBlack2) = createRefs()

        Box(
            modifier = Modifier
                .size(90.dp)
                .background(Color.Red)
                .constrainAs(boxRed) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom)
                }
        )
        Box(
            modifier = Modifier
                .size(90.dp)
                .background(Color.Blue)
                .constrainAs(boxBlue) {
                    bottom.linkTo(boxRed.top)
                    end.linkTo(boxRed.start)
                }
        )
        Box(
            modifier = Modifier
                .size(90.dp)
                .background(Color.Magenta)
                .constrainAs(boxMagenta) {
                    bottom.linkTo(boxRed.top)
                    start.linkTo(boxRed.end)
                }
        )
        Box(
            modifier = Modifier
                .size(90.dp)
                .background(Color.Yellow)
                .constrainAs(boxYellow) {
                    top.linkTo(boxRed.bottom)
                    end.linkTo(boxRed.start)
                }
        )
        Box(
            modifier = Modifier
                .size(90.dp)
                .background(Color.Green)
                .constrainAs(boxGreen) {
                    top.linkTo(boxRed.bottom)
                    start.linkTo(boxRed.end)
                }
        )

        Box(
            modifier = Modifier
                .size(30.dp)
                .background(Color.Cyan)
                .constrainAs(smallCyan) {
                    bottom.linkTo(boxRed.top)
                    start.linkTo(boxBlue.end)
                }
        )
        Box(
            modifier = Modifier
                .size(30.dp)
                .background(Color.Black)
                .constrainAs(smallBlack1) {
                    bottom.linkTo(smallCyan.top)
                    start.linkTo(smallCyan.end)
                }
        )
        Box(
            modifier = Modifier
                .size(30.dp)
                .background(Color.Black)
                .constrainAs(smallBlack2) {
                    bottom.linkTo(smallBlack1.top)
                    start.linkTo(smallBlack1.end)
                }
        )
    }
}
