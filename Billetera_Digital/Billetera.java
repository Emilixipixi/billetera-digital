public class Billetera {

    
    String propietario;   
    String numeroCuenta;   
    double saldo;          
    boolean activa;
    
    
    public Billetera(String propietario, String numeroCuenta, double saldoInicial){
        this.propietario = propietario;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.activa = true;
    }

    public void mostrarInfo() {
        System.out.println("=== Billetera Digital ===");
        System.out.println("Propietario: " + propietario);
        System.out.println("Cuenta: " + numeroCuenta);
        System.out.println("Saldo: "+ saldo);
        System.out.println("Estado: " + (activa ? "Activa" : "Inactiva"));
    }

    public void depositar(double monto) {
        saldo = saldo + monto; 
        System.out.println("Deposito exitoso: ",monto);
        System.out.println("Numero Saldo: ", saldo);   
     }

}
