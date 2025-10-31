package com.example.composelayouts

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composelayouts.ui.theme.ComposeLayoutsTheme

@Composable
fun Step3LayoutExample() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Top Text", style = MaterialTheme.typography.titleLarge)
        Spacer(modifier = Modifier.height(8.dp))
        Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
            Text("Left Item")
            Text("Right Item")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Bottom Text")
    }
}

@Preview(showBackground = true)
@Composable
fun Step3LayoutPreview() {
    ComposeLayoutsTheme {
        Step3LayoutExample()
    }
}
