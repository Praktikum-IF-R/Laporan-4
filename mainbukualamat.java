/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bukualamat;

/**
 *
 * @author Deltaviyahya
 */
public class mainbukualamat {
    public static void main(String[] args) {
System.out.println("================================");
System.out.println("           BUKU ALAMAT");
System.out.println("================================");
        bukualamat c = new bukualamat ();
        c.setNama("Mohamad Deltaviyahya");
        c.setAlamat("Jl Soekarno Hatta no.34");
        c.setTelp("085741721731");
        c.setEmail("deltaviyahya@gmail.com");
        System.out.println("Nama        : "+c.nama);
        System.out.println("Alamat      : "+c.alamat);
        System.out.println("No. Telp    : "+c.telp);
        System.out.println("E-mail      : "+c.email);
        System.out.println("");
        
        bukualamat b = new bukualamat ();
        b.setNama("Deltaviyahya");
        b.setAlamat("Jalan Simomulyo Baru 2i/24 Surabaya");
        b.setTelp("083849114967");
        b.setEmail("deltaviyahya2@gmail.com");
        System.out.println("Nama        : "+b.nama);
        System.out.println("Alamat      : "+b.alamat);
        System.out.println("No. Telp    : "+b.telp);
        System.out.println("E-mail      : "+b.email);
        System.out.println("");

       }
}
