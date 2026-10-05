package com.example.loginscreen.uicomponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
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
fun RegisterScreen(
    modifier: Modifier = Modifier,
    id: String?,//?은 널이 될 수도 있다는 의미
    passwd: String?
) {
    var idState by remember { mutableStateOf(id?:"") }
    var passwdState by remember { mutableStateOf(passwd?:"") }
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            "Register Screen",
            fontWeight = FontWeight.ExtraBold,
            fontSize = 40.sp
        )
        Text("$idState, let's start the registration process.", fontSize = 20.sp, fontWeight = FontWeight.ExtraBold)
        OutlinedTextField(
            value = idState,
            onValueChange = { idState = it },
            placeholder = { Text("ID") }
        )

        OutlinedTextField(
            value = passwdState,
            visualTransformation = PasswordVisualTransformation(),
            onValueChange = { passwdState = it },
            placeholder = { Text("Password") }
        )
    }
}

@Preview
@Composable
private fun RegisterScreenPreview() {
    RegisterScreen(
        id = "Fuck",
        passwd = "You"
    )
}