public class RekeningValas extends Rekening implements TransferGlobal {
    private String mataUang;
    private ProtokolKeamanan sistemKeamanan;


    // Constructor kelas anak
    public RekeningValas(String nomorRekening, double saldo, String mataUang, ProtokolKeamanan sistemKeamanan) {
        // Keyword 'super()' wajib digunakan untuk memanggil constructor kelas induk (Rekening)
        // Ini memastikan nomorRekening dan saldo diinisialisasi dengan benar.
        super(nomorRekening, saldo);
        this.mataUang = mataUang;
        this.sistemKeamanan = sistemKeamanan;
    }


    // 1. Dari interface Transaksi (Turunan paling atas)
    @Override
    public void prosesTransaksi() {
        System.out.println("[Proses] Memulai transaksi untuk rekening: " + nomorRekening);
    }


    // 2. Dari interface TransaksiDigital
    @Override
    public void otentikasiDigital() {
        System.out.println("[Otentikasi] Memverifikasi PIN dan Biometrik pengguna...");
    }


    // 3. Dari interface LayananInternasional
    @Override
    public void konversiMataUang() {
        System.out.println("[Konversi] Mengkalkulasi nilai tukar ke mata uang: " + mataUang);
    }


    // 4. Dari interface TransferGlobal
    @Override
    public void kirimLintasNegara() {
        System.out.println("\n--- Memulai Transfer Lintas Negara ---");
        prosesTransaksi();
        otentikasiDigital();
        konversiMataUang();
       
        // Memanggil variabel final ID_SERVER secara langsung untuk menunjukkan
        // integrasi dengan kelas ProtokolKeamanan
        System.out.println("[Sistem] Transaksi diamankan melalui server: " + sistemKeamanan.ID_SERVER);
        System.out.println("[Sukses] Dana berhasil dikirim ke luar negeri dalam " + mataUang + "!");
    }


}
