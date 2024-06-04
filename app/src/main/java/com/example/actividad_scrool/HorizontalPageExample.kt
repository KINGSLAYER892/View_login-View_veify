package com.example.actividad_scrool
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun horizontal_prueba(){
    val pagerState = rememberPagerState(initialPage = 0) {
        3
    }
    Box(modifier = Modifier){
        HorizontalPager(state = pagerState, modifier = Modifier.fillMaxSize()) {
                page -> when(page){
            0 -> cajamain1(page)
            1 -> cajamain2(page)
            2 -> cajamain3(page)
        }
        }
    }
}


@Composable
fun cajamain1(contect:Int){
    Box(modifier = Modifier.fillMaxSize()){
        Text(text = "hola estas en $contect")
    }
}

@Composable
fun cajamain2(contect:Int){
    Box(modifier = Modifier.fillMaxSize()){
        Text(text = "hola estas en $contect")
    }
}

@Composable
fun cajamain3(contect:Int){
    Box(modifier = Modifier.fillMaxSize()){
        Text(text = "hola estas en $contect")
    }
}

@Preview
@Composable
private fun scrool(){
    horizontal_prueba()
}
