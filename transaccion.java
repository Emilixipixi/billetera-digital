public class Transaccion {

    // Atributos
    private String tipo;
    private double monto;
    private String descripcion;
    private boolean exitosa;

    // Constructor
    public Transaccion(String tipo, double monto, String descripcion) {
        this.tipo = tipo;
        this.monto = monto;
        this.descripcion = descripcion;
        this.exitosa = true;
    }

}