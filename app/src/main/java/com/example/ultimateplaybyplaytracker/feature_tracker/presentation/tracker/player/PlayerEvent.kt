package com.example.ultimateplaybyplaytracker.feature_tracker.presentation.tracker.player

import com.example.ultimateplaybyplaytracker.feature_tracker.domain.model.Player

sealed class PlayerEvent {
    data class DeletePlayer(val player: Player): PlayerEvent()
}
