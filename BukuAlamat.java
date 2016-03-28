package implementasi;
public class BukuAlamat {
    private String []nama=new String [100];
    private String []alamat=new String[100];
    private String []notel =new String[100];
    private String []email=new String[100];
    
    private static int count;
    private static int temp;
    
    public BukuAlamat(){
        count=0;
    }
    public String getNama(int temp){
        return nama[temp];
    }
    public String getAlamat(int temp){
        return alamat[temp];
    }
    public String getNoTelpon(int temp){
        return notel[temp];
    }
    public String getEmail(int temp){
        return email[temp];
    }
    public void setNama(String Nama ,int temp ,String Alamat ,String Notel ,String Email){
        nama[temp] = Nama;
        alamat [temp]=Alamat;
        notel [temp] =Notel;
        email [temp] =Email;
        count++;
    }
    public static int getCount(){
        return count;
    }
}
