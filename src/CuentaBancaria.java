public abstract class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    private double saldo;
    private double tasaInteres;
    private double monto;


    public CuentaBancaria (String numeroCuenta, String titular, double saldoInicial, double tasaInteres){
        this.numeroCuenta =numeroCuenta;
        this.titular=titular;
        this.saldo=saldoInicial;
        this.tasaInteres=tasaInteres;

        if (saldoInicial < 0 && tasaInteres < 0){
            System.out.println("El saldo inicial y tasa de interes no puede ser negativo");
        } else{
            System.out.println("Su saldo es: " + saldoInicial + " Tasa de interes " + tasaInteres);
        }
    }

    public void depositar (double monto ){
        this.monto=monto;

        if (monto <= 0 ) {
            System.out.println("No se puede depositar esta cantidad");
        } else {
            System.out.println("El monto depositado es " + monto);
            System.out.println("Su nuevo saldo es "+ (saldo + monto));
        }
    }

    public abstract void retirar (double monto);

    public void aplicarInteres (){
        double interesGeredo = saldo * (tasaInteres/100);
        double saldoTotal = saldo+interesGeredo;
        System.out.println("Interes generado es " + interesGeredo);
        System.out.println("Nuevo saldo con interes es " + saldoTotal);
    }

    public void mostrarInfo (){
        System.out.println("El numero de cuenta es " + numeroCuenta + " y pertenece a " + titular +
                            " con un saldo de " + saldo + " e interes de " + tasaInteres);
    }

    // Getters

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

}


