
package praktikumbab4;


public class User {
    private String nama, alamat, noTelepon, email;    
    public User(){
    }
    public User(String nama, String alamat, String noTelepon, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
        this.email = email;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public String getNoTelepon() {
        return noTelepon;
    }
    public String getEmail() {
        return email;
    }
}



