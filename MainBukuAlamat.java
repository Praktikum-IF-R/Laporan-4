package implementasi;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MainBukuAlamat {
    public static void main(String [] args){
BufferedReader dataIn=new BufferedReader(new InputStreamReader(System.in));
String [] nama =new String [100];
String [] alamat =new String [100];
String [] notel=new String [100];
String [] email=new String [100];

BukuAlamat DataBuku =new BukuAlamat();
for (int data =0; data<3; data++){
    System.out.print("Masukan Nama:");
                try{
                    nama[data]=dataIn.readLine();
                }catch(IOException e){
                    System.out.print("Eror");
                }
    System.out.print("Masukan Alamat:");
                try{
                    alamat[data]=dataIn.readLine();
                }catch(IOException e){
                    System.out.print("Eror");
                }
    System.out.print("Masukan No Telepon:");
                try{
                    notel[data]=dataIn.readLine();
                }catch(IOException e){
                    System.out.print("Eror");
                }
    System.out.print("Masukan E-Mail:");
                try{
                    email[data]=dataIn.readLine();
                }catch(IOException e){
                    System.out.print("Eror");
                }            
}
for(int data =0; data<3; data++){
    DataBuku.setNama(nama [data],data,alamat[data],notel[data],email[data]);
    System.out.println("---------------------------------------------");
    System.out.println("Nama            :"+DataBuku.getNama(data));
    System.out.println("Alamat          :"+DataBuku.getAlamat(data));
    System.out.println("No Telepon      :"+DataBuku.getNoTelpon(data));
    System.out.println("Alamat E-Mail   :"+DataBuku.getEmail(data));
    System.out.println("---------------------------------------------");
}
        System.out.println("\nTotal Jumlah Siswa :"+BukuAlamat.getCount());
    }
}
