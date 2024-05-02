/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dashh;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Wibowo
 */
public class Pustakawan {
    private boolean loggedIn;
    private String nim, nama;
    private ArrayList<Koleksi> koleksiPerpus;
    private ArrayList<Anggota> anggotaPerpus;
    
    
    public Pustakawan(){
        this.koleksiPerpus = new ArrayList<>();
        this.anggotaPerpus = new ArrayList<>();
        this.nim = null;
        this.nama = null;
    }
    
    public void logIn(String nip, String nama){
        this.loggedIn = true;
        this.nim = nim;
        this.nama = nama;
    }

    public void signOut(){
        this.loggedIn = false;
        this.nim = null;
        this.nama = null;
    }
    
    public void inputKoleksi(String judul, String penulis, int jml){
        if(this.loggedIn == true){
            this.koleksiPerpus.add(new Koleksi(judul, penulis, jml));
        } else {
            System.out.println("Anda harus login untuk menginput koleksi");
        }
    }

    public void inputAnggota(String kode, String nama, String kontak){
        if(this.loggedIn == true){
            this.anggotaPerpus.add(new Anggota(kode, nama, kontak));
        } else {
            System.out.println("Anda harus login untuk menginput koleksi");
        }
    }
    
    public void cetakListKoleksi(){
        Iterator loop = this.koleksiPerpus.iterator();
        int i = 1;
        
        System.out.println("===========================================================");
        System.out.println(":::::: Daftar Buku yang Tersimpan dalam Perpustakaan ::::::");
        System.out.println("===========================================================");
        while (loop.hasNext()) {
            Koleksi data = (Koleksi) loop.next();
            System.out.print(i++ + ". ");
            System.out.println(data.laporan());
        }
        System.out.println("===========================================================");
    }

    public void cetakListAnggota(){
        Iterator loop = this.anggotaPerpus.iterator();
        int i = 1;
        
        System.out.println("==============================================================");
        System.out.println(":::::: Daftar Anggota yang Tersimpan dalam Perpustakaan ::::::");
        System.out.println("==============================================================");
        while (loop.hasNext()) {
            Anggota data = (Anggota) loop.next();
            System.out.print(i++ + ". ");
            System.out.println(data.laporan());
        }
        System.out.println("==============================================================");
    }
}   