package com.example.actividad_scrool
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun LazyContent(){
    Box(modifier = Modifier.fillMaxSize()){
        simpleLazyRow()
        simpleLazyColum()
    }
}

@Composable
fun simpleLazyRow(){
    val items = listOf("item1","item2","item3","item4","item5","item6","item7","item8")

    LazyRow(modifier = Modifier.fillMaxWidth()){
        items(items){item -> Text(text = item, modifier = Modifier.padding(16.dp) ) }
    }
}

@Composable
fun simpleLazyColum(){
    val items = listOf("item1","item2","item1","item2","item1","item2","item1","item2","item1","item2","item3","item4","item5","item6","item7","item8","item7","item8","item7","item8",)

    LazyColumn(modifier = Modifier.fillMaxHeight()){
        items(items){item -> Text(text = item, modifier = Modifier.padding(16.dp)) }
    }
}

@Preview
@Composable
private fun Result(){
    LazyContent()
}