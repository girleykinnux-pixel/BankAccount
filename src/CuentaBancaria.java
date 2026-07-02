public abstract class CuentaBancaria {

    private String numeroCuenta;
    private String titular;
    private double saldo;
    private double tasaInteres;

    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial, double tasaInteres) {

        if (saldoInicial < 0 || tasaInteres < 0) {
            System.out.println("Error al crear cuenta");
        } else {
            this.numeroCuenta = numeroCuenta;
            this.titular = titular;
            this.saldo = saldoInicial;
            this.tasaInteres = tasaInteres;
            System.out.println("Su saldo es: " + saldoInicial + " Tasa de interes " + tasaInteres);
        }
    }

    public void depositar(double monto) {

        if (monto <= 0) {
            System.out.println("No se puede depositar esta cantidad");
        } else {
            saldo += monto;
            System.out.println("El monto depositado es " + monto + " Su nuevo saldo es " + saldo);
        }
    }

    public abstract void retirar(double monto);

    public void aplicarInteres() {

        double interesGenerado = saldo * (tasaInteres / 100);
        saldo += interesGenerado;

        System.out.println("Interes generado es " + interesGenerado + " Su nuevo saldo con interes es " + saldo);
    }

    public void mostrarInfo() {
        System.out.println("El numero de cuenta es " + getNumeroCuenta() + " y pertenece a " + getTitular()
                + " con un saldo de " + getSaldo() + " e interes de " + getTasaInteres());
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() { return saldo; }

    public double getTasaInteres() {
        return tasaInteres;
    }

}