package com.example.shakeit.ui.elements

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.shakeit.R
import com.example.shakeit.ui.theme.Typography

@Composable
fun RegisterPage(navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopCenter
    ) {
        // Background
        Background()

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                painter = painterResource(id = R.drawable.arrow_back),
                contentDescription = "Back to Login",
                tint = Color.White,
                modifier = Modifier
                    .align(Alignment.Start)
                    .padding(start = 5.dp, top = 20.dp)
                    .clickable { navController.navigate("login") }
            )
            // Logo and title
            Logo(size = 140.dp)
            Text(
                text = "Create account",
                style = Typography.titleLarge,
                color = Color.White,
                modifier = Modifier.padding(top = 8.dp)
            )
            Text(
                text = "Already have an account? Login",
                style = Typography.headlineMedium,
                color = Color.White,
                modifier = Modifier.padding(top = 4.dp)
            )

            Spacer(modifier = Modifier.height(24.dp))

            RegisterForm()
        }
    }
}
