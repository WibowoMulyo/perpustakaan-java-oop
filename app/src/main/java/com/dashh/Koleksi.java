/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dashh;

/**
 *
 * @author Wibowo
 */
public class Koleksi {
    public String judul, penulis;
    public int jumlah;
    
    public Koleksi(String judul, String penulis, int jumlah){
        this.judul = judul;
        this.penulis = penulis;
        this.jumlah = jumlah;
    }
    
    public String laporan(){
        return this.judul + " (" + this.penulis + ") : " + this.jumlah;
    }
    
}
