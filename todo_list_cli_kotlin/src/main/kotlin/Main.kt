package main.kotlin

import main.kotlin.model.daftarTugas
import main.kotlin.model.tambahTugas

fun main(){
    while (true){
        print("\n")
        println("Aplikasi To-do List Sederhana Dengan Kotlin")
        println("1. Tampilkan Semua Tugas")
        println("2. Tambah Tugas")
        println("3. Hapus Tugas")
        println("4. Tugas Selesai")
        println("5. Exit")
        print("Masukkan perintah sesuai angka: ")
        val inputUser = readln().toInt()

        if (inputUser == 1){
            println("Daftar Tugas Kamu: ")
            daftarTugas()
        }

        if (inputUser == 2){
            tambahTugas()
        }

        if (inputUser == 5){
            break
        }
    }
}
