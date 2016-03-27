/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB4;

import java.util.*;

public class SOAL1 {

    private String nama, alamat, nomor, email;
    Scanner in = new Scanner(System.in);

    
    void setNama() {
        System.out.print("masukkan nama : ");
        nama = in.nextLine();
    }

    String getNama() {
        return nama;
    }

    void setAlamat() {
        System.out.print("masukkan alamat : ");
        alamat = in.nextLine();
    }

    String getAlamat() {
        return alamat;
    }

    void setEmail() {
        System.out.print("masukkan email : ");
        email = in.nextLine();
    }

    String getEmail() {
        return email;
    }

    void setNomor() {
        System.out.print("masukkan nomor : ");
        nomor = in.nextLine();
    }

    String getNomor() {
        return nomor;
    }

    void display() {
        System.out.println("-------------------------------");
        System.out.println("nama \t: "+nama);
        System.out.println("alamat \t: "+alamat);
        System.out.println("nomor \t: "+nomor);
        System.out.println("email \t: "+email);
        System.out.println("===============================");
    }
}
