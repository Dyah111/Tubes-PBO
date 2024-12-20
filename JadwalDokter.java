import java.util.Date;

class JadwalDokter {
    private String id_jadwal;
    private String time;
    private Date tanggal;
    private Reservasi reservasi;

    public JadwalDokter(String id_jadwal, String time, Date tanggal, Dokter dokter) {
        this.id_jadwal = id_jadwal;
        this.time = time;
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

    public String getId_jadwal() {
        return id_jadwal;
    }

    public void setId_jadwal(String id_jadwal) {
        this.id_jadwal = id_jadwal;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

}
