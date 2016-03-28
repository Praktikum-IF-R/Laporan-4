
package praktikumbab4;

import java.util.Scanner;
public class UserMain {

    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        
        System.out.print("Masukkan nama anda : ");
        String nama=s.nextLine();
        System.out.print("Masukkan alamat anda : ");
        String alamat=s.nextLine();
        System.out.print("Masukkan nomor telepon anda : ");
        String noTelepon=s.nextLine();
        System.out.print("Masukkan E-mail anda : ");
        String email=s.nextLine();
        
        User user=new User();
        user.setNama(nama);
        user.setAlamat(alamat);
        user.setNoTelepon(noTelepon);
        user.setEmail(email);
        
        System.out.println("-----------------------------");
        System.out.println("| DATA USER 1");
        System.out.println("| Nama\t\t: "+user.getNama());
        System.out.println("| Alamat\t: "+user.getAlamat());
        System.out.println("| Nomor Telepon\t: "+user.getNoTelepon());
        System.out.println("| E-mail\t: "+user.getEmail());
        System.out.println("-----------------------------");
        
        User user2=new User("Raja","Jl. Watuwatu No.007","081223242567","Raja@email.com");
        System.out.println("| DATA USER 2");
        System.out.println("| Nama\t\t: "+user2.getNama());
        System.out.println("| Alamat\t: "+user2.getAlamat());
        System.out.println("| Nomor Telepon\t: "+user2.getNoTelepon());
        System.out.println("| E-mail\t: "+user2.getEmail());
        System.out.println("-----------------------------");



    }
    
}
