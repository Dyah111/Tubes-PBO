import java.util.*;

class Admin extends Role {
    private String id_admin;

    public Admin(String id_admin, String nama, String email, String password, String nama_role) {
        super(nama, email, password, nama_role = "Admin");
        this.id_admin = id_admin;
    }

    public void lihatReservasi(List<Reservasi> reservasiList) {
        for (Reservasi r: reservasiList) {
            System.out.println(r);
        }
    }

    public String getId_admin() {
        return id_admin;
    }

    public void setId_admin(String id_admin) {
        this.id_admin = id_admin;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return this.getRole();
    }

    public void setRole(String role) {
        this.id_role = role;
    }

}