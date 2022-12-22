package com.brian.tictactoe.presentation

import androidx.compose.foundation.Canvas
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.brian.tictactoe.data.GameState

@Composable
fun TicTacToeField(
    state: GameState,
    modifier: Modifier = Modifier,
    playerXColor: Color = Color.Green,
    playerOColor: Color = Color.Red,
    onTapInField: (x: Int, y: Int) -> Unit
) {
    Canvas(
        modifier = modifier,
    ) {

    }

}

private fun DrawScope.drawField() {
    // 1st vertical line
    drawLine(
        color = Color.Black,
        start = Offset(
            x = size.width * (1 / 3f),
            y = 0f
        ),
        end = Offset(
            x = size.width * (2 / 3f),
            y = size.height
        ),
        strokeWidth = 3.dp.toPx(),
        cap = StrokeCap.Round
    )
}

@Preview
@Composable
fun TicTacToeFieldPreview() {
    
}