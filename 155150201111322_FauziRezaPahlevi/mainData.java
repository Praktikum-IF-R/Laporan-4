/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsul;
import java.util.Scanner;
public class mainData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama, alamat, email, noTelp;
        Scanner in = new Scanner(System.in);
        Data buku1 = new Data();
        Data buku2 = new Data("Fauzi Reza Pahlevi", "Dinoyo", "jio.fr65@gmail.com", "089507758938");
        System.out.println("Masukan nama : ");
        nama = in.nextLine();
        buku1.setNama(nama);
        System.out.println("Masukan alamat : ");
        alamat = in.nextLine();
        buku1.setAlamat(alamat);
        System.out.println("Masukan email : ");
        email = in.nextLine();
        buku1.setEmail(email);
        System.out.println("Masukan nomor telepon : ");
        noTelp = in.nextLine();
        buku1.setTelp(noTelp);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("\t\t Buku Alamat");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("Nama \t\t: "+buku2.getNama());
        System.out.println("Alamat \t\t: "+buku2.getAlamat());
        System.out.println("Email \t\t: "+buku2.getEmail());
        System.out.println("No. Telepon \t: "+buku2.getTelp());
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }
    
}
