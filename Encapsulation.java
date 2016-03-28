package encapsulation;

import java.util.Scanner;

public class Encapsulation {

    public static void main(String[] args) {
        Scanner inint = new Scanner(System.in);
        Scanner instr = new Scanner(System.in);
        int a = 0;
        int i, data;
        int pilihan;
        String namab, alamat, id, no;
        bukualamat[] book = new bukualamat[1000];
        do {
            book[a] = new bukualamat();
            System.out.println("======================");
            System.out.println("      Buku Alamat     ");
            System.out.println("======================");
            System.out.println("1.Masukkan data");
            System.out.println("2.Lihat Data");
            System.out.println("3.Cari Data");
            System.out.println("4.Keluar");
            System.out.print("Pilihan : ");
            pilihan = inint.nextInt();
            if (pilihan == 1) {
                System.out.print("Jumlah Data : ");
                data = inint.nextInt();
                for (i = 0; i < data; i++) {
                    System.out.print("Masukkan ID : ");
                    id = instr.nextLine();
                    book[a].setid(id);
                    System.out.print("Masukkan Nama : ");
                    namab = instr.nextLine();
                    book[a].setnama(namab);
                    System.out.print("Alamat : ");
                    alamat = instr.nextLine();
                    book[a].setalamat(alamat);
                    System.out.print("Telepon : ");
                    long nop = instr.nextLong();
                    book[a].setno(nop);
                    System.out.print("Email : ");
                    String email = instr.nextLine();
                    book[a].setemail(email);
                    boolean mail = true;
                    while (mail) {
                        if (!book[a].cek(book[a].getemail())) {
                            System.out.println("Silahkan Masukkan Ulang Email Anda!");
                            System.out.print("Email : ");
                            book[a].setemail(instr.nextLine());
                        } else {
                            mail = false;
                        }
                    }
                }
                a++;
            } else if (pilihan == 2) {
                for (i = 0; i < a; i++);
                System.out.print("ID : " + book[i].getid());
                System.out.print("Nama : " + book[i].getnama());
                System.out.print("Alamat : " + book[i].getalamat());
                System.out.print("Telepon : " + book[i].getno());
                System.out.print("Email : " + book[i].getemail());
            } else if (pilihan == 3) {
                System.out.println("Masukkan ID : ");
                no = inint.next();
                for (i = 0; i < a; i++) {
                    if (no.equals(book[i].getid())) {
                        System.out.println(book[i].getnama());
                        System.out.println(book[i].getalamat());
                        System.out.println(book[i].getno());
                        System.out.println(book[i].getemail());
                    }
                }
            } else {
                System.out.println("Tidak Ada Dalam Pilihan");
            }
        } while (pilihan != 4);
    }
}
