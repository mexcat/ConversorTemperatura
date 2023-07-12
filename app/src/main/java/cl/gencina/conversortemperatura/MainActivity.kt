package cl.gencina.conversortemperatura

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

fun main(){
    println("Ingrese la temperatura en celcius")
    val temperaturaInicial = readLine()

    val celcius = temperaturaInicial?.toDouble()
    val farenheit = (celcius!! * 9/5) + 32
    val kelvin = 273.15 + celcius
    val farenheitToKelvin = (5.0/9.0) * (farenheit - 32)+ 273.15

   println( "${String.format("%.2f", celcius )} ºC" )
   println( "${String.format("%.2f", farenheit )} ºF" )
   println( "${String.format("%.2f", kelvin )} ºK" )
   println( "${String.format("%.2f", farenheitToKelvin )} ºK" )
}

fun isNumber(string: String): Boolean {
    return string.none { it in '0'..'9' }
}

/*class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}*/