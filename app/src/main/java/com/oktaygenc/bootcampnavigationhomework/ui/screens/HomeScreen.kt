package com.oktaygenc.bootcampnavigationhomework.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.oktaygenc.bootcampnavigationhomework.ui.theme.AcikGri

@Composable
fun HomeScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AcikGri),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            "Anasayfa",
            modifier = Modifier.align(Alignment.CenterHorizontally),
            fontSize = 40.sp,
            color = Color.Black,
            fontWeight = FontWeight.ExtraBold
        )
        Button(onClick = { navController.navigate("pageA") }) {
            Text("GİT > A")
        }
        Button(onClick = { navController.navigate("pageX") }) {
            Text("GİT > X")
        }
    }
}
