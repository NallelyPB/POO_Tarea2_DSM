//NALLELY Y ANGELA
fun main() {
    //Prueba
    /*val cuenta = Cuenta(1000f, 0.3f)
    println("Saldo inicial: ${cuenta.saldo}")
    cuenta.extractoMensual()
    println("Saldo después del extracto mensual: ${cuenta.saldo}")*/
    // Cuenta de Ahorros
    val cuentaAhorros = Cuenta_Ahorro(15000f, 12f)
    cuentaAhorros.retirar(2000f)
    cuentaAhorros.consignar(1000f)
    cuentaAhorros.retirar(500f)
    cuentaAhorros.retirar(300f)
    cuentaAhorros.retirar(200f)
    cuentaAhorros.retirar(100f) // genera comisión extra
    cuentaAhorros.extractoMensual()
    cuentaAhorros.imprimir()
    println()
}
