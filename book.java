package neww;
public class book {
    private String nama, alamat, telp, email;
    
    public book (String a, String b, String c, String d){
        this.nama=a;
        this.alamat=b;
        this.telp=c;
        this.email=d;
    }   
    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public String getTelp() {
        return telp;
    }
    public String getEmail() {
        return email;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public void setTelp(String telp) {
        this.telp = telp;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void DisplayMessages(){
        System.out.println("============ Buku Alamat ============");
        System.out.println("Nama     : "+getNama());
        System.out.println("Alamat   : "+getAlamat());
        System.out.println("No. Telp : "+getTelp());
        System.out.println("E-Mail   : "+getEmail());
        System.out.println("=====================================");
    }    
}
