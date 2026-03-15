public class Member extends User {

    public Member(String nama) {
        super(nama, "Member");
    }

    // Override method dari class User
    @Override
    public void tampilkanAkses() {
        System.out.println("=== Detail Akses Pengguna ===");
        System.out.println("Nama Pengguna : " + getNama());
        System.out.println("Role          : " + getRole());
        System.out.println("Status Akses  : MEMBER");
        System.out.println("--------------------------------------------------");
    }

    // Melihat daftar lagu
    public void lihatDaftarLagu(Lagu[] playlist, int jumlahSekarang) {
        System.out.println("\n--- DAFTAR LAGU ---");

        if (jumlahSekarang == 0) {
            System.out.println("Belum ada lagu dalam playlist.");
        } else {
            for (int i = 0; i < jumlahSekarang; i++) {
                System.out.println((i + 1) + ". " + playlist[i].getJudul());
            }
        }
    }

    // Melihat detail lagu berdasarkan nomor
    public void lihatDetailLagu(Lagu[] playlist, int index, int jumlahSekarang) {

        if (index >= 0 && index < jumlahSekarang) {
            System.out.println("\n--- DETAIL LAGU ---");
            playlist[index].tampilkanDetail();
        } else {
            System.out.println("Lagu tidak ditemukan.");
        }
    }

    // Menghitung rata-rata durasi lagu
    public void hitungRataDurasi(Lagu[] playlist, int jumlahSekarang) {

        if (jumlahSekarang == 0) {
            System.out.println("Tidak ada lagu untuk dihitung.");
            return;
        }

        int totalDurasi = 0;

        for (int i = 0; i < jumlahSekarang; i++) {
            totalDurasi += playlist[i].getDurasi();
        }

        double rata = (double) totalDurasi / jumlahSekarang;

        System.out.println("Rata-rata durasi lagu: " + rata + " detik");
        //done ya tugas saya nazif
    }
}
