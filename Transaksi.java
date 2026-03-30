public interface Transaksi {
    /**
     * Abstract method proses transaksi
     */
    void prosesTransaksi(RekeningValas rekeningValas, double transferAmount);

}
