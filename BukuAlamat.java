package bukualamat;

public class BukuAlamat {
    private String name;
    private String alamat;
    private String notelp;
    private String email;
    
    public BukuAlamat(){
        
    }
    public BukuAlamat(String nama, String alamat, String notelp, String email){
        this.name = nama;
        this.alamat = alamat;
        this.notelp = notelp;
        this.email = email;
    }
    public void setName (String n){
        this.name = n;
    }
    public String getName (){
        return name;
    }
    public void setAlamat (String a){
        this.alamat = a;
    }
    public String getAlamat(){
        return alamat;
    }
    public void setNoTelp(String t){
        this.notelp = t;
    }
    public String getNoTelp(){
        return notelp;
    }
    public void setEmail(String e){
        this.email = e;
    }
    public String getEmail(){
        return email;
    }
    public void display(){
        System.out.println("**********************************");
        System.out.println("********DATA BUKU ALAMAT**********");
        System.out.println("**********************************");
        System.out.println("Nama          : "+getName());
        System.out.println("Alamat        : "+getAlamat());
        System.out.println("No. Telepon   : "+getNoTelp());
        System.out.println("Alamat E-Mail : "+getEmail());
        System.out.println("**********************************");
    }
}
