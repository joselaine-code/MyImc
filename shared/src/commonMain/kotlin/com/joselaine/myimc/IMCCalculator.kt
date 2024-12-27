package com.joselaine.myimc

object IMCCalculator {
    fun calculateIMC(weight: Double, height: Double): Double {
        return if (height > 0) weight / (height * height) else 0.0
    }
    fun classifyIMC(imc: Double): String {
        return when {
            imc < 18.5 -> "Abaixo do peso"
            imc in 18.5..24.9 -> "Peso normal"
            imc in 25.0..29.9 -> "Sobrepeso"
            imc in 30.0..34.9 -> "Obesidade grau I"
            imc in 35.0..39.9 -> "Obesidade grau II"
            else -> "Obesidade grau III"
        }
    }
}