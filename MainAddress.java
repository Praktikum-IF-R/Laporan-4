/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab4;

import java.util.Scanner;
public class MainAddress {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Address s1 = new Address();
        System.out.print("Nama      : ");
        s1.setNama(in.nextLine());
        System.out.print("Alamat    : ");
        s1.setAlamat(in.nextLine());
        System.out.print("No. Telp  : ");
        s1.setTelp(in.nextLine());
        System.out.print("E-mail    : ");
        s1.setMail(in.nextLine());
        System.out.println();
        s1.displayMessage();
        System.out.println();
        Address s2 = new Address("Cindy", "Jln Sumbersari 290A", "087756216466", "cindyamalya428@gmail.com");
        s2.displayMessage();
    }
}
