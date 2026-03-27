public class Contacto {

     private String nombre;
	private String cuentaDestino;
	private String banco;
	private boolean favorito;

    public Contacto(String nombre, String cuentaDestino, String banco) {
		super();
		this.nombre = nombre;
		this.cuentaDestino = cuentaDestino;
		this.banco = banco;
		this.favorito = false;
	}

    public void mostrarContacto() {
		System.out.println("=== Contacto ===");
		System.out.println("Nombre: " + nombre);
		System.out.println("Cuenta: " + cuentaDestino);
		System.out.println("Banco: " + banco);
		if (favorito) {
			System.out.println("Favorito: ⭐ Favorito");
		} else {
			System.out.println("Favorito: Sin marcar");
		}
	}

    public void marcarFavorito() {
		this.favorito = true;
		System.out.println(nombre + " agregado a favoritos. ⭐");
	}

    public void enviarDinero(double monto) {
		System.out.println("Transferencia enviada:");
		System.out.println("Destinatario: " + nombre);
		System.out.println("Cuenta: " + cuentaDestino);
		System.out.println("Monto: $" + String.format("%.2f", monto));
	}

    
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuentaDestino() {
		return cuentaDestino;
	}

	public void setCuentaDestino(String cuentaDestino) {
		this.cuentaDestino = cuentaDestino;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public boolean isFavorito() {
		return favorito;
	}

	public void setFavorito(boolean favorito) {
		this.favorito = favorito;
	}

    



}