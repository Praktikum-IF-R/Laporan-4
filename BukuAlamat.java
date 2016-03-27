package mainbiodata;
public class BukuAlamat {
    private String Nama;
    private String Alamat;
    private String NomorTelepon;
    private String Email;
    public BukuAlamat(){
        Nama = "-";
        Alamat = "-";
        NomorTelepon = "-";
        Email = "-";
    }
    public void setNama(String n){
        Nama = n;
    }
    public void setAlamat(String a){
        Alamat = a;
    }
    public void setNomorTelepon(String n){
        NomorTelepon = n;
    }
    public void setEmail(String e){
        Email = e;
    }
    public String getNama(){
        return Nama;
    }
    public String getAlamat(){
        return Alamat;
    }
    public String getNomorTelepon(){
        return NomorTelepon;
    }
    public String getEmail(){
        return Email;
    }
}