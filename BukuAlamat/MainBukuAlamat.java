/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BukuAlamat;

import java.util.Scanner;

/**
 *
 * @author DS
 */
public class MainBukuAlamat {
   public static void main(String[] args) {
       //membuat scanner bernama ip dan in
        Scanner ip = new Scanner(System.in);
        Scanner in = new Scanner (System.in);
        System.out.println("Contoh menggunakan Constructor");
        //pengisian constructor berdasar parameternya
        BukuAlamat UM = new BukuAlamat("Dicky","Sutami","08878787","ds@gmail.com");
        UM.Display();//menampilkan hasil
        System.out.println();
        //program inputan user
        System.out.println("             PROGRAM USER FRIENDLY");
        BukuAlamat UB = new BukuAlamat();//object baru
        System.out.println("banyaknya data yang di inginkan : ");
        int banyak = ip.nextInt();//pemberian batasan data
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("                    BUKU ALAMAT                   ");
        System.out.println("               UNIVERSITAS BRAWIJAYA");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        //pengulangan berdasar v. banyak
        for (int i = 0; i < banyak; i++) {
            //pengisian data
            System.out.print("Masukkan nama          : ");
            UB.setNama(in.nextLine());
            System.out.print("Masukkan alamat        : ");
            UB.setAlamat(in.nextLine());           
            System.out.print("Masukkan nomor telepon : ");
            UB.setTelpon(in.nextLine());
             System.out.print("Masukkan email         : ");
            UB.setEmail(in.nextLine());
            System.out.println();
            UB.tampilkan();//menampilkan hasil pengisian data
        }
    }
} 
   
