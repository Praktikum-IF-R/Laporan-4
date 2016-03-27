/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;

/**
 *
 * @author nuel
 */
import java.util.Scanner;
public class Mainmydata {
    public static void main(String[]nuel){
        Scanner nuels=new Scanner(System.in);
        System.out.print("Masukkan Nama \t\t: ");
        String na=nuels.next();
        System.out.print("Masukkan Alamat \t: ");
        String al=nuels.next();
        System.out.print("Masukkan No.Telepon \t: ");
        String not=nuels.next();
        System.out.print("Masukkan Email \t\t: ");
        String em=nuels.next();
        myData nuelz=new myData(na, al, not, em);
        nuelz.setNama(na);
        nuelz.setAlamat(al);
        nuelz.setNoTelp(not);
        nuelz.setEmail(em);
        System.out.println("");
        nuelz.printData();
        
        
    }
}
