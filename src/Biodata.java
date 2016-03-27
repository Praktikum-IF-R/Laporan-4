package Praktik04;
public class Biodata {
    private String nama, alamat, nomor, email;
    
    public Biodata(){
        
    }
    public void setNama(String a){
        nama = a;
    }
    public void setAlamat(String a){
        alamat = a;
    }
    public void setNomor(String a){
        nomor = a;
    }
    public void setEmail(String a){
        email = a;
    }
    private String getNama(){
        return nama;
    }
    private String getAlamat(){
        return alamat;
    }
    private String getNomor(){
        return nomor;
    }
    private String getEmail(){
        return email;
    }
    public void displayInfo(){
        System.out.println("====================SHOW====================");
        System.out.println("Nama\t\t: "+getNama());
        System.out.println("Alamat\t\t: "+getAlamat());
        System.out.println("Nomor Telepon\t: "+getNomor());
        System.out.println("Email\t\t: "+getEmail());
        System.out.println("============================================");
    }
}
