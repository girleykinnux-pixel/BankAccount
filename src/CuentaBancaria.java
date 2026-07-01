public abstract class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    private double saldo;
    private double tasaInteres;
    private double monto;


    public CuentaBancaria (String numeroCuenta, String titular, double saldoInicial, double tasaInteres){
        if (saldoInicial < 10000 || tasaInteres < 0){
            System.out.println("Error al crear cuenta");
        } else{
            this.numeroCuenta =numeroCuenta;
            this.titular=titular;
            this.saldo=saldoInicial;
            this.tasaInteres=tasaInteres;
            System.out.println("Su saldo es: " + saldoInicial + " Tasa de interes " + tasaInteres);
        }
    }
    // void siginifica que no vamos a devolver un valor
    public void depositar (double monto ){

        if (monto <= 0 ) {
            System.out.println("No se puede depositar esta cantidad");
        } else {
            System.out.println("El monto depositado es " + monto);
            System.out.println("Su nuevo saldo es "+ (saldo + monto));
        }
    }

    public abstract void retirar (double monto);

    public void aplicarInteres (){
        double interesGenerado = saldo * (tasaInteres/100);
        double saldoTotal = saldo+interesGenerado;
        System.out.println("Interes generado es " + interesGenerado);
        System.out.println("Nuevo saldo con interes es " + saldoTotal);
    }

    public void mostrarInfo (){
        System.out.println("El numero de cuenta es " + getNumeroCuenta() + " y pertenece a " + getTitular() +
                            " con un saldo de " + getSaldo() + " e interes de " + getTasaInteres());
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


