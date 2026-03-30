public final class ProtokolKeamanan {
    public final String ID_SERVER;

    public ProtokolKeamanan(String ID_SERVER) {
        this.ID_SERVER = ID_SERVER;
    };

    protected boolean validasiKeamanan(int PIN, int truePIN) {
        System.out.println("This transaction is validated by "+ this.ID_SERVER);
        for (int i=0; i<3;i++){
            if (PIN == truePIN){
                return true;
            }else{
                System.out.println("PIN salah.");
            }
        }
        return false;

    }


};
