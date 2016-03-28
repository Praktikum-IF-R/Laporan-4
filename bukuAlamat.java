public class bukuAlamat {
    private String nama;
    private String alamat;
    private String noTelp;
    private String email;
    public bukuAlamat(){
        nama = "";
        alamat = "";
        noTelp = "";
        email = "";
    }
    public bukuAlamat(String a, String b, String c, String d){
        nama = a;
        alamat = b;
        noTelp = c;
        email = d;
    }
    public void setNama(String a){
        nama = a;
    }
    public String getNama(){
        return nama;
    }
    public void setAlamat(String b){
        alamat = b;
    }
    public String getAlamat(){
        return alamat;
    }
    public void setNoTelp(String c){
        noTelp = c;
    }
    public String getNoTelp(){
        return noTelp;
    }
    public void setEmail(String d){
        email = d;
    }
    public String getEmail(){
        return email;
    }
    public void displayMessage(){
        System.out.println("Nama   : "+getNama());
        System.out.println("Alamat : "+getAlamat());
        System.out.println("No.Telp: "+getNoTelp());
        System.out.println("E-mail : "+getEmail());
        System.out.println("");
    }
}
