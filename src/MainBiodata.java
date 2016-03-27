package Praktik04;
import java.util.Scanner;
public class MainBiodata {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Biodata saya = new Biodata();
        String a, b, c, d, e;
        System.out.println("====================INPUT===================");
        System.out.print("Nama: ");
        a = in.nextLine();
        System.out.print("Alamat: ");
        b = in.nextLine();
        System.out.print("Nomor Telepon: ");
        c = in.next();
        System.out.print("Email: ");
        d = in.next();
        saya.setNama(a);
        saya.setAlamat(b);
        saya.setNomor(c);
        saya.setEmail(d);
        saya.displayInfo();
        }
    
}