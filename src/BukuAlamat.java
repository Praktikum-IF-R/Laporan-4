public class BukuAlamat {

    private String Nama, Telp, Alamat, Email;

    public BukuAlamat (String Nama, String Alamat,
 String Email, String Telp){
        this.Nama=Nama;
        this.Alamat=Alamat;
        this.Email= Email;
        this.Telp= Telp;
    }
public BukuAlamat(){

}
    public void setNama (String n){
        this.Nama=n;
    }
    public void setAlamat (String a){
        this.Alamat = a;
    }
    public void setEmail (String e){
        this.Email= e;
    }
    public void setTelp (String t){
        this.Telp= t;
    }
    public String getNama(){
        return Nama;
    }
    public String getAlamat (){
        return Alamat ;
    }
    public String getEmail (){
        return Email;
    }
    public String getTelp(){
        return Telp;
    }
    public void displayMessage() {
        System.out.println("==================================================");
        System.out.println("Nama           : " + getNama());
        System.out.println("Alamat         : " + getAlamat());
        System.out.println("Email          : " + getEmail());
        System.out.println("Nomor telepon  : " + getTelp());
        System.out.println("==================================================");
    }

}

