package almacen;

public class BebidaAzucarada extends Bebida {

	private double contenidoAzucar;
	private boolean promocion;
	
	


	public BebidaAzucarada(String marca, double litros, double precio, double contenidoAzucar, boolean promocion) {
		super(marca, litros, precio);
		this.contenidoAzucar = contenidoAzucar;
		this.promocion = promocion;
	}






	public double getContenidoAzucar() {
		return contenidoAzucar;
	}



	public void setContenidoAzucar(double contenidoAzucar) {
		this.contenidoAzucar = contenidoAzucar;
	}



	public boolean isPromocion() {
		return promocion;
	}



	public void setPromocion(boolean promocion) {
		this.promocion = promocion;
	}
	
	@Override
	//este seria un ejemplo claro de poliformismo
	public double getPrecio() {
		if (isPromocion() ) {  //si es true
			
			return super.getPrecio() * 0.8;
	}else {
		return super.getPrecio();
	}
	}



	@Override
	public String toString() {
		return super.toString() + "contenidoAzucar=" + contenidoAzucar + ", promocion=" + promocion;
	}
	
	
	

	

	
}



