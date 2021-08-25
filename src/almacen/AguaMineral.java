package almacen;

public class AguaMineral extends Bebida {
	
	private String origenAgua;

	public AguaMineral(String origenAgua,String marca, double litros, double precio) {
		super(marca, litros, precio); //llamo a la clase padre
		this.origenAgua = origenAgua;
		
	}

	public String getOrigenAgua() {
		return origenAgua;
	}

	public void setOrigenAgua(String origenAgua) {
		this.origenAgua = origenAgua;
	}

	@Override
	public String toString() {
		return super.toString() + "origenAgua=" + origenAgua ;
	}

	


 



	
}
