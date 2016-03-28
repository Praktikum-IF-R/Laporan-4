package implementasi;
import java.util.Scanner;
public class MainBukuAlamat {
    public static void main(String [] args){
BukuAlamat Anita = new BukuAlamat();
BukuAlamat Olta = new BukuAlamat();

Anita.setNama("Anita Sumiati Siahaan");
Anita.setAlamat("JL.R nurdin Sinunukan ");
Anita.setTelepon("081234567890");
Anita.setEmail("anitasumiatiS@gmail.com");

Olta.setNama("Olta Patrobas Hutabarat");
Olta.setAlamat("JL.Raja Inal Siregar");
Olta.setTelepon("081209876543");
Olta.setEmail("oltapatrobasH@gmail.com");

System.out.println( "-------------------------------------------" );
System.out.println( "Nama \t\t:"+Anita.getNama() );
System.out.println( "Alamat \t\t:"+Anita.getAlamat() );
System.out.println( "No Telepon \t:"+Anita.getTelepon() );
System.out.println( "Alamat E-mail \t:"+Anita.getEmail ()+ "\n ");
System.out.println( "-------------------------------------------" );

System.out.println( "-------------------------------------------" );
System.out.println( "Nama \t\t:"+Olta.getNama() );
System.out.println( "Alamat \t\t:"+Olta.getAlamat() );
System.out.println( "No Telepon \t:"+Olta.getTelepon() );
System.out.println( "Alamat E-mail\t:"+Olta.getEmail() );
System.out.println( "-------------------------------------------" );

System.out.println("Jumlah  ="+BukuAlamat.getCount());

} 
}
