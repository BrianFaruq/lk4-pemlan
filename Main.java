public class Main {
    public static void main(String[] args) {
        // 1. Inisialisasi sistem keamanan dengan ID Server yang final (tidak bisa diubah)
        ProtokolKeamanan protokol = new ProtokolKeamanan("SERVER-US-EAST-99");
 
 
        // 2. Membuat objek Rekening Valas baru
        // Kita memberikan modal awal 5000, mata uang USD, dan memasukkan objek protokol keamanan
        RekeningValas akunValas  = new RekeningValas("123-456-789", 5000.0, "EUR", 1234);
        RekeningValas akunValas2 = new RekeningValas("987-654-321", 15_000_000.0, "IDR", 6767);
        RekeningValas akunValas3 = new RekeningValas("271-000-000", 5000.0, "EUR", 4141);
 
 
        // 3. Menampilkan info awal
        System.out.println("=== Sistem Bank GakMauRugi ===");
        akunValas.cekSaldo();
        akunValas2.cekSaldo();
        akunValas3.cekSaldo();
 
 
        // 4. Menjalankan fungsi utama yang membuktikan multiple inheritance bekerja
        double transferAmount = 1000.00;
        akunValas.kirimLintasNegara(akunValas2, transferAmount);
        akunValas3.transferLokal(akunValas, transferAmount);


        akunValas.cekSaldo();
        akunValas2.cekSaldo();  
        akunValas3.cekSaldo();
    }
 }
 
