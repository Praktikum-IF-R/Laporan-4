/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bukualamat;

/**
 *
 * @author LENY
 */
public class BukuAlamat {

    private String nama;
    private String alamat;
    private String notel;
    private String email;

    public BukuAlamat(String a, String b, String c, String d) {
        this.nama = a;
        this.alamat = b;
        this.notel = c;
        this.email = d;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setTelepon(String telepon) {
        this.notel = notel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTelepon() {
        return notel;
    }

    public String getEmail() {
        return email;
    }

    public void Display() {
        System.out.println("========= Buku Alamat ========");
        System.out.println("");
        System.out.println("Nama    : " + getNama());
        System.out.println("Alamat  : " + getAlamat());
        System.out.println("Telepon : " + getTelepon());
        System.out.println("E-Mail  : " + getEmail());
        System.out.println("");
        System.out.println("==============================");
    }
}
