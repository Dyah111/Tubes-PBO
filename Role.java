abstract class Role {
    protected String nama_role;
    protected String nama;
    protected String email;
    protected String password;

    public Role(String nama_role, String nama, String email, String password) {
        this.nama_role = nama_role;
        this.nama = nama;
        this.email = email;
        this.password = password;
    }

    public String getNama_role() {
        return nama_role;
    }

    public void setNama_role(String nama_role) {
        this.nama_role = nama_role;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

