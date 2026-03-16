public class PlaylistOOP {

    public static void main(String[] args) {

        // Array digunakan untuk menyimpan kumpulan objek Lagu dalam playlist
        Lagu[] playlist = new Lagu[10];
        int jumlahLagu = 0;

        // Membuat objek Admin dan Member yang merupakan turunan dari class User (Inheritance)
        Admin admin = new Admin("AdminUtama");
        Member member = new Member("Member1");

        // Method tampilkanAkses() menunjukkan polymorphism karena dioverride oleh Admin dan Member
        System.out.println("\n===== INFORMASI PENGGUNA =====");
        admin.tampilkanAkses();
        member.tampilkanAkses();

        // Admin menambahkan beberapa objek Lagu ke dalam array playlist
        System.out.println("\n===== ADMIN MENAMBAHKAN LAGU =====");

        Lagu lagu1 = new Lagu("Beautiful Imperfection", "Guthrie Govan", 132);
        admin.tambahLagu(playlist, lagu1, jumlahLagu);
        jumlahLagu++;

        Lagu lagu2 = new Lagu("I Want You Back", "The Jackson 5", 176);
        admin.tambahLagu(playlist, lagu2, jumlahLagu);
        jumlahLagu++;

        Lagu lagu3 = new Lagu("I Loved Her First", "Heartland", 212);
        admin.tambahLagu(playlist, lagu3, jumlahLagu);
        jumlahLagu++;

        // Admin menampilkan seluruh lagu yang ada di playlist
        System.out.println("\n===== ADMIN MELIHAT PLAYLIST =====");
        admin.lihatDaftarLagu(playlist, jumlahLagu);

        // Member juga dapat melihat daftar lagu yang tersedia
        System.out.println("\n===== MEMBER MELIHAT PLAYLIST =====");
        member.lihatDaftarLagu(playlist, jumlahLagu);

        // Member dapat melihat detail lagu berdasarkan index dalam array
        System.out.println("\n===== MEMBER MELIHAT DETAIL LAGU =====");
        member.lihatDetailLagu(playlist, 1, jumlahLagu);

        // Member menghitung rata-rata durasi lagu yang tersimpan dalam playlist
        System.out.println("\n===== PERHITUNGAN RATA-RATA DURASI =====");
        member.hitungRataDurasi(playlist, jumlahLagu);

        // Program selesai dijalankan setelah semua fitur playlist digunakan
        System.out.println("\n===== SISTEM PLAYLIST SELESAI =====");
    }
}