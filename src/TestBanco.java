//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TestBanco {
    public static void main(String[] args) {

        //Paso 1 ------------------------------------------------------

            CuentaAhorro cuenta1 = new CuentaAhorro("AH001", "Ana Perez", 50000.0, "2024-01-15");
            CuentaCorriente cuenta2 = new CuentaCorriente("CC001", "Luis Gomez", 20000.0);
            CuentaEmpresarial cuenta3 = new CuentaEmpresarial("EM001", "Tech Solutions", 200000.0, "Tech Solutions", "123456789-0");
            CuentaAhorro cuenta4 = new CuentaAhorro("AH002", "Maria Lopez", 15000.0, "2024-02-01");

        System.out.println("Cuentas creadas exitosamente.");
        System.out.println("---------------------------------------------------------------");

        //Paso 2 ------------------------------------------------------
            cuenta1.mostrarInfo();
            System.out.println();
            cuenta2.mostrarInfo();
            System.out.println();
            cuenta3.mostrarInfo();
            System.out.println();
            cuenta4.mostrarInfo();
            System.out.println("---------------------------------------------------------------");

        //Paso 3 ------------------------------------------------------
            //Operación 1: Ana Perez deposita $10,000
            System.out.println("[Operación Ana Perez]");
            cuenta1.depositar(10000);
            System.out.println();

            // Operación 2: Luis Gomez retira $25,000 (Genera sobregiro)
            System.out.println("[Operación Luis Gomez]");
            cuenta2.retirar(25000);
            System.out.println();

            // Operación 3: Tech Solutions retira $10,000 (Genera comisión fija)
            System.out.println("[Operación Tech Solutions]");
            cuenta3.retirar(10000);
            System.out.println();

            // Operación 4: Maria Lopez intenta retirar $20,000 (Falla por saldo insuficiente)
            System.out.println("[Operación Maria Lopez]");
            cuenta4.retirar(20000);
            System.out.println("---------------------------------------------------------------");

        //Paso 4 -----------------------------------------------------------
            cuenta1.aplicarInteres();
            System.out.println();
            cuenta2.aplicarInteres();
            System.out.println();
            cuenta3.aplicarInteres();
            System.out.println();
            cuenta4.aplicarInteres();
            System.out.println("---------------------------------------------------------------");

        //Paso 5 -----------------------------------------------------------
            cuenta1.mostrarInfo();
            System.out.println();
            cuenta2.mostrarInfo();
            System.out.println();
            cuenta3.mostrarInfo();
            System.out.println();
            cuenta4.mostrarInfo();
            System.out.println("---------------------------------------------------------------");

        //Paso 6 -----------------------------------------------------------
            int totalCuentas = 4;
            double saldoTotal = cuenta1.getSaldo() + cuenta2.getSaldo() + cuenta3.getSaldo() + cuenta4.getSaldo();
            double promedioSaldo = saldoTotal / totalCuentas;

            CuentaBancaria cuentaMayor = cuenta1;

            if (cuenta2.getSaldo() > cuentaMayor.getSaldo()) cuentaMayor = cuenta2;

            if (cuenta3.getSaldo() > cuentaMayor.getSaldo()) cuentaMayor = cuenta3;

            if (cuenta4.getSaldo() > cuentaMayor.getSaldo()) cuentaMayor = cuenta4;

            System.out.println("Total de cuentas gestionadas: " + totalCuentas);
            System.out.println();
            System.out.println("Saldo total consolidado:" + saldoTotal);
            System.out.println();
            System.out.println("Promedio de saldo por cuenta:" + promedioSaldo);
            System.out.println();
            System.out.println("Cuenta con Mayor Saldo ");
            System.out.println();
            System.out.println("Número de Cuenta: " + cuentaMayor.getNumeroCuenta());
            System.out.println();
            System.out.println("Titular: " + cuentaMayor.getTitular());
            System.out.println();
            System.out.println("Saldo actual:" + cuentaMayor.getSaldo());

    }
}