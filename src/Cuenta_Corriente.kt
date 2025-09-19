class Cuenta_Corriente(saldo: Float, tanual: Float): Cuenta(saldo,tanual) {
    private var sobregiro: Float = 0.0f

    override fun retirar(cantidad: Float) {
        if (cantidad <= saldo) {
            super.retirar(cantidad)
        } else {
            sobregiro += (cantidad - saldo)
            saldo = 0.0f
            nretiros++
        }
    }

    override fun consignar(cantidad: Float) {
        if (sobregiro > 0) {
            if (cantidad >= sobregiro) {
                saldo += (cantidad - sobregiro)
                sobregiro = 0.0f
            } else {
                sobregiro -= cantidad
            }
        } else {
            super.consignar(cantidad)
        }
    }

    override fun extractoMensual() {
        super.extractoMensual()
    }

    override fun imprimir() {
        println("=== Cuenta Corriente ===")
        println("Saldo: $saldo")
        println("Comisión mensual: $comisionmensual")
        println("Número de transacciones: ${nconsignaciones + nretiros}")
        println("Sobregiro: $sobregiro")
    }
}