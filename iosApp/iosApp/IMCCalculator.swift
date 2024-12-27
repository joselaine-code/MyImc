import shared

func calculateIMC(weight: Double, height: Double) -> String {
    let imc = IMCCalculator().calculateIMC(weight: weight, height: height)
    let classification = IMCCalculator().classifyIMC(imc: imc)
    return "IMC: \(String(format: "%.2f", imc))\nClassificação: \(classification)"
}