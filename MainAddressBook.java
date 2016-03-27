package Laporan4;

/**
 *
 * @author wahyu
 */
import java.util.Scanner;

public class MainAddressBook {

    public static void main(String[] args) {
        Scanner wahyu = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("------------------------------------------------");
            System.out.print("Nama Anda : ");
            String n = wahyu.nextLine();
            System.out.print("Alamat Anda : ");
            String a = wahyu.nextLine();
            System.out.print("Nomor Telepon Anda : ");
            String no = wahyu.nextLine();
            System.out.print("E-Mail Anda : ");
            String e = wahyu.nextLine();
            AddressBook data = new AddressBook(n, a, no, e);
            System.out.println("------------------------------------------------");
            System.out.println("Nama : " + data.getNamaLengkap());
            System.out.println("Alamat : " + data.getAlamatLengkap());
            System.out.println("Nomor Telepon " + data.getNamaLengkap() + " : " + data.getNoTelp());
            System.out.println("E-Mail " + data.getNamaLengkap() + " : " + data.getEmail());
            System.out.println("------------------------------------------------");
            System.out.println();
        }
    }
}
