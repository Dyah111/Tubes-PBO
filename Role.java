abstract class Role {
    protected String id_role;
    protected String nama_role;
    protected String nama;
    protected String email;
    protected String password;

    public Role(String nama, String email, String password) {
        this.nama = nama;
        this.email = email;
        this.password = password;
    }

    public String getNamaRole() {
        return nama_role;
    }

    public void setNamaRole(String nama_role) {
        this.nama_role = nama_role;
    }

    public void showRole() {
        System.out.println("Role: " + nama_role);
    }
}