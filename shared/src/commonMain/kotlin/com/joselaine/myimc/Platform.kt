package com.joselaine.myimc

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform