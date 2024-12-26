import java.util.*;

class JadwalDokter {
    private String id_jadwal;
    private String jam;
    private Date tanggal;
    private List<Reservasi> reservasiList;

    public JadwalDokter(String id_jadwal, String jam, Date tanggal, Dokter dokter) {
        this.id_jadwal = id_jadwal;
        this.jam = jam;
        this.tanggal = tanggal;
    }

    public void addDokter(Dokter dokter) {
        System.out.println("Dokter " + dokter.getNama() + " ditambahkan ke jadwal.");
    }

    public void showJadwal() {
        System.out.println("Menampilkan jadwal dokter.");
    }

    public void showDaftarDokter() {
        System.out.println("Menampilkan daftar dokter.");
    }

    public List<JadwalDokter> getJadwalList() {
        return getJadwalList();
    }

    public String getId_jadwal() {
        return id_jadwal;
    }

    public void setId_jadwal(String id_jadwal) {
        this.id_jadwal = id_jadwal;
    }

    public String getjam() {
        return jam;
    }

    public void setjam(String jam) {
        this.jam = jam;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    @Override
    public String toString() {
        return "Tanggal: " + tanggal + ", Jam: " + jam;
    }

}
