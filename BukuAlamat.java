public class BukuAlamat {
private String nama, telepon, email, alamat;
protected BukuAlamat(){
    nama=" ";
    alamat=" ";
    telepon=" ";
    email=" ";
}
public void setNama(String name){
    nama=name;
}
public String getNama(){
    return nama;
}
public void setAlamat(String address){
    alamat=address;
}
public String getAlamat (){
    return alamat;
}
public void setTelp(String phone){
    telepon=phone;
}
public String getTelp(){
    return telepon;
}
public void setEmail (String mail){
    email=mail;
}
public String getEmail(){
    return email;
}   
}
