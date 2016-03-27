/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapbukualamat;

/**
 *
 * @author ANITA
 */
public class bukualamat {
    private int i = 0;
    private String [] nama = new String[5];
    private String [] alamat = new String[5];
    private String [] nomor = new String[5];
    private String [] email = new String[5];
    
    public bukualamat(){
        
    }
    
    public void setbuku(String n, String a, String no, String e){
        nama[i] = n;
        alamat[i] = a;
        nomor[i] = no;
        email[i] = e;
        i++;
    }
    
    public String getnama(){
        return nama[i];
    }
    public String getalamat(){
        return alamat[i];
    }
    public String getnomor(){
        return nomor[i];
    }
    public String getemail(){
        return email[i];
    }
    
    public void tampil(){
        for (int j = 0; j<i; j++){
            System.out.println(nama[j]+"\t\t"+alamat[j]+"\t\t"+nomor[j]+"\t "+email[j]);
        }
    }
}