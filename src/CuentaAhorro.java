public class CuentaAhorro extends CuentaBancaria{
// FINAL DICE QUE DEBE SER CONSTANTE
    private final String fechaApertura;

    public CuentaAhorro (String numeroCuenta, String titular, double saldoInicial, String fechaApertura){
       super(numeroCuenta,titular,saldoInicial, 2.5);

       this.fechaApertura = fechaApertura;
    }

    @Override
    public void retirar(double monto) {
        if (monto > getSaldo()){
            System.out.println("Saldo insuficiente");
        } else {
            System.out.println("El retiro ha sido exitoso, Su nuevo saldo es de:" + (getSaldo()-monto));
        }
    }

    @Override
    public void mostrarInfo (){
        super.mostrarInfo(); System.out.println("Titular: " + getTitular()); System.out.println("Saldo actual: " + getSaldo());;
        System.out.println("fecha de apertura" + fechaApertura);
    }
}

