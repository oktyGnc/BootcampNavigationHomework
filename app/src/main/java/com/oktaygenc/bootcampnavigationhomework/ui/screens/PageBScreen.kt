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
import com.oktaygenc.bootcampnavigationhomework.ui.theme.naneYesil

@Composable
fun PageBScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(naneYesil),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            "B Sayfası",
            modifier = Modifier.align(Alignment.CenterHorizontally),
            fontSize = 40.sp,
            color = Color.Black,
            fontWeight = FontWeight.ExtraBold
        )

        Button(onClick = { navController.navigate("pageY") }) {
            Text("GİT > Y")
        }
    }
}
