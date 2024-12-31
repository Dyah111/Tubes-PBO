import java.text.SimpleDateFormat;
import java.util.*;

class JadwalDokter {
    private String time;
    private String timeSelesai;
    private Date tanggal;

    public JadwalDokter(String time, String timeSelesai, Date tanggal) {
        this.time = time;
        this.timeSelesai = timeSelesai;
        this.tanggal = tanggal;
    }

    public String getJam() {
        return time;
    }

    public String getJamSelesai() {
        return timeSelesai;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public Date getEndDate() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            return sdf.parse(new SimpleDateFormat("yyyy-MM-dd").format(tanggal) + " " + timeSelesai);
        } catch (Exception e) {
            return null;
        }
    }
}