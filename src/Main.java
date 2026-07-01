//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CuentaCorriente cuentaJulian = new CuentaCorriente("2616","JSGM",20000,50000,5.0);


        System.out.println(cuentaJulian.getSaldo());
        cuentaJulian.retirar(100000);


    }
}