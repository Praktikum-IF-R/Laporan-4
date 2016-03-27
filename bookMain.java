package neww;

import java.util.Scanner;

public class BookMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a, b, c, d;
        
        System.out.print("Jumlah alamat yang akan ditambahkan  : ");
        int jum = in.nextInt();
        
        book[] addressbook;
        addressbook = new book[jum];
        for (int i = 0; i < addressbook.length; i++) {
            System.out.println("");
            System.out.print("Masukkan Nama    : ");
            a = in.next();
            System.out.print("Masukkan Alamat  : ");
            b = in.next();
            System.out.print("Masukkan Telepon : ");
            c = in.next();
            System.out.print("Masukkan E-Mail  : ");
            d = in.next();
            System.out.println("");
            book x = new book(a, b, c, d);
            x.DisplayMessages();
        }
    }

}
