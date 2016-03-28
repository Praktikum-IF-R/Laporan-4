import java.util.Scanner;
public class MainBukuAlamat {
    public static void main(String[]args){
        Scanner i = new Scanner (System.in);
        bukuAlamat d1 = new bukuAlamat();
        bukuAlamat d2 = new bukuAlamat();
        String a, b, c, d;
        System.out.println("Data 1");
        System.out.println("=======================");
        System.out.print("Nama   : ");
        d1.setNama(i.next());
        System.out.print("Alamat : ");
        d1.setAlamat(i.next());
        System.out.print("No.Telp: ");
        d1.setNoTelp(i.next());
        System.out.print("E-mail : ");
        d1.setEmail(i.next());
        System.out.println("");
        System.out.println("Data 2");
        System.out.println("========================");
        System.out.print("Nama   : ");
        d2.setNama(i.next());
        System.out.print("Alamat : ");
        d2.setAlamat(i.next());
        System.out.print("No.Telp: ");
        d2.setNoTelp(i.next());
        System.out.print("E-mail : ");
        d2.setEmail(i.next());
        System.out.println("");
        System.out.println("========================");
        System.out.println("    DATA BUKU ALAMAT    ");
        System.out.println("========================");
        d1.displayMessage();
        d2.displayMessage();
    }
}
