public interface TransferGlobal extends LayananInternasional, TransaksiDigital {
    /**
     * Abstract method kirim lintas negara
     */
    public void kirimLintasNegara(RekeningValas rekeningTujuan, double transferAmount);
}
