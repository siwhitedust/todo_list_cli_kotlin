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
        println("Id Tugas: ${i.id}")
        println("Nama Tugas: ${i.tugas}")
        println("Status Tugas: ${i.status}")
    }
    readln()
}

fun tambahTugas(){
    var penjagaTambah = true
    while (penjagaTambah){
        print("\n")
        println("0. Exit")
        print("Masukkan Nama Tugas: ")
        var nilai = readln()
        if (nilai == "0"){
            penjagaTambah = false
            continue
        }
        print("Masukkan Status Tugas: ")
        var nilaiStatus = readln()
        val baru = Tugas(idBerikut, nilai, nilaiStatus)
        a.add(baru)
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
        println("Data berhasil dihapus!")
    }
}