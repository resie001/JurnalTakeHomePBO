package PBO.PMB

import java.util.Scanner

private var pmb = PMB()
private val reader = Scanner(System.`in`)

fun main() {
    runThis()
}

private fun runThis(){
    var choice: Int
    do {
        println("Menu")
        println("1. Tambah Peserta")
        println("2. Tambah Nilai Peserta")
        println("3. Search By Nama")
        println("4. Lihat Semua Peserta")
        println("5. Lihat Top Three")
        println("6. Exit")
        print("Masukan Pilihan: "); choice= reader.nextInt()
        when(choice){
            1 -> addParticipant()
            2 -> addScoreParticipant()
            3 -> searchByName()
            4 -> pmb.viewAllPeserta()
            5 -> pmb.topThree()
            6 -> println("Exiting App....")
            else -> println("Out Of Ranges!!!")
        }
    } while (choice!=6)
}

private fun addParticipant(){
    print("Masukkan Nama Peserta: "); val name = readLine()
    pmb.tambahPeserta(name!!)
}

private fun addScoreParticipant(){
    print("Masukkan Id Peserta: "); val id = reader.nextInt()
    print("Masukkan Nilai Pertama: "); val n1 = reader.nextDouble()
    print("Masukkan Nilai Kedua: "); val n2 = reader.nextDouble()
    print("Masukkan Nilai Ketiga: "); val n3 = reader.nextDouble()
    print("Masukkan Nilai Keempat: "); val n4 = reader.nextDouble()
    pmb.nilaiPeserta(id, n1, n2, n3, n4)
}

private fun searchByName(){
    print("Masukkan Nama : "); val name = readLine()
    pmb.searchByName(name!!)
}