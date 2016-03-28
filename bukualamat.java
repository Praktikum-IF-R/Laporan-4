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
public class bukualamat {
   String nama, alamat, telp, email;
    

    public bukualamat () {

        nama = null;

        alamat = null;

        telp = null;

        email = null;

    }

    public bukualamat (String n, String a, String t, String e){

        nama = n;

        alamat = a;

        telp = t;

        email = e;

    }

    public void setNama (String n) {
        nama = n;
    }

    public void setAlamat (String a) {

        alamat = a;
    }    

    public void setTelp (String t) {

        telp = t;
    }

    public void setEmail (String e) {

        email = e;
    }

    public String getNama () {

        return nama;
    }

    public String getAlamat() {

        return alamat;
    }

    public String getTelp () {

        return telp;
    }

    public String getEmail () {

        return email;
    }   
    // public void info () {

        //System.out.println("Nama        : "+nama);

        //System.out.println("Alamat      : "+alamat);

        //System.out.println("No. Telp    : "+telp);

        //System.out.println("E-mail      : "+email);
        
    // }    

   
}
