package com.angelika.lesson_41

import java.io.Serializable

data class Model(
    val picture: Int,
    val name: String,
    val plot: String
) : Serializable
