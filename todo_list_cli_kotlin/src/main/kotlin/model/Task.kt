package main.kotlin.model

import main.kotlin.repository.Tugas

var a = mutableListOf<Tugas>()

fun tambahId(): Int{
    var angka = 1
    for (i in a.indices){
        angka += i + 1
    }
    return angka
}

fun daftarTugas(){
    print("\n")
    for (i in a){
        println("Tugas kamu adalah ${i.tugas} dengan id ${i.id}")
    }
}

fun tambahTugas(): String{
    var penjaga = true
    while (penjaga){
        print("\n")
        println("2. Exit")
        print("Masukkan Nama Tugas: ")
        var nilai = readln()
        a.add(Tugas(tambahId(),nilai))
        if (nilai == "2"){
            a.removeLast()
            penjaga = false
        }
    }
    return a.toString()
}

fun hapusTugas(){

}