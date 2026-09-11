package main.kotlin

import main.kotlin.model.daftar_tugas
import main.kotlin.model.tambah_tugas

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
        var input_user = readln().toInt()

        if (input_user == 1){
            println("Daftar Tugas Kamu: ")
            daftar_tugas()
        }

        if (input_user == 2){
            tambah_tugas()
        }

        if (input_user == 5){
            break
        }
    }
}
