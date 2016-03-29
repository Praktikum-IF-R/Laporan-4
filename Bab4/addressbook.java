package Bab4;

public class addressbook {

    private String nama, alamat, email;
    private int telp;

    public addressbook(String nama, String alamat, int telp, String email) {
        nama = "undefined";
        alamat = "null";
        telp = 404;
        email = "null";
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelp() {
        return telp;
    }

    public void setTelp(int telp) {
        this.telp = telp;
    }

}
