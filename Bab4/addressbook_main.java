package Bab4;

import java.util.Scanner;

public class addressbook_main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        String repeat;

        addressbook u1 = new addressbook();
        u1.setNama("John Cena");
        u1.setAlamat("1241 East Main Street, Stamford CT");
        u1.setTelp(99458778);
        u1.setEmail("wwe.johncena@wwe-entertainment.com");

        addressbook u2 = new addressbook();
        u2.setNama("Jimmy Neutron");
        u2.setAlamat("Nickelodeon Entertainment LLC");
        u2.setTelp(12145587);
        u2.setEmail("neutron.jimmy@nick.com");

        addressbook u3 = new addressbook();
        u3.setNama("Jarwo Sumarji");
        u3.setAlamat("Jalan Petang Alas IV No.12 Jakarta");
        u3.setTelp(02114375);
        u3.setEmail("jarwosumarji.ganteng@gmail.com");

        System.out.println("Selamat Datang di Buku Alamatku!");

        do {
            System.out.println("");
            System.out.print("Masukkan Nama : ");
            String nama = s.nextLine();
            System.out.println();
            if (nama.equalsIgnoreCase(u1.getNama())) {
                u1.summary(u1);
            } else if (nama.equalsIgnoreCase(u2.getNama())) {
                u2.summary(u2);
            } else if (nama.equalsIgnoreCase(u3.getNama())) {
                u3.summary(u3);
            } else {
                System.out.println("Maaf, Nama Pengguna Tidak Terdaftar");
            }
            System.out.print("Cari Alamat Lagi? (y/n) : ");
            repeat = s1.next();

        } while (repeat.equalsIgnoreCase("y"));

    }
}
