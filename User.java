class User extends Role {
    private String id_user;
    private Reservasi reservasi;

    public User(String id_user, String nama, String email, String password, String nama_role) {
        super(nama, email, password, nama_role = "User");
        this.id_user = id_user;
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
        this.nama_role = role;
    }
}