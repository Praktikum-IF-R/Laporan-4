package Laporan4;

/**
 *
 * @author wahyu
 */
public class AddressBook {

    private String nama;
    private String alamat;
    private String noTelp;
    private String email;

    public AddressBook(String nama, String alamat, String noTelp, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.email = email;
    }

    public void setNamaLengkap(String n) {
        nama = n;
    }

    public String getNamaLengkap() {
        return nama;
    }

    public void setAlamatLengkap(String a) {
        alamat = a;
    }

    public String getAlamatLengkap() {
        return alamat;
    }

    public void setNoTelp(String no) {
        noTelp = no;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setEmail(String e) {
        email = e;
    }

    public String getEmail() {
        return email;
    }
}
