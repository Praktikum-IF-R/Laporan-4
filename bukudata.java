/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum4;

/**
 *
 * @author Lenovo
 */
public class bukudata {
    private static int i=0;
    private String nama,alamat,nomer,email ;
    
    public bukudata(){
        i++;
    }
    public void setdata(String a,String b,String c, String d){
        nama=a;
        alamat=b;
        nomer=c;
        email=d;
    }
    public String getnama(){
        return nama;
    }
    public String getalamat(){
        return alamat;
    }
    public String getnomer(){
        return nomer;
    }
    public String getemail(){
        return email;
    }
    public static int getcount(){
        return i;
    }
    
}
