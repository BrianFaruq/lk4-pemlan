public class RekeningValas extends Rekening implements TransferGlobal {
    public RekeningValas(int nomorRekening, int saldo) {
        super(nomorRekening, saldo);
    }

    @Override
    public void transfer() {
    }
}
