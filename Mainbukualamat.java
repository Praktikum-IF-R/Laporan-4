package praktikum4_;
import java.util.Scanner;
public class Mainbukualamat {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        bukualamat a = new bukualamat();
        bukualamat b = new bukualamat("Ardia Regita P","Jln.Terusan Cikampek Kav 1","0899999999","ardiaregitap@gmail.com");
        System.out.print("Nama: ");
        a.setNama(in.nextLine());
        System.out.print("Alamat: ");
        a.setAlamat(in.nextLine());
        System.out.print("No Telpon: ");
        a.setNotelp(in.nextLine());
        System.out.print("Email: ");
        a.seEmail(in.nextLine());
        a.Header();
        a.displayMessages();
        b.displayMessages();
    }
}