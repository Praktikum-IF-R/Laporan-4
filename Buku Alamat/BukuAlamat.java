package bukualamat;
public class BukuAlamat {
    private String nama,alamat,notelp,email;
    public BukuAlamat(){
        this.nama="";
        this.alamat="";
        this.notelp="";
        this.email="";
    }
    public BukuAlamat(String n, String a, String t, String e){
        this.nama=n;
        this.alamat=a;
        this.notelp=t;
        this.email=e;   
    }
    public void setNama(String n){
        this.nama=n;
    }
    public void setAlamat(String a){
        this.alamat=a;
    }
    public void setNotelp(String t){
        this.notelp=t;
    }
    public void setEmail(String e){
        this.email=e;
    }
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public String getNotelp(){
        return notelp;
    }
    public String getEmail(){
        return email;
        }
    }




    

