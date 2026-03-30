public interface  TransaksiDigital extends Transaksi {
   // Transaksi digital butuh keamanan tambahan seperti OTP/Token
   public void transferLokal(RekeningValas rekeningTujuan, double transferAmount);
   //String getPlatformDigital(); // Misal "Mobile Banking" atau "QRIS"

}
