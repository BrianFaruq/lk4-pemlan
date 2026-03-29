public class Rekening {
   // Menggunakan modifier 'protected' agar variabel ini bisa diakses langsung
    // oleh subclass (RekeningValas), tapi tetap tertutup dari kelas luar.
    protected String nomorRekening;
    protected double saldo;


    // Constructor kelas induk
    public Rekening(String nomorRekening, double saldo) {
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
    }


    public void cekSaldo() {
        System.out.println("Rekening: " + nomorRekening + " | Saldo: " + saldo);
    }

}
