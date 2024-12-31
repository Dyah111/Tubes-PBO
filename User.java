import java.text.SimpleDateFormat;
import java.util.*;

class User extends Role {
    private String id_user;
    private Reservasi reservasi;

    public User(String id_user, String nama, String email, String password) {
        super(nama, email, password);
        this.id_user = id_user;
        this.nama_role = "User";
    }

    public void buatReservasi(ArrayList<Dokter> daftarDokter, Dokter dokter, String tanggalInput, String jam, String status) {
        // Mengubah input tanggal menjadi objek Date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date tanggalReservasi = null;
        try {
            tanggalReservasi = sdf.parse(tanggalInput);
        } catch (Exception e) {
            System.out.println("Tanggal tidak valid.");
            return;
        }
    
        // Memeriksa ketersediaan dokter pada tanggal yang dipilih dan jam yang diminta
        JadwalDokter jadwalTersedia = null;
        for (JadwalDokter jadwal : dokter.getJadwal()) {
            // Mengonversi tanggal dari jadwal ke format "yyyy-MM-dd" tanpa jam dan menit
            String jadwalTanggalStr = sdf.format(jadwal.getTanggal());
            String tanggalReservasiStr = sdf.format(tanggalReservasi);
    
            // Jika tanggal sama, kita periksa apakah jam yang diminta cocok dengan jadwal
            if (jadwalTanggalStr.equals(tanggalReservasiStr)) {
                // Mengambil jam dari input user dan bandingkan dengan jam mulai jadwal dokter
                if (jadwal.getJam().equals(jam)) {
                    jadwalTersedia = jadwal;
                    break;
                }
            }
        }
    
        if (jadwalTersedia != null) {
            int nomorAntrian = dokter.getNextAntrian(jadwalTersedia);
            this.reservasi = new Reservasi("R" + (int)(Math.random() * 1000), id_user, dokter.getIdDokter(), tanggalReservasi, status, jadwalTersedia, nomorAntrian);
            System.out.println("Reservasi berhasil dibuat untuk Dokter: " + dokter.getNama() + " dengan nomor antrian: " + nomorAntrian);
            System.out.println("Detail Reservasi:");
            System.out.println("Nama: " + this.nama);
            System.out.println("Dokter: " + dokter.getNama() + " (" + dokter.getSpesialis() + ")");
            System.out.println("Tanggal: " + new SimpleDateFormat("yyyy-MM-dd").format(tanggalReservasi));
            System.out.println("Jam: " + jam);
            System.out.println("Nomor Antrian: " + nomorAntrian);
        } else {
            System.out.println("Dokter tidak tersedia pada tanggal dan jam yang dipilih.");
        }
    }
}