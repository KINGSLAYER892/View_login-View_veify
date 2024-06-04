package com.example.actividad_scrool

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.actividad_scrool.ui.theme.Orange





@Composable
fun Main() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
    ) {
        Content()
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
        Filas(img = R.drawable.celular, descript = "Este es el icono")
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
fun Filas(
    img : Int,
    descript: String,
    modifier: Modifier = Modifier.fillMaxWidth(),
    imgmodifier: Modifier = Modifier
){
    Row (modifier = modifier,
        horizontalArrangement = Arrangement.Center){
        Image(painter = painterResource(id = img),
            contentDescription = descript,
            modifier = Modifier
                .width(350.dp)
                .height(350.dp))
    }
}

@Preview(showSystemUi = true, device = Devices.DEFAULT)
@Composable
fun PreviewMain() {
    Main()
}
