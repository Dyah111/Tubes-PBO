import java.util.*;

class User extends Role {
    private String id_user;
    private Reservasi reservasi;
    private List<Reservasi> reservasiList;

    public User(String id_user, String nama, String email, String password, String nama_role) {
        super(nama, email, password, nama_role = "User");
        this.id_user = id_user;
    }

    public void buatReservasi(Reservasi reservasi) {
        reservasiList.add(reservasi);
        System.out.println("Reservasi berhasil dibuat");
    }

    public void batalkanReservasi(String idReservasi) {
        reservasiList.removeIf(r -> r.getidReservasi().equals(idReservasi));
        System.out.println("Reservasi berhasil dibatalkan");
    }

    public void setReservasiList(List<Reservasi> reservasiList) {
        this.reservasiList = reservasiList;
    }

    public void lihatReservasi() {
        for (Reservasi r : reservasiList) {
            System.out.println(r);
        }
    }

    public List<Reservasi> getReservasiList() {
        return reservasiList;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
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