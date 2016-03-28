package laporan4;
import java.util.Scanner;
public class Bukualamat {
        Scanner input = new Scanner(System.in);
    public String nama, alamat, email;
    public int telepon;

    public Bukualamat() {
        nama = "";
        alamat = "";
        email = "";
        telepon = 00;
    }

    public Bukualamat(String n, String a, String e, int t) {
        nama = n;
        alamat = a;
        email = e;
        telepon = t;
    }

    public void setnama(String n) {
        this.nama = n;
    }
    public String getNama() {
        System.out.print("Nama         :");
        nama = input.nextLine();
        return nama;
    }

    public void setalamat(String a) {
        this.alamat = a;
    }

    public String getAlamat() {
        System.out.print("Alamat       :");
        alamat = input.nextLine();
        return alamat;
    }

    public void setemail(String e) {
        this.email = e;
    }

    public String getemail() {
        System.out.print("Email        :");
        email = input.nextLine();
        return email;
    }

    public void settelepon(int t) {
        this.telepon = t;
    }

    public int getTelepon() {
        System.out.print("Nomer Telepon    :");
        telepon = input.nextInt();
        return telepon;
    }
}
