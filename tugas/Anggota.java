package tugas;

public class Anggota {
    private String nomorKTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    // Konstruktor
    public Anggota(String nomorKTP, String nama, int limitPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0; // Awalnya jumlah pinjaman adalah 0
    }

    // Getter untuk nomorKTP
    public String getNomorKTP() {
        return nomorKTP;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Getter untuk limitPinjaman
    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    // Getter untuk jumlahPinjaman
    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    // Metode untuk meminjam uang
    public void pinjam(int jumlah) {
        if (jumlahPinjaman + jumlah > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += jumlah;
        }
    }

    // Metode untuk membayar angsuran
    public void angsur(int jumlah) {
        if (jumlahPinjaman < jumlah) {
            System.out.println("Jumlah angsuran melebihi jumlah pinjaman.");
        } else {
            jumlahPinjaman -= jumlah;
        }
    }
}
