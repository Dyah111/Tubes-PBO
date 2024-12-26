import java.util.*;

class Dokter {
    private String id_dokter;
    private String nama;
    private List<JadwalDokter> jadwalList;
    private String spesialisasi;

    public Dokter(String id_dokter, String namaDr, String spesialisasiDr) {
        this.id_dokter = id_dokter;
        this.nama = namaDr;
        this.spesialisasi = spesialisasiDr;
    }

    public void mengeditJadwalDokter(JadwalDokter jadwal) {
        jadwalList.add(jadwal);
        System.out.println("Jadwal dokter telah diedit.");
    }

    public void lihatJadwal() {
        for (JadwalDokter jadwal : jadwalList) {
            System.out.println(jadwal);
        }
    }

    public List<JadwalDokter> getJadwalList() {
        return jadwalList;
    }

    public void setJadwalList(List<JadwalDokter> jadwalList) {
        this.jadwalList = jadwalList;
    }

    public String getId_dokter() {
        return id_dokter;
    }

    public void setId_dokter(String id_dokter) {
        this.id_dokter = id_dokter;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public void setSpesialisasi(String spesialisasi) {
        this.spesialisasi = spesialisasi;
    }

    public void tambahJadwal(JadwalDokter jadwalDokter) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tambahJadwal'");
    }

    
}
