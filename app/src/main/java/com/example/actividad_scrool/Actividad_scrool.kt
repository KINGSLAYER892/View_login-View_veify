package com.example.ejercicio
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.actividad_scrool.R
import com.example.actividad_scrool.ui.theme.Orange

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun horizontal_prueba2(){
    val pagerState = rememberPagerState(initialPage = 0) {
        2
    }
    Box(modifier = Modifier){
        HorizontalPager(state = pagerState, modifier = Modifier.fillMaxSize()) {
                page -> when(page){
            0 -> Content2()
            1 -> Content()
        }
        }
    }
}

@Composable
fun Content2() {
    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .weight(2f)
                .fillMaxWidth()

        ) {
            Column {
                Filas2(img = R.drawable.space, descript = "######")
                Text(
                    text = "Welcome to Leamonpie!",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Keep your data safe",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color.Gray
                )
            }
        }
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()

        ) {
            // Contenido de la segunda Box
            TextfileMain()
        }
        Box(
            modifier = Modifier
                .weight(2f)
                .fillMaxWidth()

        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Orange),
                    modifier = Modifier.padding(top = 0.dp)
                ) {
                    Text(
                        text = "VERIFY EMAIL",
                        color = Color.Black
                    )
                }
                Text(
                    text = "Forgot password?",
                    fontSize = 16.sp,
                    color = Orange,
                    modifier = Modifier.padding(top = 16.dp).padding(bottom = 150.dp)
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 46.dp),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Don't have an account? ",
                        fontSize = 15.sp,
                        color = Color.Black
                    )
                    Text(
                        text = "Register!",
                        fontSize = 16.sp,
                        color = Orange
                    )
                }
            }


        }

    }
}


@Composable
fun TextfileMain(){
    var user by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    Box {
        Column (modifier = Modifier.padding(0.dp,20.dp).fillMaxWidth(), verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally){

            OutlinedTextField(value = user,
                onValueChange ={
                    user = it
                },
                label={
                    Text(text = "Email")
                },
                placeholder = {
                    Text(text = "Kevin Sanmartin")
                },

                shape = RoundedCornerShape(20.dp),
                modifier = Modifier.padding(0.dp,0.dp))
            OutlinedTextField(value = password,
                onValueChange ={
                    password = it
                },
                label={
                    Text(text = "Password")
                },
                placeholder = {
                    Text(text = "******")
                },
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier.padding(0.dp,0.dp))

        }
    }
}

@Composable
fun Content() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(modifier = Modifier.height(70.dp)) {

        }
        com.example.actividad_scrool.Filas(img = R.drawable.celular, descript = "Este es el icono")
        Text(text = "Please use the link below to verify your email and start your Journey",
            modifier = Modifier
                .fillMaxWidth()
                .padding(2.dp),
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            color = Color.Gray

        )
        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Orange),
        ) {
            Text(text ="VERIFY EMAIL",
                modifier = Modifier.padding(horizontal = 100.dp),
                color = Color.Black,
                fontSize = 13.sp,
            )
        }
        Box {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Do you have any Question?",
                    modifier = Modifier.padding(10.dp),
                    textAlign = TextAlign.Center,
                    fontSize = 12.sp
                )
                Text(
                    text = "contact@mail.com",
                    color = Orange,
                    modifier = Modifier.padding(2.dp),
                    textAlign = TextAlign.Center,
                    fontSize = 14.sp
                )
            }
        }
    }
}


@Composable
fun Container(){
    Box(modifier = Modifier.fillMaxSize()){
        Content2()
    }
}

@Composable
fun Filas(
    img: Int,
    descript: String,
    modifier: Modifier = Modifier.fillMaxWidth()
){
    Row(modifier = modifier,
        horizontalArrangement = Arrangement.Center){
        Image(painter = painterResource(id = img), contentDescription = descript, modifier = Modifier
            .width(300.dp)
            .height(400.dp))
    }
}

@Composable
fun Filas2(
    img: Int,
    descript: String,
    modifier: Modifier = Modifier.fillMaxWidth()
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = img),
            contentDescription = descript,
            modifier = Modifier
                .width(250.dp)
                .height(250.dp)

        )
    }
}

@Preview(name = "container", showSystemUi = true, device = Devices.DEFAULT)
@Composable
private fun Actividad_1(){
    horizontal_prueba2()
}