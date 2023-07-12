package cl.gencina.conversortemperatura

fun main(){
    inicial()
}

fun inicial(){
    println("Ingrese la temperatura en celcius")
    val temperaturaInicial = readLine()

    if(isNumber(temperaturaInicial!!)) {
        val celcius = temperaturaInicial.toDouble()
        val farenheit = (celcius * 9 / 5) + 32
        val kelvin = 273.15 + celcius
        val farenheitToKelvin = (5.0 / 9.0) * (farenheit - 32) + 273.15

        println("${String.format("%.2f", celcius)} ºC")
        println("${String.format("%.2f", farenheit)} ºF")
        println("${String.format("%.2f", kelvin)} ºK")
        println("${String.format("%.2f", farenheitToKelvin)} ºK")
    }else{
        inicial()
    }
}

fun isNumber(string: String): Boolean {
    return string.none { it !in '0'..'9' && it !in "." }
}
