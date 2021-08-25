package almacen;

import java.util.Arrays;

public class Almacen {

	


	private Bebida[][] estanteria; // en una posicion guardar� un objeto

	public Almacen(int fila, int columna) {

		estanteria = new Bebida[fila][columna];
	}

	public Almacen() {
		estanteria = new Bebida[5][5];
	}

	public void eliminarBebida(int id) {
		// Eliminar un producto: dado un ID, eliminar el producto del almac�n.
		boolean encontrado = false;
		for (int i = 0; i < estanteria.length && !encontrado; i++) {
			System.out.println("longitud de estanteria []: " + estanteria.length);
			for (int j = 0; j < estanteria[0].length && !encontrado; j++) {
				System.out.println("longitud de estateria[0].length: " + estanteria[0].length);
				if (estanteria[i][j] != null) { // hay una bebida en esa posicion
					if (id == estanteria[i][j].getId()) {
						encontrado = true;
						estanteria[i][j] = null; // no hace falta q ponga los setters a 0

					}
				}
			}

		}
		if (encontrado) {
			System.out.println("el registro ha sido localizado y eliminado");
		} else {
			System.out.println("el registro no ha sido localizado");
		}
	}

	public void agregarBebida(Bebida b) {

		boolean encontrado = false; // nos servir� para encontrar la primera posicion
		for (int i = 0; i < estanteria.length && !encontrado; i++) {
			for (int j = 0; j < estanteria[0].length && !encontrado; j++) {
				if (estanteria[i][j] == null) {
					estanteria[i][j] = b;
					encontrado = true;
				}

			}

		}
		if (encontrado) {
			System.out.println("bebida a�adida a la estanteria");
		} else {
			System.out.println("no se ha podido a�adir la bebida");
		}
	}

	public void mostrarInformacion() {
		/*
		 * mostramos para cada bebida toda su informaci�n. 
		 */
		for (int i = 0; i < estanteria.length; i++) {
			for (int j = 0; j < estanteria[0].length; j++) {
				if (estanteria[i][j] != null) {
					System.out.println("MOSTRAR fila: " + i + "; columna: " + j +" "+ estanteria[i][j].toString());
					
				}

			}
		}
	}

	public double calcularPrecioBebidas() {
		/*
		 * � Calcular precio de todas las bebidas: calcula el precio total de todos los
		 * productos del almac�n.
		 */
		double precioTotal = 0.0;

		for (int i = 0; i < estanteria.length; i++) {
			for (int j = 0; j < estanteria[0].length; j++) {
				if (estanteria[i][j] != null) {
					precioTotal += estanteria[i][j].getPrecio();
				}
			}
		}
		return precioTotal;

	}

	/*
	 * � Calcular el precio total de una marca de bebida: dada una marca, calcular
	 * el precio total de esas bebidas.
	 * 
	 */

	public double calcularPrecioPorMarca(String marca) {
		/*
		 * � Calcular precio de todas las bebidas: calcula el precio total de todos los
		 * productos del almac�n.
		 */
		double precioTotal = 0.0;

		for (int i = 0; i < estanteria.length; i++) {
			for (int j = 0; j < estanteria[0].length; j++) {
				if (estanteria[i][j] != null && estanteria[i][j].getMarca().equalsIgnoreCase(marca)) {
					precioTotal += estanteria[i][j].getPrecio();
				}
			}
		}
		return precioTotal;

	}

	public double calcularPrecioPorColumna(int numColumna) {
		/*
		 * � Calcular el precio total de una estanter�a: dada una estanter�a (columna)
		 * calcular el precio total de esas bebidas.
		 */
		double precioTotal = 0.0;

		if (numColumna >= 0 && numColumna <= estanteria[0].length) { // estructura de control

			for (int i = 0; i < estanteria.length; i++) {

				if (estanteria[i][numColumna] != null) {
					precioTotal += estanteria[i][numColumna].getPrecio();
				}
			}
		} else {
			System.out.println("Numero indicado de la columna incorrecto, revisar");
		}

		return precioTotal;

	}

}
