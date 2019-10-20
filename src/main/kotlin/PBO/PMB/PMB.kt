package PBO.PMB

import java.util.Arrays

class PMB : Peserta() {

    private var pesertList = arrayListOf<Peserta>()
    private var index = 1

    fun tambahPeserta(nama: String){
        val peserta = Peserta()
        peserta.name = nama; peserta.id = index
        println("Peserta $nama dengan Id $index")
        pesertList.add(peserta)
        index++
    }

    fun nilaiPeserta(searchId: Int, n1: Double, n2: Double, n3: Double, n4: Double){
        var search = false
        for (x in 0..pesertList.size-1){
            if (pesertList[x].id==searchId){
                pesertList[x].setNilai(n1,n2,n3,n4)
                search = true
                println("Tambah Nilai Berhasil")
                break
            }
        }
        if (!search){
            println("Id Tidak Ditemukan")
        }
    }

    fun searchByName(nama: String){
        var search = false
        println("Cari Nama")
        for (x in 0..pesertList.size-1){
            if (pesertList[x].name.contains(nama)){
                println("ID             : "+pesertList[x].id)
                println("Nama           : "+pesertList[x].name)
                println("Nilai          : "+Arrays.toString(pesertList[x].nilai))
                println("Nilai Total    : "+pesertList[x].getNilaiTotal())
                println()
                search = true
            }
        }
        if (!search){
            println("Nama Tidak Ditemukan")
        }
    }

    fun viewAllPeserta(){
        pesertList.sortBy { sortByID(it) }
        println("List Peserta")
        for (x in 0..pesertList.size-1){
            println("ID             : "+pesertList[x].id)
            println("Nama           : "+pesertList[x].name)
            println("Nilai          : "+Arrays.toString(pesertList[x].nilai))
            println("Nilai Total    : "+pesertList[x].getNilaiTotal())
            println()
        }
    }

    fun topThree(){
        pesertList.sortByDescending { sortByNilaiTotal(it) }
        println("Top Three")
        if (pesertList.size <= 2) {
            for (x in 0..pesertList.size-1) {
                println("ID             : " + pesertList[x].id)
                println("Nama           : " + pesertList[x].name)
                println("Nilai          : " + Arrays.toString(pesertList[x].nilai))
                println("Nilai Total    : " + pesertList[x].getNilaiTotal())
                println()
            }
        } else {
            for (x in 0..2) {
                println("ID             : " + pesertList[x].id)
                println("Nama           : " + pesertList[x].name)
                println("Nilai          : " + Arrays.toString(pesertList[x].nilai))
                println("Nilai Total    : " + pesertList[x].getNilaiTotal())
                println()
            }
        }
    }
}