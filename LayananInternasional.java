public interface LayananInternasional extends Transaksi {
    // Transaksi luar negeri butuh konversi mata uang
    public double konversiMataUang(String originCurrency, String targetCurrency, double amount);


}
