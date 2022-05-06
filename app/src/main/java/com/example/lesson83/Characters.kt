package com.example.lesson83

import java.io.Serializable

data class Characters(
    var name: String,
    var age: String,
    var photo: String
): Serializable
