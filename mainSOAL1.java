/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB4;

import java.util.*;

/**
 *
 * @author user
 */
public class mainSOAL1 {

    String nama, alamat, nomor, email;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("masukkan banyak orang : ");
        int banyak = in.nextInt();
        System.out.println();
        SOAL1 user[] = new SOAL1[banyak];
        mainSOAL1 user1[] = new mainSOAL1[banyak];
        for (int i = 0; i < banyak; i++) {
            user[i] = new SOAL1();

            user[i].setNama();
            user[i].setAlamat();
            user[i].setNomor();
            user[i].setEmail();
            user[i].display();

            user1[i] = new mainSOAL1(user[i].getNama(), user[i].getAlamat(), user[i].getNomor(), user[i].getEmail());
        }

    }

    public mainSOAL1(String nama, String alamat, String nomor, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomor = nomor;
        this.email = email;

    }
}
