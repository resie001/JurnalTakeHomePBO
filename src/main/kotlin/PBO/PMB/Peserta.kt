package PBO.PMB

open class Peserta {

    fun sortByID(select: Peserta): Int? = select.id
    fun sortByNilaiTotal(select : Peserta): Double = select.getNilaiTotal()

    var id : Int? = null
    var name:String = ""
    val nilai = DoubleArray(4)

    fun getNilaiTotal (): Double {
        var total = 0.0
        for (x in 0..3){
            total += nilai[x]
        }
        return total/4
    }

    fun setNilai (n1: Double, n2: Double, n3: Double, n4: Double){
        val temp = arrayListOf(n1,n2,n3,n4)
        for (x in 0..3){
            nilai[x] = temp[x]
        }
    }
}