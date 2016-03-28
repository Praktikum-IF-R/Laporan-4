
package laporanbab_4;

import java.util.Scanner;


public class MainAlamat {
      public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Scanner scns = new Scanner(System.in);
        String nama;
         String alamat;
          String telp;
          String email;
        System.out.print("Jumlah Banyaknya Data Buku : ");
        
        int jumlah = scn.nextInt();
        
        Alamat user[] = new Alamat[jumlah];
        
        for(int x=0; x<jumlah; x++){
        
            user[x] = new Alamat();
            System.out.print("Masukkan Nama \t\t   : ");
            nama = scns.nextLine();
            System.out.print("Masukkan Alamat \t   : ");
            alamat = scns.nextLine();
            System.out.print("Masukkan Nomor Telepon\t   : ");
            telp = scns.nextLine();
            System.out.print("Masukkan E-mail \t   : ");
            
            email = scns.nextLine();
            System.out.println("------------------------------------");
            user[x].setNama(nama);
            user[x].setAlamat(alamat);
            user[x].setNomorTelepon(telp);
            user[x].setEmail(email);
       }
        for(int y=0; y<jumlah; y++){
            System.out.println("Nama \t\t: "+user[y].getNama());
            System.out.println("Alamat \t\t: "+user[y].getAlamat());
            System.out.println("Nomor Telepon   : "+user[y].getNomorTelepon());
            System.out.println("E-mail \t\t: "+user[y].getEmail());
            System.out.println("-------------------------------------");
        }
    }  
}

