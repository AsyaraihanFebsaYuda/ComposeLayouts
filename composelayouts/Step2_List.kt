package com.example.composelayouts

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import com.example.composelayouts.ui.theme.ComposeLayoutsTheme

@Composable
fun Step2SimpleList() {
    val names = listOf("Android", "Jetpack", "Compose", "Layouts", "Codelab")

    LazyColumn(modifier = Modifier.padding(16.dp)) {
        items(names) { name ->
            Text(text = "Hello $name!", modifier = Modifier.padding(8.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Step2SimpleListPreview() {
    ComposeLayoutsTheme {
        Step2SimpleList()
    }
}
