
package TUGAS1;

public class BukuAlamat {
    String nama,alamat,nomortelepon,alamatemail;
    public BukuAlamat(String a,String b,String c,String d){
        nama = a;
        alamat = b;
        nomortelepon = c;
        alamatemail = d;
    }
    public void setNama(String a){
        nama = a;
    }
    public  void setAlamat(String a){
        alamat = a;
    }
    public void setNomorTelepon(String a){
        nomortelepon = a;
    }
    public void setAlamatEmail(String a){
        alamatemail = a;
    }
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public String getNomorTelepon(){
        return nomortelepon;
    }
    public String getAlamatEmail(){
        return alamatemail;
    }
}
