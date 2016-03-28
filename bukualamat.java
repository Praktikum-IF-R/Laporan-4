package encapsulation;

public class bukualamat {

    private int pilihan;
    private int no;
    private int data;
    private long notelepon;
    private String alamat;
    private String nama;
    private String email;
    private String id;

    public void setid(String id) {
        this.id = id;
    }

    public String getid() {
        return id;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public String getnama() {
        return nama;
    }

    public void setno(long notelepon) {
        this.notelepon = notelepon;
    }

    public long getno() {
        return notelepon;
    }

    public void setalamat(String alamat) {
        this.alamat = alamat;
    }

    public String getalamat() {
        return alamat;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getemail() {
        return email;
    }

    public boolean cek(String e) {
        boolean ada = false;
        for (int i = 0; i < e.length(); i++) {
            if (e.charAt(i) == '@') {
                ada = true;
            }
        }
        return ada;
    }
}
