package Praktikum03;

public class Motor {
    private String merek;
    private int kecepatan;
    private boolean statusMesin;
    private static final int KECEPATAN_MAKSIMAL = 100; // Batas maksimal kecepatan

    // Getter untuk merek
    public String getMerek() {
        return merek;
    }

    // Setter untuk merek
    public void setMerek(String merek) {
        this.merek = merek;
    }

    // Getter untuk kecepatan
    public int getKecepatan() {
        return kecepatan;
    }

    // Setter untuk kecepatan dengan validasi batas maksimal dan nilai negatif
    public void setKecepatan(int kecepatan) {
        if (kecepatan < 0) {
            System.out.println("Kecepatan tidak boleh negatif.");
            this.kecepatan = 0; // Set kecepatan ke 0 jika nilai negatif
        } else if (!statusMesin && kecepatan > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
            this.kecepatan = 0; // Set kecepatan ke 0 jika mesin mati
        } else if (kecepatan > KECEPATAN_MAKSIMAL) {
            System.out.println("Kecepatan tidak boleh lebih dari " + KECEPATAN_MAKSIMAL);
            this.kecepatan = KECEPATAN_MAKSIMAL; // Set kecepatan ke batas maksimal jika melebihi
        } else {
            this.kecepatan = kecepatan;
        }
    }

    // Getter untuk statusMesin
    public boolean isStatusMesin() {
        return statusMesin;
    }

    // Setter untuk statusMesin
    public void setStatusMesin(boolean statusMesin) {
        this.statusMesin = statusMesin;
    }

    // Metode untuk menampilkan informasi motor
    public void displayInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Status Mesin: " + (statusMesin ? "On" : "Off"));
        System.out.println("Kecepatan: " + kecepatan);
    }
}

