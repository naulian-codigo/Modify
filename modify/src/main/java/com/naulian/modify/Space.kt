package com.naulian.modify

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun HorizontalSpace(width: Dp = 12.dp, modifier: Modifier = Modifier) {
    Spacer(modifier = modifier.width(width))
}

@Composable
fun MSpacer(width: Dp = 0.dp, height: Dp = 0.dp, modifier: Modifier = Modifier) {
    Spacer(modifier = modifier
        .width(width)
        .height(height))
}

@Preview
@Composable
private fun HorizontalSpacePreview() {
    Row {
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.White)
        )
        HorizontalSpace(100.dp)
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.White)
        )
    }
}

@Composable
fun VerticalSpace(height: Dp = 12.dp, modifier: Modifier = Modifier) {
    Spacer(modifier = modifier.height(height))
}

@Preview
@Composable
private fun VerticalSpacePreview() {
    Column {
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.White)
        )
        VerticalSpace(100.dp)
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.White)
        )
    }
}