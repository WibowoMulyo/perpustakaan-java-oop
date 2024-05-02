/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dashh;

/**
 *
 * @author Wibowo
 */
public class Anggota {
    public String kode, nama, kontak;
    
    public Anggota(String kode, String nama, String kontak){
        this.kode = kode;
        this.nama = nama;
        this.kontak = kontak;
    }
    
    public String laporan(){
        return "[" + this.kode + "] " + this.nama + " (" + this.kontak + ")";
    }   
}
