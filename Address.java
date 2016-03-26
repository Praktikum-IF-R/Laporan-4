/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab4;

/**
 *
 * @author Lenovo
 */
public class Address {
    private String almt;
    private String nama;
    private String telp;
    private String mail;
    public Address(){
//        nama = "";
//        almt = "";
//        telp = "";
//        mail = "";
    }
    public Address(String a, String b, String c, String d){
        nama = a;
        almt = b;
        telp = c;
        mail = d;
    }
    public void setNama(String a){
        this.nama = a;
    }
    public String getNama(){
        return nama;
    }
    public void setAlamat(String b){
        this.almt = b;
    }
    public String getAlamat(){
        return almt;
    }
    public void setTelp(String c){
        this.telp = c;
    }
    public String getTelp(){
        return telp;
    }
    public void setMail(String d){
        this.mail = d;
    }
    public String getMail(){
        return mail;
    }
    public void displayMessage(){
        System.out.println("\tBuku Alamat");
        System.out.println("Nama        : "+getNama());
        System.out.println("Alamat      : "+getAlamat());
        System.out.println("No. Telp    : "+getTelp());
        System.out.println("E-mail      : "+getMail());
    }
}
