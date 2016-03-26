package bukualamat;

import java.util.Scanner;

public class MainBAlamat {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        BukuAlamat b1 = new BukuAlamat();
        BukuAlamat b2 = new BukuAlamat("Femilia Nopianti", "Lombok NTB", "081907498739", "femilianopianti@yahoo.com");
        System.out.print("Masukkan Nama          : ");
        b1.setName(in.nextLine());
        System.out.print("Masukkan Alamat        : ");
        b1.setAlamat(in.nextLine());
        System.out.print("Masukkan No. Telepon   : ");
        b1.setNoTelp(in.next());
        System.out.print("Masukkan Alamat E-Mail : ");
        b1.setEmail(in.next());
        System.out.println("");
        b1.display();
        System.out.println("");
        b2.display();
    }   
}
