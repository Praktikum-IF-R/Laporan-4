/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BukuAlamat;

/**
 *
 * @author DS
 */
public class BukuAlamat {
    //deklarasi variabel
    private String Nama, Alamat, Telpon, Email;
    //konstruktor biasa
    public BukuAlamat(){
        Nama = "";
        Alamat = "";
        Telpon = "";
        Email = "";
    }
    //konstructor dengan adanya parameter
    public BukuAlamat(String a,String b, String c, String d) {
        Nama = a;
        Alamat = b;
        Email = c;
        Telpon = d;
    }
    //menampilkan hasil pengisian pada konstruktor
    public void Display(){
        System.out.println("                 DATA BUKU ALAMAT");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Nama           : " + Nama);
        System.out.println("Alamat         : " + Alamat);
        System.out.println("Nomor telepon  : " + Email);
        System.out.println("Email          : " + Telpon);        
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");    
    }
    //method set untuk memberi nama
    public void setNama(String a) {
        this.Nama = a;
    }
    //method get menampilkan nama
    public String getNama() {
        return Nama;
    }
    //method set memberi alamat
    public void setAlamat(String b) {
        this.Alamat = b;
    }   
    //method get menampilkan alamat
    public String getAlamat() {
        return Alamat;
    }   
    //method set pengisian nomor telpon
    public void setTelpon(String c) {
        this.Telpon = c;
    }
    //method get menampilkan nomor telepon
    public String getTelpon() {
        return Telpon;
    }
    //method set pengisian email
    public void setEmail(String d) {
        this.Email = d;
    }
    //method get menampilkan email
    public String getEmail() {
        return Email;
    }
    //method untuk menampilkan dengan memanggil method get
    public void tampilkan() {
        System.out.println("                 DATA BUKU ALAMAT");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Nama           : " + getNama());
        System.out.println("Alamat         : " + getAlamat());
        System.out.println("Nomor telepon  : " + getTelpon());
        System.out.println("Email          : " + getEmail());        
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}

