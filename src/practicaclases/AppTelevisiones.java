package practicaclases;

public class AppTelevisiones {
	public static void main(String[] args) {
		//Los constructores asignan valores iniciales
		
		// Forma de declarar y crear objeto en dos lineas
		Television tele1;
		tele1 = new Television("Samsung", 16, true, 50);
		// Otra forma de declarar y crear objeto en una sola linea
		Television tele2 = new Television("Sony");
		//Declarando un tercer objeto
		Television tele3 = new Television(60.5);
		//cambiar valores
		tele1.setMarca("Toshiba"); 
		tele2.setMarca("Sony");
		tele3.setTamanio(90.63);
		// Imprimir la marca de cada objeto
		System.out.println(tele1.getMarca());
		System.out.println(tele2.getMarca());
		System.out.println(tele3.getTamanio());
		
		
		//Definir un objeto de tipo TelevisionDigital que hereda de television
		TelevisionDigital television4 = new TelevisionDigital();
		television4.setCantidad(10);
		//Definir los valores de los atributos del objeto  
		television4.setEsColor(true);
		television4.setMarca("Sony");
		television4.setNombre("Sony 3t X");
		television4.setTamanio(60);
		television4.setTipo("Con conexion a internet");
		
		System.out.println(" ");
		System.out.println(television4.getEsColor());
		System.out.println(television4.getMarca());
		System.out.println(television4.getNombre());
		System.out.println(television4.getTamanio());
		System.out.println(television4.getTipo());
	}
}