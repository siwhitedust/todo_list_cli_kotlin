package main.kotlin.model

import main.kotlin.repository.Tugas

val a = mutableListOf<Tugas>()
var idBerikut = 1

fun daftarTugas() {
    if (a.isEmpty()){
        println("Tidak ada tugas")
    }
    val mapTugas = a.associateBy { it.id to it.tugas }
    for (i in a){
        println(i)
    }
}

fun tambahTugas(){
    var penjagaTambah = true
    while (penjagaTambah){
        print("\n")
        println("0. Exit")
        print("Masukkan Nama Tugas: ")
        var nilai = readln()
        val baru = Tugas(idBerikut, nilai)
        a.add(baru)
        if (nilai == "0"){
            a.removeLast()
            penjagaTambah = false
        }
        idBerikut++
    }
}

fun hapusTugas(){
    var penjagaHapus = true
    while (penjagaHapus){
        print("\n")
        println("0. Exit")
        print("Pilih Tugas yang ingin di hapus (id): ")
        val nilai = readln()
        val hapus = nilai.toIntOrNull()
        a.removeIf{ it.id == hapus }
        if (nilai == "0"){
            penjagaHapus = false
        }
    }
}