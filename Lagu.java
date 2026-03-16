public class Lagu {

    private String judul;
    private String penyanyi;
    private int durasi;

    // Constructor untuk inisialisasi data lagu
    public Lagu(String judul, String penyanyi, int durasi) {
        this.judul = judul;
        this.penyanyi = penyanyi;
        this.durasi = durasi;
    }

    // Getter dan setter judul
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    // Getter dan setter penyanyi
    public String getPenyanyi() {
        return penyanyi;
    }

    public void setPenyanyi(String penyanyi) {
        this.penyanyi = penyanyi;
    }

    // Getter dan setter durasi
    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    // Tampilkan detail lagu ke layar
    public void tampilkanDetail() {
        System.out.println("Judul    : " + judul);
        System.out.println("Penyanyi : " + penyanyi);
        System.out.println("Durasi   : " + durasi + " detik");
    }
}