import java.util.*;

class Dokter {
    private String id_dokter;
    private String nama;
    private String spesialis;
    private ArrayList<JadwalDokter> jadwal = new ArrayList<>();
    private int currentAntrian = 1;

    public Dokter(String id_dokter, String nama, String spesialis) {
        this.id_dokter = id_dokter;
        this.nama = nama;
        this.spesialis = spesialis;
    }

    public String getIdDokter() {
        return id_dokter;
    }

    public String getNama() {
        return nama;
    }

    public String getSpesialis() {
        return spesialis;
    }

    public void addJadwal(JadwalDokter jadwalDokter) {
        jadwal.add(jadwalDokter);
        System.out.println("Jadwal ditambahkan untuk Dokter: " + nama);
    }

    public void showJadwal() {
        System.out.println("Jadwal Dokter " + nama + ":");
        for (JadwalDokter j : jadwal) {
            System.out.println("Tanggal: " + j.getTanggal() + " | Jam: " + j.getJam() + " - " + j.getJamSelesai());
        }
    }

    public ArrayList<JadwalDokter> getJadwal() {
        return jadwal;
    }

    public int getNextAntrian(JadwalDokter jadwalDokter) {
        Date now = new Date();
        if (now.after(jadwalDokter.getEndDate())) {
            currentAntrian = 1; // Reset antrian untuk hari berikutnya
        }
        return currentAntrian++;
    }
}
