
package bukualamat;
public class BukuAlamat {
private String Nama;
private String Alamat;
private String telepon;
private String email;
public BukuAlamat(){
    Nama="";
    Alamat="";
    telepon="";
    email="";
}
public BukuAlamat(String a,String b, String c, String d){
    Nama=a;
    Alamat=b;
    telepon=c;
    email=d;
    }
public void setNama(String n){
    Nama=n;
}
public String getNama(){
    return Nama;
}
public void setAlamat(String a){
    Alamat=a;
}
public String getAlamat(){
    return Alamat;
}
public void settelepon(String t){
    telepon=t;    
}
public String gettelepon(){
    return telepon;
}
public void setemail(String e){
    email=e;
}
public String getemail(){
    return email;
}    
public void displaymessage(){
        System.out.println("Nama       :"+getNama());
        System.out.println("Alamat     :"+getAlamat());
        System.out.println("No Hp      :"+gettelepon());
        System.out.println("Emai;      :"+getemail());
}
}
