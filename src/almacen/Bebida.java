package almacen;

public class Bebida {

	private static int idActual=1; //static es igual para todos
	
	
	private int id;
	private String marca;				
	private double litros;
	private double precio;
	
	//constructor
	public Bebida(String marca, double litros, double precio) {
		
		this.id = idActual++;  //le doy el valor, pero luego lo actualiza.
		this.marca = marca;
		this.litros = litros;
		this.precio = precio;
	}	

	
	//G&S
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public double getLitros() {
		return litros;
	}
	public void setLitros(double litros) {
		this.litros = litros;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}




	@Override
	public String toString() {
		return "Bebida [id=" + id + ", marca=" + marca + ", litros=" + litros + ", precio=" + precio + "]";
	}





	
	
	
	
}
