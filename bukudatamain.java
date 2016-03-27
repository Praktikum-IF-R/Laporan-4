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
import java.util.Scanner;
public class bukudatamain {
    public static void main(String[] args) {
        int pil,i=0;
        Scanner masuk=new Scanner(System.in);
        System.out.println("masukan banyak data: ");
        int jum=masuk.nextInt();
        bukudata a[]=new bukudata[jum];
        do{
            System.out.println("=====================================================");
            System.out.println("1. isi data ");
            System.out.println("2. lihat data ");
            System.out.println("3. keluar ");
            System.out.print("masukan menu yang anda pilih: ");
            pil = masuk.nextInt();
            System.out.println("=====================================================");
            switch(pil){
                case 1:
                    System.out.print("masukan nama: ");
                    String b=masuk.next();
                    System.out.print("masukan alamat: ");
                    String c=masuk.next();
                    System.out.print("masukan nomor telepon: ");
                    String d=masuk.next();
                    System.out.print("masukan email: ");
                    String e=masuk.next();
                    a[i]=new bukudata();
                    a[i].setdata(b, c, d, e);
                    i++;break;
                case 2:
                    for (int j=0; j<a.length; j++){
                        if(a[j]!=null){
                            System.out.println((j+1)+". data:"+a[j].getnama()+"\n\t"+a[j].getalamat()+"\n\t"+a[j].getnomer()+"\n\t"+a[j].getemail());
                        } else{
                            System.out.println("");
                        }
                    }
                    System.out.println("banyaknya data yang telah dimasukan: "+a[1].getcount());
            }
        } while(pil!=3&&pil<3);
    }
}