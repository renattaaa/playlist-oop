public class Admin extends User {

    public Admin(String nama) {
        super(nama, "Admin");
    }

    @Override
    public void tampilkanAkses() {
        System.out.println("=== Detail Akses Pengguna ===");
        System.out.println("Nama Pengguna : " + getNama());
        System.out.println("Role          : " + getRole());
        System.out.println("Status Akses  : ADMIN");
        System.out.println("--------------------------------------------------");
    }

    public void tambahLagu(Lagu[] playlist, Lagu laguBaru, int jumlahSekarang) {
        if (jumlahSekarang < playlist.length) {
            playlist[jumlahSekarang] = laguBaru;
            System.out.println("Berhasil menambahkan lagu: " + laguBaru.getJudul());
        } else {
            System.out.println("Gagal menambah lagu. Kapasitas playlist penuh!");
        }
    }

    public void lihatDaftarLagu(Lagu[] playlist, int jumlahSekarang) {
        System.out.println("\n--- DAFTAR LAGU DALAM SISTEM ---");
        if (jumlahSekarang == 0) {
            System.out.println("Belum ada lagu yang tersimpan.");
        } else {
            for (int i = 0; i < jumlahSekarang; i++) {
                System.out.print((i + 1) + ". ");
                playlist[i].tampilkanInfo();
                System.out.println("--------------------------------");
            }
        }
    }
}
