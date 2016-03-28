/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2_encapsulation;

import java.util.Scanner;

/**
 *
 * @author PERSONAL Co
 */
public class TestIdentitas {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         Scanner in = new Scanner(System.in);
        System.out.println("===========DATA-DATA BUKU ALAMAT=============");
        Identitas i1 = new Identitas();
        i1.setNama("Putriani Ayu Atikasari");
        i1.setAlamat("Paron, Ngawi, Jawa Timur");
        i1.setNotelp("085728119131");
        i1.setEmail("putri@gmail.com");
        Identitas i2 = new Identitas("Anita Sumiati");
        i2.setAlamat("Mawar, Praya ,Lombok Tengah");
        i2.setNotelp("085728119132");
        i2.setEmail("anita@gmail.com");
        Identitas i3 = new Identitas("Tesa Putri Cendani", "Melati, Jurangombo, Magelang");
        i3.setNotelp("085728119133");
        i3.setEmail("tesa@gmail.com");
        Identitas i4 = new Identitas("Angelika Lodong", "Naga , Rungkut Asri, Surabaya", "085728119134");
        i4.setEmail("angel@gmail.com");
        Identitas i5 = new Identitas("Cevita Detri", "Bambu, Kepanjen, Malang", "085728119135", "cevita@gmail.com");

        String ulang;
        String nama;
        do {
            System.out.print("Cari Nama Lengkap: ");
            nama = input.nextLine();
            System.out.println("");
            if (nama.equalsIgnoreCase(i1.getNama())) {
                i1.dissply(i1);
            } else if (nama.equalsIgnoreCase(i2.getNama())) {
                i2.dissply(i2);
            } else if (nama.equalsIgnoreCase(i3.getNama())) {
                i3.dissply(i3);
            } else if (nama.equalsIgnoreCase(i4.getNama())) {
                i4.dissply(i4);
            } else if (nama.equalsIgnoreCase(i5.getNama())) {
                i5.dissply(i5);
            }else{
                System.out.println("Nomor Telepon Tidak Ditemukan");
                System.out.println("");
            }
            System.out.print("Mau cari lagi? [y/t] : ");
            ulang=in.next();
            System.out.println("");
            }
            while (ulang.equalsIgnoreCase("y"));

        }
    }