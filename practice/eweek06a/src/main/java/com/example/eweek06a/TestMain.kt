package com.example.eweek06a

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.eweek06a.example.example01.uicomponents.MainScreen
import com.example.eweek06a.ui.theme.MyLec2025Theme
import com.example.week06.example02.uicomponents.LoginMainScreen
import com.example.week06.example03.Composable1

@Preview
@Composable
fun MainScreenPreview(modifier: Modifier = Modifier) {
    MainScreen()
}

@Preview
@Composable
private fun LoginMainScreenPreview() {
    LoginMainScreen()
}

@Preview(showBackground = true, name = "Light Preview")
@Composable
fun LightPreview() {
    MyLec2025Theme(darkTheme = false) {
        Composable1()
    }
}
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES, name = "Dark Preview")
@Composable
fun DarkPreview() {
    MyLec2025Theme(darkTheme = true) {
        Composable1()
    }
}

