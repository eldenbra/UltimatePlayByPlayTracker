package com.example.ultimateplaybyplaytracker.feature_tracker.presentation.utils

import java.nio.ByteBuffer
import java.security.MessageDigest

fun String.sha256(): String {
    return this.hashWithAlgorithm("SHA-256")
}

private fun String.hashWithAlgorithm(algorithm: String): String {
    val digest = MessageDigest.getInstance(algorithm)
    val bytes = digest.digest(this.toByteArray(Charsets.UTF_8))
    return bytes.fold("", { int, it -> int + "%02x".format(it) })
}
