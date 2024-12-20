class Dokter {
    private String id_dokter;
    private String nama;
    private JadwalDokter jadwal;
    private String spesialisasi;

    public Dokter(String id_dokter, String namaDr, String spesialisasiDr) {
        this.id_dokter = id_dokter;
        this.nama = namaDr;
        this.spesialisasi = spesialisasiDr;
    }

    public void mengeditJadwalDokter() {
        System.out.println("Jadwal dokter diedit.");
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

    public JadwalDokter getJadwal() {
        return jadwal;
    }

    public void setJadwal(JadwalDokter jadwal) {
        this.jadwal = jadwal;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public void setSpesialisasi(String spesialisasi) {
        this.spesialisasi = spesialisasi;
    }

    
}
