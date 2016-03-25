package Enkapsulasi;

public class MainAlamat {
    public static void main(String[] args){
    BukuAlamat fd1 = new BukuAlamat("Danil Ishutin");
    fd1.setAlamat("Jl. Watugong No.40");
    fd1.setEmail("dendiNaVi@gmail.com");
    fd1.setNotelp(628132423);
    BukuAlamat fd2 = new BukuAlamat("Gustav M", "Jl. Pisang Kipas No.41");
    fd2.setEmail("s4Alliance@gmail.com");
    fd2.setNotelp(628134255);
    BukuAlamat fd3 = new BukuAlamat("Roman Fuminok", "Jl. Kembang Turi No.42", "resolut1on@hotmail.com");
    fd3.setNotelp(628132764);
    BukuAlamat fd4 = new BukuAlamat("Fadhyl Farhan", "Jl. MT.Haryono No.30", "EsprexiA@hotmail.co.id", 682114572);
    fd1.TampilPesan();
    fd1.TampilPesan2();
    fd2.TampilPesan2();
    fd3.TampilPesan2();
    fd4.TampilPesan2();
    }
}
