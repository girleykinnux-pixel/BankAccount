public class CuentaCorriente extends CuentaBancaria {

    private double limiteSobregiro;
    private double porcentajeComisionSobregiro;

    public CuentaCorriente(String numeroCuenta, String titular, double saldoInicial, double limiteSobregiro, double porcentajeComisionSobregiro) {
        super(numeroCuenta, titular, saldoInicial, 0.0);
        this.limiteSobregiro = limiteSobregiro;
        this.porcentajeComisionSobregiro = porcentajeComisionSobregiro;
    }

    public CuentaCorriente(String numeroCuenta, String titular, double saldoInicial) {
        super(numeroCuenta, titular, saldoInicial, 0.0);
        this.limiteSobregiro = 50000;
        this.porcentajeComisionSobregiro = 5.0;
    }

    @Override
    public void retirar(double monto) {

        if (monto > getSaldo() + limiteSobregiro) {
            System.out.println("El monto no es valido, intenta retirar " + monto + " pero solo puede retirar " + (getSaldo() + limiteSobregiro));
        } else {

            double nuevoSaldo = getSaldo() - monto;
            setSaldo(nuevoSaldo);

            if (getSaldo() < 0) {
                double sobregiro = -getSaldo();
                double comision = sobregiro * (porcentajeComisionSobregiro/100);
                setSaldo(getSaldo() - comision);
                System.out.println("Retiro exitoso, comision por sobregiro: " + comision + " Su nuevo saldo es de: " + getSaldo());

            } else {
                System.out.println("Retiro exitoso, su nuevo saldo es de: " + getSaldo());
            }
        }
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Limite de sobregiro: " + limiteSobregiro);
    }

    public double getLimiteSobregiro() {
        return limiteSobregiro;
    }

    public double getPorcentajeComisionSobregiro() {
        return porcentajeComisionSobregiro;
    }
}