
package laporanbab_4;

public class Alamat {
    private String Nama;
    private String Alamat;
    private String NomorTelepon;
    private String Email;
    public Alamat(){
       Nama = "-";
        Alamat = "-";
        NomorTelepon = "-";
        Email = "-";
    }
    public void setNama(String n){
        Nama = n;
    }
    
    public void setNomorTelepon(String n){
        NomorTelepon = n;
    }
    public void setAlamat(String a){
        Alamat = a;
   
    }    public void setEmail(String e){
       Email = e;
    }
    public String getNama(){
        return Nama;
    }
    public String getNomorTelepon(){
        return NomorTelepon;
    }
    public String getAlamat(){
        return Alamat;    }
    public String getEmail(){
        return Email;
    }
} 

