abstract class Role {
    protected String id_role;
    protected String nama;
    protected String email;
    protected String password;

    public Role(String id_role, String nama, String email, String password) {
        this.id_role = id_role;
        this.nama = nama;
        this.email = email;
        this.password = password;
    }

    public String getid_role() {
        return id_role;
    }

    public void setid_role(String id_role) {
        this.id_role = id_role;
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

