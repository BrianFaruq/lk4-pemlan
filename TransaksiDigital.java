public interface  TransaksiDigital extends Transaksi {
   // Transaksi digital butuh keamanan tambahan seperti OTP/Token
   public void otentikasiDigital();
   //String getPlatformDigital(); // Misal "Mobile Banking" atau "QRIS"

}
