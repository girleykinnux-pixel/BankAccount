public class CuentaEmpresarial extends CuentaBancaria {
    double comisionRetiro;
    String nombreEmpresa;
    String RUT;


    public CuentaEmpresarial(String numeroCuenta, String titular, double saldoInicial, double tasaInteres,double saldoEmpresarial,double comisionRetiro, String nombreEmpresa, String RUT){
        super(numeroCuenta, titular, saldoInicial, tasaInteres, saldoEmpresarial);
        this.comisionRetiro = comisionRetiro;
        this.nombreEmpresa = nombreEmpresa;
        this.RUT = RUT;
    }

    @Override
    public void retirar(double monto){
        if(monto > getSaldo()){
            System.out.println("Error al retirar");
        } else {
            comisionRetiro = 2000;
            double newSaldo = (getSaldo() - monto) - comisionRetiro;
            System.out.println("Retiraste " + monto + " Su nuevo saldo es " + newSaldo);
        }
    }
}
