import java.util.Date;

class Reservasi {
    private String id_reservasi;
    private User user;
    private Dokter dokter;
    private Date tanggal;
    private String time;

    public Reservasi(String id_reservasi, User user, Dokter dokter, Date tanggal, String time) {
        this.id_reservasi = id_reservasi;
        this.user = user;
        this.dokter = dokter;
        this.tanggal = tanggal;
        this.time = time;
    }

    public void confirmasiReservation() {

    }

    public void cancelReservasi() {
        
    }

    public String getId_reservasi() {
        return id_reservasi;
    }

    public void setId_reservasi(String id_reservasi) {
        this.id_reservasi = id_reservasi;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
