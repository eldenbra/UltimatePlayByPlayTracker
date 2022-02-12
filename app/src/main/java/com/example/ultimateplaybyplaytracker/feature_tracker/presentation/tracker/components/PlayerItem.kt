package com.example.ultimateplaybyplaytracker.feature_tracker.presentation.tracker.components

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.ultimateplaybyplaytracker.feature_tracker.domain.model.Player

@Composable
fun PlayerItem(
    player: Player,
    modifier: Modifier,
){
    Log.d("STATUS", "creating player item for player: ${player.name}")
    Box(
        modifier = modifier.padding(8.dp).background(Color.White)
    ) {
        Column(modifier = Modifier
            .fillMaxSize()

            ) {
            Text(
                modifier=Modifier.align(Alignment.CenterHorizontally),
                text = player.name,
                style = MaterialTheme.typography.h5,
                color = MaterialTheme.colors.onSurface,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,

            )
        }
    }
}