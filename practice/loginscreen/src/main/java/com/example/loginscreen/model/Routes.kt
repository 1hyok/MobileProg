package com.example.loginscreen.model

sealed class Routes(val route:String) {
    object Login:Routes(route = "Login")
    object Register:Routes(route = "Register")
    object Welcome:Routes(route = "Welcome")
}