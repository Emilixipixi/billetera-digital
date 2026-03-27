public class Main {
    public static void main(String[] args) {
        System.out.println("===== Billetera Digital =====");
        System.out.println();

        System.out.println("--- Sección: Billetera ---");
        Billetera billetera = new Billetera("Carlos Pérez", "EC001-2024", 500.00);
        billetera.mostrarInfo();
        System.out.println();
        billetera.depositar(150.00);
        System.out.println();
        billetera.retirar(80.00);
        System.out.println();

        System.out.println("--- Sección: Transacción ---");
        transaccion transaccion = new transaccion("Transferencia", 200.00, "Pago de servicios básicos");
        transaccion.mostrarDetalle();
        System.out.println();
        transaccion.aplicarComision(2.5);
        System.out.println();
        transaccion.marcarFallida();
        System.out.println();

        System.out.println("--- Sección: Contacto ---");
        contacto contacto = new contacto("Ana Torres", "EC009-5678", "Banco Pichincha");
        contacto.mostrarContacto();
        System.out.println();
        contacto.marcarFavorito();
        System.out.println();
        contacto.enviarDinero(75.50);
        System.out.println();

        System.out.println();
        System.out.println("===== Fin del sistema =====");
    }
}