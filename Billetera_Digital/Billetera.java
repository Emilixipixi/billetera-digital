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
}
