package com.example.practice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.practice.ui.theme.PracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()//상태 바
        setContent {
            PracticeTheme {
//                MainScreen()
                Fuck()
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    MainScreen(modifier = Modifier.padding(innerPadding))
////                    Greeting(
////                        name = "Android",
////                        modifier = Modifier.padding(innerPadding)
////                    )
//                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun Fuck(modifier: Modifier = Modifier) {
    AsyncImage(
        model = "https://alphabiz.iwinv.biz/news/data/20241213/p1065593059092330_187_thum.jpg",
        contentDescription = "샘플 이미지",
        modifier = Modifier.size(200.dp)
    )
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PracticeTheme {
//        Greeting("Android")
        Fuck();
    }
}