import java.util.Date;

class Reservasi {
    private static int counter = 1;
    private String idReservasi;
    private User user;
    private Dokter dokter;
    private Date tanggal;
    private String jam;
    private JadwalDokter jadwal;

    public Reservasi(String idReservasi, User user, Dokter dokter, Date tanggal, String jam, JadwalDokter jadwal) {
        this.idReservasi = "RSV-" + counter++;
        this.user = user;
        this.dokter = dokter;
        this.tanggal = tanggal;
        this.jam = jam;
        this.jadwal = jadwal;
    }

    public String getidReservasi() {
        return idReservasi;
    }

    public void setidReservasi(String idReservasi) {
        this.idReservasi = idReservasi;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Dokter getDokter() {
        return dokter;
    }

    public void setDokter(Dokter dokter) {
        this.dokter = dokter;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getjam() {
        return jam;
    }

    public void setjam(String jam) {
        this.jam = jam;
    }

    public JadwalDokter getJadwal() {
        return jadwal;
    }

    public void setJadwal(JadwalDokter jadwal) {
        this.jadwal = jadwal;
    }

    @Override
    public String toString() {
        return "Reservasi ID: " + idReservasi + ", User: " + user.getNama() + ", Dokter: " + dokter.getNama() + " (" + dokter.getSpesialisasi() + "), Jadwal: " + jadwal;
    }
}
