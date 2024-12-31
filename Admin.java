import java.util.*;

class Admin extends Role {
    private String id_admin;

    public Admin(String id_admin, String nama, String email, String password) {
        super(nama, email, password);
        this.id_admin = id_admin;
        this.nama_role = "Admin";
    }

    public String getIdAdmin() {
        return id_admin;
    }

    public void addDokter(ArrayList<Dokter> daftarDokter, Dokter dokter) {
        daftarDokter.add(dokter);
        System.out.println("Dokter berhasil ditambahkan: " + dokter.getNama());
    }
}