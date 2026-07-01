public class CuentaCorriente extends CuentaBancaria {

    private double limiteSobregiro;
    private double porcentajeComisionSobregiro;

    // Retiro: Permite retirar hasta $50,000 por encima del saldo.
    // Interes: 0.0 por ciento (no genera intereses).
    // Comision por sobregiro: Si el saldo queda en negativo, se cobra una comision del 5 porciento sobre el monto sobregirado.

    public CuentaCorriente(String numeroCuenta, String titular, double saldoInicial, double limiteSobregiro, double porcentajeComisionSobregiro ) {
        super(numeroCuenta,titular,saldoInicial,0.0);
        this.limiteSobregiro = limiteSobregiro;
        this.porcentajeComisionSobregiro = porcentajeComisionSobregiro;
    }

    public CuentaCorriente(String numeroCuenta, String titular, double saldoInicial){
        super(numeroCuenta, titular, saldoInicial, 0.0); //limite y comision por defecto
        this.limiteSobregiro = 50000;
        this.porcentajeComisionSobregiro = 5.0;
    }


    @Override
    public void retirar(double monto) {
        double saldo1 = getSaldo() + limiteSobregiro;
        if (monto > saldo1) {
            System.out.println("El monto no es valido, intenta retirar " + monto +  " pero solo puede retirar " + saldo1);
        } else {
            System.out.println(" Retiro exitoso " + " Su saldo es " + getSaldo() + " su retiro es " + monto + " retiro mas de lo que tenia en su cuenta " + (getSaldo() - monto) + " la comision fue " + (( monto - getSaldo()) * porcentajeComisionSobregiro));
        }
    }

    //getters

    public double getLimiteSobregiro() {
        return limiteSobregiro;
    }

    public double getPorcentajeComisionSobregiro() {
        return porcentajeComisionSobregiro;
    }
}
