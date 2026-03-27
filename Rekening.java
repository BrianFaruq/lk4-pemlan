public abstract class Rekening {
    private int nomorRekening;
    private int saldo;
    public Rekening(int nomorRekening, int saldo) {
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
    }

    public int getNomorRekening() {
        return nomorRekening;
    }
    public int getSaldo() {
        return saldo;
    }
}
