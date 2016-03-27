
package bukualamat;
import java.util.Scanner;
public class MainBukuAlamat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    BukuAlamat bio1 = new BukuAlamat("Yoshua Omega Maurya","Telagaindah no 16","085708627979", "yoshuaomegamaurya@gmail.com");
    BukuAlamat bio2 = new BukuAlamat();
        System.out.println("Masukkan Nama :");
        String nama1=input.nextLine();        
        System.out.println("Masukkan Alamat :");
        String alamat1=input.nextLine();        
        System.out.println("Masukkan No HP :");
        String nohp=input.nextLine();        
        System.out.println("Masukkan Email :");
        String email1=input.nextLine();
        bio2.setNama(nama1);
        bio2.setAlamat(alamat1);
        bio2.settelepon(nohp);
        bio2.setemail(email1);
        System.out.println("Biodata diinputkan lewat constructor");
        System.out.println("---------------------------------");
        System.out.println("Nama       :"+bio1.getNama());
        System.out.println("Alamat     :"+bio1.getAlamat());
        System.out.println("No Hp      :"+bio1.gettelepon());
        System.out.println("Emai;      :"+bio1.getemail());
        System.out.println();
        System.out.println("Biodata diinputkan oleh user");
        System.out.println("---------------------------------");
        System.out.println("Nama       :"+bio2.getNama());
        System.out.println("Alamat     :"+bio2.getAlamat());
        System.out.println("No HP      :"+bio2.gettelepon());
        System.out.println("Email      :"+bio2.getemail());
        System.out.println("--------------------------------");
        
}
}
