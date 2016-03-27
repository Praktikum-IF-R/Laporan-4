/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bukualamat;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BukuAlamat[] BA;
        System.out.print("Jumlah Nama Yang Akan Ditambah  : ");
        int jumlah = in.nextInt();
        BA = new BukuAlamat[jumlah];
        for (int x = 0; x < BA.length; x++) {
            System.out.println("");
            System.out.print("Masukkan  Nama  : ");
            String nama = in.next();
            System.out.print("Masukkan Alamat : ");
            String alamat = in.next();
            System.out.print("Masukkan Telepon: ");
            String tel = in.next();
            System.out.print("Masukkan E-Mail : ");
            String email = in.next();
            System.out.println("");
            BukuAlamat Buku = new BukuAlamat(nama, alamat, tel, email);
            Buku.Display();
        }
    }
}
