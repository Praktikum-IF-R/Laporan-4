package mainbiodata;
import java.util.Scanner;
public class MainBukuAlamat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        String nama,alamat,notelp,email;
        System.out.print("Jumlah Data : ");
        int jumlah = input.nextInt();
        System.out.println("");
        BukuAlamat user[] = new BukuAlamat[jumlah];
        for(int a=0; a<jumlah; a++){
            user[a] = new BukuAlamat();
            System.out.print("Masukkan Nama \t\t: ");
            nama = in.nextLine();
            System.out.print("Masukkan Alamat \t: ");
            alamat = in.nextLine();
            System.out.print("Masukkan Nomor Telepon  : ");
            notelp = in.nextLine();
            System.out.print("Masukkan E-mail \t: ");
            email = in.nextLine();
            System.out.println("------------------------------");
            user[a].setNama(nama);
            user[a].setAlamat(alamat);
            user[a].setNomorTelepon(notelp);
            user[a].setEmail(email);
        }
        for(int a=0; a<jumlah; a++){
            System.out.println("Nama \t\t: "+user[a].getNama());
            System.out.println("Alamat \t\t: "+user[a].getAlamat());
            System.out.println("Nomor Telepon   : "+user[a].getNomorTelepon());
            System.out.println("E-mail \t\t: "+user[a].getEmail());
            System.out.println("------------------------------");
        }
    }  
}