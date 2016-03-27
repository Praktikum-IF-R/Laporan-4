package Encapsulation;
public class Buku {
    private String nama, alamat, no, mail;
    public Buku(){
        System.out.println("====BUKU ALAMAT====");
    }
    public void setName(String nam) {
        nama = nam;
    }
    public void setAlamat(String alam) {
        alamat = alam;
    }
    public void setNo(String nomer) {
        no = nomer;
    }
    public void setMail(String email) {
        mail = email;
    }
    public String getName() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public String getNo() {
        return no;
    }
    public String getMail() {
        return mail;
    }
}
