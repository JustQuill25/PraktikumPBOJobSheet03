package modifikasi;

public class Anggota {
    public String nomorKTP;
    public String nama;
    public int limitPinjaman;
    public int jumlahPinjaman;

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

    // Metode untuk membayar angsuran dengan validasi
    public void angsur(int jumlah) {
        // Validasi minimal angsuran harus 10% dari jumlah pinjaman saat ini
        if (jumlahPinjaman == 0) {
            System.out.println("Tidak ada pinjaman yang harus dibayar.");
            return;
        }
        
        double minimalAngsuran = 0.1 * jumlahPinjaman;

        if (jumlah < minimalAngsuran) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman.");
        } else if (jumlahPinjaman < jumlah) {
            System.out.println("Jumlah angsuran melebihi jumlah pinjaman.");
        } else {
            jumlahPinjaman -= jumlah;
        }
    }
}
