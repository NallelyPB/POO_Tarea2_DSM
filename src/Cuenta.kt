open class Cuenta() {   // <-- este () define un constructor primario vacío
    var saldo: Float =0.0f
    var nconsignaciones: Int = 0
    var nretiros: Int = 0
    var tanual: Float = 0.0f
    var comisionmensual: Float = 0.0f

    constructor(saldo: Float, tanual: Float) {
        this.saldo = saldo
        this.tanual = tanual
        nconsignaciones = 0
        nretiros = 0
        comisionmensual = 0.0f
    }
}
