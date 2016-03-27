/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapbukualamat;
import java.util.Scanner;
/**
 *
 * @author ANITA
 */
public class EnkapBukuAlamat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n, a, no, e, j;
        
        bukualamat ba2 = new bukualamat();
        
        do{
        System.out.println("--------------- BUKU ALAMAT -----------------");
        System.out.print("Nama Anda       : ");
        n = in.nextLine();
        System.out.print("Alamat Anda     : ");
        a = in.nextLine();;
        System.out.print("No. Telp Anda   : ");
        no = in.nextLine();
        System.out.print("E-mail Anda     : ");
        e = in.nextLine();
        ba2.setbuku(n,a,no,e);
        System.out.print("Menambah data alamat kembali ?(y/n) : ");
              j = in.nextLine();
              System.out.println("");
        }while(j.equalsIgnoreCase("y"));
        
        System.out.println("----------------- DAFTAR BUKU ALAMAT -------------------");
        System.out.println("NAMA\t\tALAMAT\t\tNO. TELP\t\tE-MAIL");
        ba2.tampil();
        System.out.println("--------------------------------------------------------");
        
    }
    
}