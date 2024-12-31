import java.util.*;

class Reservasi {
    private String id_reservasi;
    private String id_user;
    private String id_dokter;
    private Date tanggal;
    private String status;
    private JadwalDokter jadwal;
    private int nomorAntrian;

    public Reservasi(String id_reservasi, String id_user, String id_dokter, Date tanggal, String status, JadwalDokter jadwal, int nomorAntrian) {
        this.id_reservasi = id_reservasi;
        this.id_user = id_user;
        this.id_dokter = id_dokter;
        this.tanggal = tanggal;
        this.status = status;
        this.jadwal = jadwal;
        this.nomorAntrian = nomorAntrian;
    }
}
