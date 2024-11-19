package com.example.shakeit.ui.elements

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shakeit.ui.theme.Pontiac
import com.example.shakeit.ui.theme.Typography
import androidx.compose.material3.Icon
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration
import com.example.shakeit.R


@OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
@Composable
fun InputFields(
    onForgotPasswordClick: () -> Unit = {} // Aggiungi un'azione per "Forgot Password"
)  {
    val username = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 32.dp, vertical = 20.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        // Campo Username
        OutlinedTextField(
            value = username.value,
            onValueChange = { username.value = it },
            placeholder = { Text(
                text = "Username",
                style = Typography.bodyMedium
            ) },
            leadingIcon = {
                Image(
                    painter = painterResource(id = R.drawable.alt_email),
                    contentDescription = "Email Icon",
                    modifier = Modifier.size(24.dp)
                )
            },
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.outlinedTextFieldColors(
            containerColor = Color(0xFFE0E0E0), // Background color
            focusedBorderColor = Color(0xFF4742A7), // Colore del bordo quando la casella è selezionata
            unfocusedBorderColor = Color(0xFFBDBDBD) // Colore del bordo quando la casella non è selezionata
            ),
            shape = RoundedCornerShape(30.dp)
        )

        // Campo Password
        OutlinedTextField(
            value = password.value,
            onValueChange = { password.value = it },
            placeholder = { Text(
                text = "Password",
                style = Typography.bodyMedium
            ) },
            leadingIcon = {
                Icon(Icons.Filled.Lock, contentDescription = "Password Icon")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                containerColor = Color(0xFFE0E0E0), // Background color
                focusedBorderColor = Color(0xFF4742A7), // Colore del bordo quando la casella è selezionata
                unfocusedBorderColor = Color(0xFFBDBDBD) // Colore del bordo quando la casella non è selezionata
            ),
            shape = RoundedCornerShape(30.dp),
            visualTransformation = androidx.compose.ui.text.input.PasswordVisualTransformation()
        )

        Text(
            text = "Forgot Password?",
            color = Color.White,
            style = Typography.bodySmall,
            textDecoration = TextDecoration.Underline,
            modifier = Modifier
                .align(Alignment.End)
                .clickable { onForgotPasswordClick() }
                .padding(end = 10.dp)
        )
    }
}
