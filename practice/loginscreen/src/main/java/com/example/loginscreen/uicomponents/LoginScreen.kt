package com.example.loginscreen.uicomponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    onWelcomeNavigate: (String) -> Unit,
    onRegisterNavigate: (String, String) -> Unit
) {
    val id = "greenshiro"
    val passwd = "1234"

    var idState by remember { mutableStateOf("") }
    var passwdState by remember { mutableStateOf("") }

    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            "Login Screen",
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp
        )

        OutlinedTextField(
            value = idState,
            onValueChange = { idState = it },
            placeholder = { Text("ID") }
        )

        OutlinedTextField(
            value = passwdState,
            onValueChange = { passwdState = it },
            placeholder = { Text("Password") },
            visualTransformation = PasswordVisualTransformation()
        )

        Button(
            onClick = {
                if (idState == id && passwdState == passwd)
                    onWelcomeNavigate(idState)
                else
                    onRegisterNavigate(idState, passwdState)
            }
        ) {
            Text("Login")
        }

    }
}

@Preview
@Composable
fun LoginScreenPreview() {
    LoginScreen(
        onWelcomeNavigate = {},
        onRegisterNavigate = { a, b -> }
    )
}