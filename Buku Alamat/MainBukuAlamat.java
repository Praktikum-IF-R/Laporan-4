package bukualamat;
import java.util.Scanner;
public class MainBukuAlamat {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    String nama,alamat,notelp,email;
    
    BukuAlamat B1 = new BukuAlamat();
    BukuAlamat B2 = new BukuAlamat("Denlei Diyorossi","Mega Regency Block C.31/No.06 Jl. Gading","089639244423","diyorossi@yahoo.co.id");
    System.out.print("Masukkan Nama Lengkap   : ");
    nama=input.nextLine();
    B1.setNama(nama);
    System.out.print("Masukkan Alamat Lengkap : ");
    alamat=input.nextLine();
    B1.setAlamat(alamat);
    System.out.print("Masukkan No.telp        : ");
    notelp=input.nextLine();
    B1.setNotelp(notelp);
    System.out.print("Masukkan Alamat E-mail  : ");
    email=input.nextLine();
    System.out.println();
    B1.setEmail(email);
        System.out.println("-----------------------------------------------------");
        System.out.println("\t\t----BUKU ALAMAT----");
        System.out.println("-----------------------------------------------------");
        System.out.println("  Nama    : "+B1.getNama());
        System.out.println("  Alamat  : "+B1.getAlamat());
        System.out.println("  No.telp : "+B1.getNotelp());
        System.out.println("  E-mail  : "+B1.getEmail());
        System.out.println();
        System.out.println("  Nama    : "+B2.getNama());
        System.out.println("  Alamat  : "+B2.getAlamat());
        System.out.println("  No.telp : "+B2.getNotelp());
        System.out.println("  E-mail  : "+B2.getEmail());
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");
    
    }
}
