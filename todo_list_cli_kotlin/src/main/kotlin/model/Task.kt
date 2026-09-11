package main.kotlin.model

import main.kotlin.repository.Tugas

val a = mutableListOf<Tugas>()
var idBerikut = 1

fun daftarTugas() {
    if (a.isEmpty()){
        print("TIDAK ADA TUGAS")
    }
    val mapTugas = a.associateBy { it.id to it.tugas }
    for (i in a){
        print("ID: ${i.id} | Nama Tugas (STATUS): ${i.tugas} (${i.status})\n")
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
        val baru = Tugas(idBerikut, nilai.replaceFirstChar { it.titlecase() }, nilaiStatus.replaceFirstChar { it.titlecase() })
        a.add(baru)
        idBerikut++
        print("DATA BERHASIL DITAMBAHKAN")
        readln()
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
            continue
        }
        print("DATA BERHASIL DIHAPUS")
        readln()
    }
}

fun updateTugas(){
    var penjagaUpdate = true
    while (penjagaUpdate){
        print("\n")
        println("0. Exit")
        print("Pilih Tugas yang ingin di update (id): ")
        val nilai = readln()
        if (nilai == "0"){
            penjagaUpdate = false
            continue
        }
        print("Masukkan Status Tugas: ")
        var nilaiStatus = readln()
        for (i in a){
            if (i.id == nilai.toInt()){
                i.status = nilaiStatus.replaceFirstChar { it.titlecase() }
            }
        }
        print("DATA BERHASIL DIUPDATE")
        readln()
    }
}