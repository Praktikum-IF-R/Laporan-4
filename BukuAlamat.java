package implementasi;
public class BukuAlamat {
private String nama;
private String alamat;
private String telepon;
private String email;
private static int Count;

public BukuAlamat(){Count++ ;}

public void setNama( String temp ){
nama = temp;
}
public String getNama(){
return nama;
}
public void setAlamat( String temp ){
alamat = temp;
}
public String getAlamat(){
return alamat;
}
public void setTelepon( String temp ){
telepon = temp;
}
public String getTelepon(){
return telepon;
}
public void setEmail( String temp ){
email = temp;
}
public String getEmail(){ 
return email;
}
public static int getCount(){
return Count;
    }
}
