package Encapsulation;
import java.util.Scanner;
public class BukuAlamatMain {
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BukuAlamat a1 = new BukuAlamat();
        BukuAlamat a2 = new BukuAlamat();
        System.out.println("======Masukan Data======");
        System.out.println("Data 1");
        System.out.print("Nama          : ");
        a1.setNama(in.nextLine());
        System.out.print("Alamat        : ");
        a1.setAlamat(in.nextLine());
        System.out.print("Nomor telepon : ");
        a1.setNotel(in.next());
        System.out.print("Alamat E-mail : ");
        a1.setEmail(in.next());
        System.out.println("");
        System.out.println("Data 2");
        System.out.print("Nama          : ");
        in.nextLine();
        a2.setNama(in.nextLine());
        System.out.print("Alamat        : ");
        a2.setAlamat(in.nextLine());
        System.out.print("Nomor telepon : ");
        a2.setNotel(in.next());
        System.out.print("Alamat E-mail : ");
        a2.setEmail(in.next());
        System.out.println("");
        System.out.println("=====Data Buku Alamat=====");
        a1.display();
        a2.display();
    }
}
    

