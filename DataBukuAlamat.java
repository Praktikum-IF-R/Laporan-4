package databukualamat;

public class DataBukuAlamat {

    private String nama;
    private String alamat;
    private String notel;
    private String alamatemail;

    public DataBukuAlamat() {
        nama = "";
        alamat = "";
        notel = "";
        alamatemail = "";
    }

    public void setNama(String n) {
        this.nama = n;
    }

    public String getNama() {
        return nama;
    }

    public void setAlamat(String a) {
        this.alamat = a;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setNotel(String no) {
        this.notel = no;
    }

    public String getNotel() {
        return notel;
    }

    public void setAlamatEmail(String e) {
        this.alamatemail = e;
    }

    public String getAlamatEmail() {
        return alamatemail;
    }

    public void Tampil(DataBukuAlamat buku) {
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = =");
        System.out.println("Nama             : " + buku.getNama());
        System.out.println("Alamat           : " + buku.getAlamat());
        System.out.println("Nomor Telphone   : " + buku.getNotel());
        System.out.println("Alamat Email     : " + buku.getAlamatEmail());
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = =");
    }

}
