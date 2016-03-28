package bab4mod2;
public class Abook {
    private String nama, alamat,email;
    private long phone;
    public Abook(){
        nama="unknown";
        alamat="unknown";
        email="unknown";
        phone=0000000;
    }
    public Abook(String n, String a,long p,String e){
        nama=n;
        alamat=a;
        phone=p;
        email=e;
    }
    public void setProfile(String n, String a,long p,String e){
        nama=n;
        alamat=a;
        phone=p;
        email=e;
    }
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public long getPhone(){
        return phone;
    }
    public String getEmail(){
        return email;
    }
    public void Showdata(String m){
        System.out.println(m);
    }
    public void Shownum(long n){
        System.out.println(n);
    }
}