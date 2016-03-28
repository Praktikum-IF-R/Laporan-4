/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2_encapsulation;

/**
 *
 * @author PERSONAL Co
 */
public class Identitas {
    private String nama, alamat, notelp, email;
    
    public Identitas(){
        
    }

    public Identitas(String nama) {
        this.nama = nama;
    }

    public Identitas(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public Identitas(String nama, String alamat, String notelp) {
        this.nama = nama;
        this.alamat = alamat;
        this.notelp = notelp;
    }
  
    public Identitas(String nama, String alamat, String notelp, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.notelp = notelp;
        this.email = email;
    }
     
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void dissply(Identitas x){
        System.out.println("------------------------------------------------");
        System.out.println("Nama            : "+ nama);
        System.out.println("Alamat          : "+ alamat);
        System.out.println("No Telepon      : "+ notelp);
        System.out.println("Alamat e-mail   : "+ email);
        System.out.println("-------------------------------------------------");
        System.out.println("");
    }
    
    
}
