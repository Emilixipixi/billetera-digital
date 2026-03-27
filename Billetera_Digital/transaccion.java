public class transaccion {

    // Atributos
    private String tipo;
    private double monto;
    private String descripcion;
    private boolean exitosa;

    // Constructor
    public transaccion(String tipo, double monto, String descripcion) {
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

     // Método aplicarComision
    public void aplicarComision(double porcentaje) {
        double comision = monto * (porcentaje / 100);
        double total = monto + comision;

        System.out.println("Comisión (" + porcentaje + "%): $" + String.format("%.2f", comision));
        System.out.println("Monto total con comisión: $" + String.format("%.2f", total));
    }

    // Método marcarFallida
    public void marcarFallida() {
        exitosa = false;
        System.out.println("Transacción marcada como fallida.");
        System.out.println("Monto afectado: $" + monto);
    }

}