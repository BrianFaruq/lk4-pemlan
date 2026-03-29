public interface  TransaksiDigital extends Transaksi {
   // Transaksi digital butuh keamanan tambahan seperti OTP/Token
   void autentikasiDuaFaktor();
   String getPlatformDigital(); // Misal "Mobile Banking" atau "QRIS"

}
