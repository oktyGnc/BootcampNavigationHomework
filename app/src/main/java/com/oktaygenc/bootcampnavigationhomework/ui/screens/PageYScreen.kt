package com.oktaygenc.bootcampnavigationhomework.ui.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.oktaygenc.bootcampnavigationhomework.ui.theme.seftali

@Composable
fun PageYScreen(navController: NavHostController) {
    BackHandler {
        navController.navigate("home") {
            popUpTo(navController.graph.startDestinationId) { inclusive = true }
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(seftali),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            "Y Sayfası Yani Son Durak :)",
            modifier = Modifier.align(Alignment.CenterHorizontally),
            fontSize = 30.sp,
            color = Color.Black,
            fontWeight = FontWeight.ExtraBold
        )
        Text(
            "Geri dönmek için istersen 'ANA SAYFA'YA DÖN' tuşuna veya geri tuşuna basabilirsin",
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 100.dp, start = 10.dp),
            fontSize = 17.sp,
            color = Color.Black,
            fontWeight = FontWeight.ExtraBold
        )
        Button(
            onClick = { navController.popBackStack("home", inclusive = false) },
            modifier = Modifier.padding(top = 40.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Red, contentColor = Color.White
            )
        ) {
            Text("ANA SAYFA'YA DÖN")
        }
    }
}

