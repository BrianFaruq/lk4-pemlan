import java.util.Scanner;
public class RekeningValas extends Rekening implements TransferGlobal {
    private String mataUang;
    private final int PIN;
    private ProtokolKeamanan protokolKeamanan = new ProtokolKeamanan("SERVER-US-EAST-99");
    private Scanner sc = new Scanner(System.in);


    // Constructor kelas anak
    public RekeningValas(String nomorRekening, double saldo, String mataUang, int PIN) {
        // Keyword 'super()' wajib digunakan untuk memanggil constructor kelas induk (Rekening)
        // Ini memastikan nomorRekening dan saldo diinisialisasi dengan benar.
        super(nomorRekening, saldo);
        this.mataUang = mataUang;
        this.PIN = PIN;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // 1. Dari interface Transaksi (Turunan paling atas)
    @Override
    public void prosesTransaksi(RekeningValas rekeningTujuan, double transferAmount) {
        System.out.println("[Proses] Memulai transaksi untuk rekening: " + nomorRekening);
        System.out.println("Masukkan PIN: ");
        if (protokolKeamanan.validasiKeamanan(sc.nextInt(), PIN)){
            if (transferAmount > this.saldo){
                System.out.println("Saldo tidak cukup.");
                return;
            }else{
                double convertedAmount = konversiMataUang(mataUang, rekeningTujuan.mataUang, transferAmount);
                rekeningTujuan.setSaldo(rekeningTujuan.getSaldo() + convertedAmount);
                this.saldo -= transferAmount;
            }
        }
    }


    // 2. Dari interface TransaksiDigital
    // @Override
    // public void otentikasiDigital() {
    //     System.out.println("[Otentikasi] Memverifikasi PIN dan Biometrik pengguna...");
    // }


    // 3. Dari interface LayananInternasional
    @Override
    public double konversiMataUang(String originCurrency, String targetCurrency, double amount){
        System.out.println("[Konversi] Mengkalkulasi nilai tukar ke mata uang: " + targetCurrency);
        return CurrencyConversion.generalConversion(originCurrency, targetCurrency, amount);
    }


    // 4. Dari interface TransferGlobal
    @Override
    public void kirimLintasNegara(RekeningValas rekeningTujuan, double transferAmount) {
        System.out.println("\n--- Memulai Transfer Lintas Negara ---");
        prosesTransaksi(rekeningTujuan, transferAmount);
       
        // Memanggil variabel final ID_SERVER secara langsung untuk menunjukkan
        // integrasi dengan kelas ProtokolKeamanan
        System.out.println("[Sukses] Dana berhasil dikirim ke luar negeri dalam " + rekeningTujuan.mataUang + "!");
    }
    public void transferLokal(RekeningValas rekeningTujuan, double transferAmount) {
        prosesTransaksi(rekeningTujuan, transferAmount);
    }
}



