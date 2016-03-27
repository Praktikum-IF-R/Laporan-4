package Encapsulation;
public class BukuAlamat {
private String nama;
    private String alamat;
    private String email;
    private String notel;
    public BukuAlamat (){
        alamat="";
        notel = "";
    }
    public BukuAlamat (String n, String a, String e, String t){
        nama = n;
        alamat = a;
        email = e;
        notel = t;
    }
    public void setNama (String n){
        nama = n;
    }
    public String getNama (){
        return nama;
    }
    public void setAlamat(String a){
        alamat = a;
    }
    public String getAlamat (){
        return alamat;
    }
    public void setEmail(String e){
        email = e;
    }
    public String getEmail (){
        return email;
    }
    public void setNotel(String t){
        notel = t;
    }
    public String getNotel (){
        return notel;
    }
    public void display (){
        System.out.println("Nama          : "+getNama());
        System.out.println("Alamat        : "+getAlamat());
        System.out.println("Nomor Telepon : "+getNotel());
        System.out.println("Alamat E-mail : "+getEmail());
        System.out.println("=============================");
    }
}
    

