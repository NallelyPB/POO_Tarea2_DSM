open class Cuenta(var saldo: Float, var tanual: Float) {
    var nconsignaciones: Int = 0
    var nretiros: Int = 0
    var comisionmensual: Float =0.0f
    open fun consignar(cantidad: Float) {
        saldo += cantidad
        nconsignaciones++
    }
    open fun retirar(cantidad: Float) {
        if (cantidad <= saldo) {
            saldo -= cantidad
            nretiros++
        } else {
            println("Fondos insuficientes.")
        }
    }
    open fun calcularInteresMensual() {
        val interesMensual = saldo * (tanual / 12)
        saldo += interesMensual
    }
    open fun extractoMensual() {
        saldo -= comisionmensual
        calcularInteresMensual()
    }
    open fun imprimir() {
        println("Saldo: $saldo")
        println("Número de consignaciones: $nconsignaciones")
        println("Número de retiros: $nretiros")
        println("Tasa anual: $tanual%")
        println("Comisión mensual: $comisionmensual")
    }
}