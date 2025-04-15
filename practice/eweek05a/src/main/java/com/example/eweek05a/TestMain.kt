package com.example.eweek05a

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Composable
fun Fuck(modifier: Modifier = Modifier) {
    val scope = rememberCoroutineScope()
    val state = rememberLazyListState()

    val showButton by remember {
        derivedStateOf {
            state.firstVisibleItemIndex > 0
        }
    }


    LazyColumn(
        Modifier.fillMaxSize(),
        state = state,
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        itemsIndexed((0..100).toList()) { index, item ->
            Box(
                Modifier
                    .border(10.dp, color = Color.Green)
                    .padding(10.dp),
            ) {
                Text("$index")
            }
        }
    }

    AnimatedVisibility(showButton) {
        Box(Modifier.fillMaxSize()) {

            FloatingActionButton(
                { scope.launch { state.scrollToItem(0) } },
                modifier = Modifier.align(
                    alignment = Alignment.BottomEnd
                )
            ) {
                Text("Fucy")
            }
        }
    }

}


@Preview
@Composable
private fun Suck() {
    Fuck()
}