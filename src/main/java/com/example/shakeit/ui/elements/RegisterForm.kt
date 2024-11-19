package com.example.shakeit.ui.elements

import android.app.DatePickerDialog
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shakeit.R
import com.example.shakeit.ui.theme.Pontiac

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterForm() {
    val name = remember { mutableStateOf("") }
    val email = remember { mutableStateOf("") }
    val phoneNumber = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }


    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        // Campo Nome
        OutlinedTextField(
            value = name.value,
            onValueChange = { name.value = it },
            placeholder = { Text("Name", style = TextStyle(fontSize = 12.sp, fontFamily = Pontiac, color = Color.Gray)) },
            leadingIcon = {
                Image(
                    painter = painterResource(id = R.drawable.ic_person),
                    contentDescription = "Name Icon",
                    modifier = Modifier.size(15.dp)
                )
            },
            textStyle = TextStyle(fontSize = 12.sp, fontFamily = Pontiac, color = Color.Black),
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black,
                cursorColor = Color.Black,
                containerColor = Color(0xFFE0E0E0),
                focusedBorderColor = Color(0xFF6C63FF),
                unfocusedBorderColor = Color(0xFFBDBDBD)
            ),
            shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)
        )

        // Campo Email
        OutlinedTextField(
            value = email.value,
            onValueChange = { email.value = it },
            placeholder = { Text("Email", style = TextStyle(fontSize = 12.sp, fontFamily = Pontiac, color = Color.Gray)) },
            leadingIcon = {
                Image(
                    painter = painterResource(id = R.drawable.ic_email),
                    contentDescription = "Email Icon",
                    modifier = Modifier.size(15.dp)
                )
            },
            textStyle = TextStyle(fontSize = 12.sp, fontFamily = Pontiac, color = Color.Black),
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black,
                cursorColor = Color.Black,
                containerColor = Color(0xFFE0E0E0),
                focusedBorderColor = Color(0xFF6C63FF),
                unfocusedBorderColor = Color(0xFFBDBDBD)
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )

        // Campo Numero di Telefono
        OutlinedTextField(
            value = phoneNumber.value,
            onValueChange = { phoneNumber.value = it },
            placeholder = { Text("Phone Number", style = TextStyle(fontSize = 12.sp, fontFamily = Pontiac, color = Color.Gray)) },
            leadingIcon = {
                Image(
                    painter = painterResource(id = R.drawable.ic_phone),
                    contentDescription = "Phone Icon",
                    modifier = Modifier.size(15.dp)
                )
            },
            textStyle = TextStyle(fontSize = 12.sp, fontFamily = Pontiac, color = Color.Black),
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black,
                cursorColor = Color.Black,
                containerColor = Color(0xFFE0E0E0),
                focusedBorderColor = Color(0xFF6C63FF),
                unfocusedBorderColor = Color(0xFFBDBDBD)
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
        )

        // Campo Password
        OutlinedTextField(
            value = password.value,
            onValueChange = { password.value = it },
            placeholder = { Text("Password", style = TextStyle(fontSize = 12.sp, fontFamily = Pontiac, color = Color.Gray)) },
            leadingIcon = {
                Image(
                    painter = painterResource(id = R.drawable.ic_lock),
                    contentDescription = "Password Icon",
                    modifier = Modifier.size(15.dp)
                )
            },
            textStyle = TextStyle(fontSize = 12.sp, fontFamily = Pontiac, color = Color.Black),
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp),
            visualTransformation = PasswordVisualTransformation(),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black,
                cursorColor = Color.Black,
                containerColor = Color(0xFFE0E0E0),
                focusedBorderColor = Color(0xFF6C63FF),
                unfocusedBorderColor = Color(0xFFBDBDBD)
            ),
            shape = RoundedCornerShape(bottomStart = 16.dp, bottomEnd = 16.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )
    }
}
