public interface LayananInternasional extends Transaksi {
    // Transaksi luar negeri butuh konversi mata uang dan biaya admin khusus
    public double konversiMataUang(String originCurrency, String targetCurrency, double amount);


}
