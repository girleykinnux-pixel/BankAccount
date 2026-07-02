public class CuentaEmpresarial extends CuentaBancaria {

    private String nombreEmpresa;
    private String RUT;
    private double comisionRetiro;

    public CuentaEmpresarial(String numeroCuenta, String titular, double saldoInicial, String nombreEmpresa, String RUT) {
        super(numeroCuenta, titular, saldoInicial, 1.5);
        this.nombreEmpresa = nombreEmpresa;
        this.RUT = RUT;
        this.comisionRetiro = 2000;

        if (saldoInicial < 100000) {
            System.out.println("Error al crear cuenta");
        }
    }

    @Override
    public void retirar(double monto) {

        if (monto + comisionRetiro > getSaldo()) {
            System.out.println("Saldo insuficiente");
        } else {
            setSaldo(getSaldo() - monto);
            setSaldo(getSaldo() - comisionRetiro);

            System.out.println("Retiro exitoso " + "Comision por retiro: " + comisionRetiro + " Nuevo saldo: " + getSaldo());
        }
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Nombre de la empresa: " + nombreEmpresa + "RUT: " + RUT);
    }

    public String getNombreEmpresa() { return nombreEmpresa; }

    public String getRUT() { return RUT; }

    public double getComisionRetiro() { return comisionRetiro; }
}