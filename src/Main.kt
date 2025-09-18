fun main() {
    val cuenta = Cuenta(1000f, 0.3f)
    println("Saldo inicial: ${cuenta.saldo}")
    cuenta.extractoMensual()
    println("Saldo después del extracto mensual: ${cuenta.saldo}")
}
