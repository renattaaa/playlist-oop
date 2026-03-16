public class User {

 
    private String nama;
    private String role;

    
    public User(String nama, String role) {
        this.nama = nama;
        this.role = role;
    }


    public String getNama() {
        return nama;
    }

    
    public void setNama(String nama) {
        this.nama = nama;
    }


    public String getRole() {
        return role;
    }

    
    public void setRole(String role) {
        this.role = role;
    }

    
    public void tampilkanAkses() {
        System.out.println("User: " + nama);
        System.out.println("Role: " + role);
        System.out.println("Hak akses umum.");
    }
}
