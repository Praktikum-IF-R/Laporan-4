package bab4mod2;
import java.util.*;
public class MainAbook {
    public static void main(String[] args) {
        String n,a,e, l="========================================";
        long p;
        Scanner in = new Scanner(System.in);
        Abook [] profile= new Abook[3];
        profile[0]=new Abook();
        profile[1]=new Abook("Tori Aoi","Jl mangga no 34 Malang",1857028342,"toriaoi@Qmail.com");
        profile[2]=new Abook();
        profile[2].Showdata("massukkan nama");n=in.nextLine();
        profile[2].Showdata("massukkan alamat");a=in.nextLine();
        profile[2].Showdata("massukkan nomor telepone");p=in.nextLong();
        profile[2].Showdata("massukkan e-mail");e=in.nextLine();
        profile[2].setProfile(n, a, p, e);
        System.out.println(l);
        System.out.println("data buku alamat");
        System.out.println(l);
        for(int i=0;i<profile.length;i++){
            System.out.println(l);
            System.out.println("nama    : "+profile[i].getNama());
            System.out.println("alamat  : "+profile[i].getNama());
            System.out.println("Telepon : "+profile[i].getNama());
            System.out.println("email   : "+profile[i].getNama());}
    }
}
