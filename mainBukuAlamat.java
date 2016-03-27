import java.util.Scanner;
public class mainBukuAlamat {
    public static void main(String[] args) {
        Scanner aww = new Scanner(System.in);
        System.out.println("===================================================");
        System.out.println("\t--WELCOME DI PROGRAM BUKU ALAMAT--");
        System.out.println("===================================================");
        System.out.print("Masukkan banyak data : ");
        int data = aww.nextInt();
        BukuAlamat[] user = new BukuAlamat[data];
        for (int i = 0; i < user.length; i++) {
            user[i] = new BukuAlamat();
            String temp = aww.nextLine();
            System.out.print("\nMasukkan Nama           : ");
            String name = aww.nextLine();
            user[i].setNama(name);
            System.out.print("Masukkan Alamat         : ");
            String address = aww.nextLine();
            user[i].setAlamat(address);
            System.out.print("Masukkan Nomor Telepon  : ");
            String nomor = aww.nextLine();
            user[i].setTelp(nomor);
            System.out.print("Masukkan Alamat E-mail  : ");
            String mail = aww.nextLine();
            user[i].setEmail(mail);
        }
        System.out.println();
            System.out.println("**************************************************************");
        System.out.println("\t\t\t BUKU ALAMAT");
        for (int i = 0; i < user.length; i++) {  
            System.out.println("**************************************************************");
            System.out.println("Nama            : " + user[i].getNama());
            System.out.println("Alamat          : " + user[i].getAlamat());
            System.out.println("Nomor Telepon   : " + user[i].getTelp());
            System.out.println("Alamat E-mail   : " + user[i].getEmail());           
            System.out.println("**************************************************************");
        }
        System.out.println("");
      
    }
}

