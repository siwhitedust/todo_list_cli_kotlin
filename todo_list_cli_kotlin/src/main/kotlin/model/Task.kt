package main.kotlin.model

import main.kotlin.repository.Tugas

var a = mutableListOf<Tugas>()

fun tambah_id(): Int{
    var angka = 1
    for (i in a.indices){
        angka += i + 1
    }
    return angka
}

fun daftar_tugas(){
    print("\n")
    for (i in a){
        println("Tugas kamu adalah ${i.tugas} dengan id ${i.id}")
    }
}

fun tambah_tugas(): String{
    var penjaga = true
    while (penjaga == true){
        print("\n")
        println("2. Exit")
        print("Masukkan Nama Tugas: ")
        var nilai = readln()
        a.add(Tugas(tambah_id(),nilai))
        if (nilai == "2"){
            a.removeLast()
            penjaga = false
        }
    }
    return a.toString()
}

fun hapus_tugas(){

}