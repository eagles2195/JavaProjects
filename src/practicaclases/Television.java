package practicaclases;

public class Television {
	private String marca;
	private String nombre;
	private double tamanio;
	private boolean esAColor;
	private int cantidadBotones;
	
	//Constructores
	Television(String m, double t, boolean c, int b){
		marca = m;
		tamanio = t;
		esAColor = true;
		cantidadBotones = b;
	}
	Television(String marca){
		this.marca = marca;
	}
	Television(double tamanio){
		this.tamanio = tamanio;
	}
	Television(){
		
	}
	
	//Metodos Set y Get
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMarca() {
		return this.marca;
	}
	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}
	public double getTamanio() {
		return this.tamanio;
	}
	public void setCantidad(int cantidad) {
		this.cantidadBotones = cantidad;
	}
	public int getCantidad() {
		return this.cantidadBotones;
	}
	public void setEsColor(boolean color) {
		this.esAColor = color;
	}
	public boolean getEsColor() {
		return this.esAColor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}