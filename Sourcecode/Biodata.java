package biodata;
import java.util.Scanner;
public class Biodata {
    public static void main(String[] args) {
        String nama ,alamat ,notelp ,email ,pilihan;
        Scanner in = new Scanner(System.in);        
        do{
        System.out.print("Masukkan nama     : ");
        nama = in.nextLine();
        System.out.print("Masukkan alamat   : ");
        alamat = in.nextLine();
        System.out.print("Masukkan notelp   : ");
        notelp = in.nextLine();
        System.out.print("Masukkan email    : ");
        email = in.nextLine();
        Biodataclass Bio = new Biodataclass(nama , alamat , notelp , email);
        
        String a = Bio.nama;
        String b = Bio.alamat;
        String c = Bio.notelp;
        String d = Bio.email;
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("Biodata     ");
        System.out.println("Nama        : "+a);
        System.out.println("Alamat      : "+b);
        System.out.println("No telpon   : "+c);
        System.out.println("Email       : "+d);
        
        System.out.println("");
        
        System.out.print("Masukkan data lagi(Y/N) ? ");
        pilihan = in.nextLine();
        
        
        }while(pilihan.equalsIgnoreCase("Y"));
    }
}
