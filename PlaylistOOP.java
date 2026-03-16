/*
Team Assignment 1 - Playlist OOP
Mata Kuliah : Data Structures and Algorithm Analysis

Anggota Kelompok:
1. DAFFA FATHUR RAHMAN - 2902692586 - Computer Science
2. HENDRIKUS AVERO WIDARTO - 2902734664 - Computer Science
3. DUSTIN BALLQIS SAPUTRA - 2902730445 - Computer Science
4. RENATA RAMADHANYANDRA - 2902696426 - Computer Science
5. NAZIF ALFARIZI - 2902726914 - Computer Science
*/

public class PlaylistOOP {

    public static void main(String[] args) {

        // Array digunakan untuk menyimpan kumpulan objek Lagu dalam playlist
        Lagu[] playlist = new Lagu[10];
        int jumlahLagu = 0;

        // Membuat objek Admin dan Member yang merupakan turunan dari class User
        Admin admin = new Admin("AdminUtama");
        Member member = new Member("Member1");

        // Menampilkan informasi akses pengguna (Polymorphism)
        System.out.println("\n===== INFORMASI PENGGUNA =====");
        admin.tampilkanAkses();
        member.tampilkanAkses();

        // Admin menambahkan beberapa lagu ke dalam playlist
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

        // Admin melihat seluruh lagu yang ada di sistem
        System.out.println("\n===== ADMIN MELIHAT PLAYLIST =====");
        admin.lihatDaftarLagu(playlist, jumlahLagu);

        // Member melihat daftar lagu
        System.out.println("\n===== MEMBER MELIHAT PLAYLIST =====");
        member.lihatDaftarLagu(playlist, jumlahLagu);

        // Member melihat detail salah satu lagu berdasarkan index
        System.out.println("\n===== MEMBER MELIHAT DETAIL LAGU =====");
        member.lihatDetailLagu(playlist, 1, jumlahLagu);

        // Member menghitung rata-rata durasi lagu
        System.out.println("\n===== PERHITUNGAN RATA-RATA DURASI =====");
        member.hitungRataDurasi(playlist, jumlahLagu);

        // Program selesai
        System.out.println("\n===== SISTEM PLAYLIST SELESAI =====");
    }
}