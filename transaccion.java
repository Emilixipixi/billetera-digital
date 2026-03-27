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

     // Método mostrarDetalle
    public void mostrarDetalle() {
        System.out.println("--- Detalle de Transacción ---");
        System.out.println("Tipo: " + tipo);
        System.out.println("Monto: $" + monto);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Estado: " + (exitosa ? "Exitosa" : "Fallida"));
    }

}