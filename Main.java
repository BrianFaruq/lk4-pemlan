public class Main {
    public static void main(String[] args) {
        // 1. Inisialisasi sistem keamanan dengan ID Server yang final (tidak bisa diubah)
        ProtokolKeamanan protokol = new ProtokolKeamanan("SERVER-US-EAST-99");
 
 
        // 2. Membuat objek Rekening Valas baru
        // Kita memberikan modal awal 5000, mata uang USD, dan memasukkan objek protokol keamanan
        RekeningValas akunValasKu = new RekeningValas("123-456-789", 5000.0, "USD", protokol);
 
 
        // 3. Menampilkan info awal
        System.out.println("=== Sistem Bank GakMauRugi ===");
        akunValasKu.cekSaldo();
 
 
        // 4. Menjalankan fungsi utama yang membuktikan multiple inheritance bekerja
        akunValasKu.kirimLintasNegara();
    }
 }
 
