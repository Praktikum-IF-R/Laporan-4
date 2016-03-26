package databukualamat;

import java.util.Scanner;

public class mainDataBukuAlamat {

    public static int banyakdata = 0;
    public static DataBukuAlamat buku[] = new DataBukuAlamat[40];

    public static void main(String[] args) {
        Scanner inS = new Scanner(System.in);
        Scanner inI = new Scanner(System.in);
        DataBukuAlamat data = new DataBukuAlamat();
        DataBukuAlamat data1 = new DataBukuAlamat();

        int b;
        System.out.println("\t== DATA-DATA BUKU ALAMAT ==");

        do {
            System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = =");
            System.out.println("1. MENGISI DATA ");
            System.out.println("2. MELIHAT DATA ");
            System.out.println("3. KELUAR ");
            System.out.print("MASUKKAN PILIHAN: ");
            int pilihan = inI.nextInt();
            System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = =");
            switch (pilihan) {
                case 1:
                    System.out.println("");
                    System.out.print("BERAPA DATA YANG AKAN DITAMBAHKAN: ");
                    int m = inI.nextInt();
                    for (int q = banyakdata; q < m; q++) {
                        buku[q] = new DataBukuAlamat();
                        System.out.println("");
                        int l = q + 1;
                        System.out.println("*) Isi Data Ke-" + l);
                        System.out.print("MASUKKAN NAMA             : ");
                        String nama = inS.nextLine();
                        buku[q].setNama(nama);
                        System.out.print("MASUKKAN ALAMAT           : ");
                        String alamat = inS.nextLine();
                        buku[q].setAlamat(alamat);
                        System.out.print("MASUKKAN NOMER TELPHONE   : ");
                        String notel = inS.nextLine();
                        buku[q].setNotel(notel);
                        System.out.print("MASUKKAN ALAMAT EMAIL     : ");
                        String email = inS.nextLine();
                        buku[q].setAlamatEmail(email);
                        banyakdata++;
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("");
                    for (int t = 0; t <= buku.length; t++) {
                        if (buku[t] != null) {
                            data1.Tampil(buku[t]);
                        } else {
                            System.out.println("");;
                            break;
                        }
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
            System.out.println("");

            System.out.println("Masukkan Data/Pilihan Menu Lagi ? ");
            System.out.println("1. YA");
            System.out.println("2.TIDAK");
            System.out.print("Masukkan Pilihan: ");
            b = inI.nextInt();
        } while (b == 1);
        System.out.println("\t== Terimakasih data telah tersimpan ==");
        System.out.println("");

    }

}
