class Cuenta_Ahorro(saldo: Float, tanual: Float): Cuenta(saldo,tanual) {
    private var activa: Boolean = saldo >= 10000

    override fun consignar(cantidad: Float) {
        if (activa) {
            super.consignar(cantidad)
        } else {
            println("Cuenta inactiva, no se puede consignar.")
        }
    }

    override fun retirar(cantidad: Float) {
        if (activa) {
            super.retirar(cantidad)
        } else {
            println("Cuenta inactiva, no se puede retirar.")
        }
    }

    override fun extractoMensual() {
        if (nretiros > 4) {
            comisionmensual += (nretiros - 4) * 1000f
        }
        super.extractoMensual()
        activa = saldo >= 10000
    }

    override fun imprimir() {
        println("=== Cuenta de Ahorros ===")
        println("Saldo: $saldo")
        println("Comisión mensual: $comisionmensual")
        println("Número de transacciones: ${nconsignaciones + nretiros}")
        println("Cuenta activa: $activa")
    }
}
