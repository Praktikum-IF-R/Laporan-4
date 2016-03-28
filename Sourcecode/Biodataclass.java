package biodata;
public class Biodataclass {
    
    protected String nama;
    protected String alamat;
    protected String notelp;
    protected String email;
    
    public Biodataclass(){
        nama    = "Ilham Harazki";
        alamat  = "Jl.Suhat cluster tulip blok A no 1";
        notelp  = "081291371997";
        email   = "ilhamharazky@rocketmail.com";
        }
    
    public Biodataclass(String nama , String alamat , String notelp , String email){
        this.nama = nama;
        this.alamat = alamat;
        this.notelp = notelp;
        this.email = email;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getNama(){
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNotelp() {
        return notelp;
    }

    public String getEmail() {
        return email;
    }   
}