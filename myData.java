/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;

/**
 *
 * @author nuel
 */
public class myData {

    public String nama;
    public String alamat;
    public String email;
    public String no_telp;


    public myData(String n, String a, String no, String e) {
        this.nama = n;
        this.alamat = a;
        this.no_telp = no;
        this.email = e;
    }

    public void setNama(String n) {
        this.nama = n;
    }

    public String getNama() {
        return nama;
    }

    public void setAlamat(String a) {
        this.alamat = a;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setNoTelp(String no) {
        this.no_telp = no;
    }

    public String getNoTelp() {
        return no_telp;
    }

    public void setEmail(String e) {
        this.email = e;
    }

    public String getEmail() {
        return email;
    }

}
