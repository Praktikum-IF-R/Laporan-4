package praktikum4_;
public class bukualamat {
    private String nama;
    private String alamat;
    private String notelp;
    private String email;
    public bukualamat() {
    }
    public bukualamat(String n, String a, String no, String e) {
        nama = n;
        alamat = a;
        notelp = no;
        email = e;
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
    public void seEmail(String email) {
        this.email = email;
    }
    public String getNama() {
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
    public void Header() {
        System.out.println("======================================");
        System.out.println("\t\tBuku Alamat");
        System.out.println("======================================");
    }
    public void displayMessages() {
        System.out.println();
        System.out.println("Nama\t\t" + getNama());
        System.out.println("Alamat   \t" + getAlamat());
        System.out.println("No Telpon\t" + getNotelp());
        System.out.println("Email\t\t" + getEmail());
    }
}
