public class CuentaAhorro extends CuentaBancaria {

    private final String fechaApertura;

    public CuentaAhorro(String numeroCuenta, String titular, double saldoInicial, String fechaApertura) {
        super(numeroCuenta, titular, saldoInicial, 2.5);
        this.fechaApertura = fechaApertura;
    }

    @Override
    public void retirar(double monto) {

        if (monto > getSaldo()) {
            System.out.println("Saldo insuficiente");
        } else {
            setSaldo(getSaldo() - monto);
            System.out.println("El retiro ha sido exitoso, Su nuevo saldo es de: " + getSaldo());
        }
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Fecha de apertura: " + fechaApertura);
    }

}