package Encapsul;
public class Data {
    private String nama;
    private String alamat;
    private String email;
    private String noTelp;
    
    public Data(){
        this.nama="";
        this.alamat="";
        this.email="";
        this.noTelp="";
    }
    public Data(String n, String alm, String mail, String telp){
        this.nama=n;
        this.alamat=alm;
        this.email=mail;
        this.noTelp=telp;
    }
    public void setNama(String n){
        this.nama=n;
    }
    public void setAlamat(String alm){
        this.alamat=alm;
    }
    public void setEmail(String mail){
        this.email=mail;
    }
    public void setTelp(String telp){
        this.noTelp=telp;
    }
    public String getNama(){
        return this.nama;
    }
    public String getAlamat(){
        return this.alamat;
    }
    public String getEmail(){
        return this.email;
    }
    public String getTelp(){
        return this.noTelp;
        
    }
    
    
}
