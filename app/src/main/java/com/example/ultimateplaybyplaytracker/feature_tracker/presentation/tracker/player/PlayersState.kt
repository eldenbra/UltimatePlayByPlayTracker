package com.example.ultimateplaybyplaytracker.feature_tracker.presentation.tracker.player

import com.example.ultimateplaybyplaytracker.feature_tracker.domain.model.Player

data class PlayersState (val players: List<Player> = emptyList())

data class LineupState (val players: List<Player> = emptyList())
