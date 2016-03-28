import java.util.Scanner;
public class MainBukuAlamat {

    public static void main(String[] args) {
        int i=0;
        String lagi;
        Scanner in = new Scanner(System.in);

        BukuAlamat Ba1 = new BukuAlamat();
        BukuAlamat Ba2= new BukuAlamat("Ilham Harazky","Jakarta","085279013476", "ilham@gmail.com");
        BukuAlamat Ba3 = new BukuAlamat ();
        Ba1.setNama("Firstian Satya Y");
        Ba1.setAlamat("Kediri");
        Ba1.setEmail("tiansatya@gmail.com");
        Ba1.setTelp("085717481666");
        System.out.println("                    BUKU ALAMAT                   ");
        System.out.println("==================================================");
        do{System.out.print("Masukkan Nama          : ");
           String name = in.nextLine();
           Ba3.setNama(name);
           System.out.print("Masukkan Alamat        : ");
           String adrs = in.nextLine();
           Ba3.setAlamat(adrs);
           System.out.print("Masukkan Emai          : ");
           String mail = in.nextLine();
           Ba3.setEmail(mail);
           System.out.print("Masukkan Telepon       : ");
           String tlp = in.nextLine();
           Ba3.setTelp(tlp);
           System.out.print("Tambah lagi (Y/N) ? ");
           lagi = in.nextLine();
           Ba3.displayMessage(); 
        } while (lagi.equalsIgnoreCase("y"));
            System.out.println();
            Ba1.displayMessage();
            Ba2.displayMessage();

        }
    }
