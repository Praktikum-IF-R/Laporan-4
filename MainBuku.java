package Encapsulation;
import java.util.Scanner;
public class MainBuku {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Buku no = new Buku();
        System.out.println("Banyak alamat yang ingin disimpan : ");
        int jum = in.nextInt();
        for(int i=0 ; i<jum;i++){
        System.out.println("Masukkan Nama   : ");
        String nama = in.nextLine();
        nama = in.nextLine();
        no.setName(nama);
        System.out.println("Masukkan Alamat : ");
        String al = in.next();
        no.setAlamat(al);
        System.out.println("Masukkan No telp: ");
        String num = in.next();
        no.setNo(num);
        System.out.println("Masukkan E-mail : ");
        String mail = in.next();
        no.setMail(mail);
        System.out.println("===========================");
        System.out.println("Data Alamat");
        System.out.println("Nama        : "+no.getName());
        System.out.println("Alamat      : "+no.getAlamat());
        System.out.println("No telepon  : "+no.getNo());
        System.out.println("E-mail      : "+no.getMail());
        System.out.println("===========================");
    }
    }
}
