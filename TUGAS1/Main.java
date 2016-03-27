
package TUGAS1;

public class Main {
    public static void main(String[] args) {
        BukuAlamat a = new BukuAlamat("I Gede Adi Brahman","jl.veteran","087852892111","adi@gmail.com");
        System.out.println("Nama : "+a.getNama()+"\nAlamat : "+a.getAlamat()+"\nNomor Telepon : "+a.getNomorTelepon()+"\nAlamat E-mail : "+a.getAlamatEmail());
        System.out.println("\nSetelah dilakukan perubahan informasi\n");
        a.setNama("I Gede Adi Brahman Nugraha");
        a.setAlamat("jl.veteran no.100");
        a.setNomorTelepon("087852892123");
        a.setAlamatEmail("adibrahman@gmail.com");
        System.out.println("Nama : "+a.getNama()+"\nAlamat : "+a.getAlamat()+"\nNomor Telepon : "+a.getNomorTelepon()+"\nAlamat E-mail : "+a.getAlamatEmail());
    }
}
