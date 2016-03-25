package Enkapsulasi;

public class BukuAlamat {
  private String nama, alamat, email;
  private long notelp;

public BukuAlamat(String n){
    this.nama = n;
    alamat = "";
    email = "";
    notelp = 0;
}
public BukuAlamat(String n, String a){
    this.nama = n;
    this.alamat = a;
    email = "";
    notelp = 0;
}
public BukuAlamat(String n, String a, String e){
    this.nama = n;
    this.alamat = a;
    this.email = e;
    notelp = 0;
}
public BukuAlamat(String n, String a, String e, long t){
    this.nama = n;
    this.alamat = a;
    this.email = e;
    this.notelp = t;
    }
public void setNama(String n){
    this.nama = n;    
}
public String getNama(){
    return nama;
}
public void setAlamat(String a){
    this.alamat = a;
}  
public String getAlamat(){
    return alamat;
}
public void setEmail(String e){
    this.email = e;
}
public String getEmail(){
    return email;
}
public void setNotelp(long t){
    this.notelp = t;
}
public long getNotelp(){
    return notelp; 
}
public void TampilPesan(){
    System.out.println("Nama\t\t\tAlamat\t\t\t\tEmail\t\t\t\tNo.Telp");
}
public void TampilPesan2(){
    System.out.println(nama+"\t\t"+alamat+"\t\t"+email+"\t\t"+notelp);
}
    
}
