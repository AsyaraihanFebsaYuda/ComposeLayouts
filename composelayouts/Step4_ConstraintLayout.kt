package com.example.composelayouts

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.composelayouts.ui.theme.ComposeLayoutsTheme

@Composable
fun Step4ConstraintExample() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (title, subtitle) = createRefs()

        Text(
            text = "ConstraintLayout Example",
            modifier = Modifier.constrainAs(title) {
                top.linkTo(parent.top, margin = 40.dp)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        )

        Text(
            text = "Using Jetpack Compose",
            modifier = Modifier.constrainAs(subtitle) {
                top.linkTo(title.bottom, margin = 16.dp)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Step4ConstraintPreview() {
    ComposeLayoutsTheme {
        Step4ConstraintExample()
    }
}
