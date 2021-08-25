package almacen;


public class main {

	
	
/*
 * 3-8-2021

Nos piden hacer un almacén.
En un almacén se guardan un conjunto de  bebidas. 
Estos productos son bebidas como agua mineral y bebidas azucaradas (coca-cola, fanta, etc). De los productos nos interesa saber su identificador (cada uno tiene uno distinto), cantidad de litros, precio y marca.
Si es agua mineral nos interesa saber también el origen (manantial tal sitio o donde sea).
Si es una bebida azucarada queremos saber el porcentaje que tiene de azúcar y si tiene o no alguna promoción (si la tiene tendrá un descuento del 10% en el precio).
En el almacén iremos almacenado estas bebidas por estanterías (que son las columnas de la matriz).
https://www.youtube.com/watch?v=upwFPHhmzkE
 */
	public static void main(String[] args) {

		Almacen almacen = new Almacen();

	
		Bebida pepsi = new BebidaAzucarada("pepsi",0.33, 66.21, 0.25,true);
		Bebida cocaCola = new BebidaAzucarada("cocaCola",0.33, 76.22, 0.25,true);
		Bebida free = new BebidaAzucarada("free",0.33, 66.10, 0.25,false);
		Bebida p = new BebidaAzucarada("a",0.50,20.10,0.1,true);
		
		Bebida fonbella = new AguaMineral("Cantabria","fonbella",2, 45);
		Bebida aguaDestilada = new AguaMineral("madrid","Carrefull",2, 25);
		
		System.out.println(pepsi.toString());
		System.out.println(cocaCola.toString());
		System.out.println(free.toString());
		
		System.out.println(fonbella.toString());
		System.out.println(aguaDestilada.toString());
	
		
		almacen.agregarBebida(fonbella);
		almacen.agregarBebida(aguaDestilada);
		almacen.agregarBebida(free);
		almacen.agregarBebida(cocaCola);
		almacen.agregarBebida(pepsi);
		
	
		
		almacen.mostrarInformacion();
		System.out.println("el precio de todo el almacen es: " + almacen.calcularPrecioBebidas());

		almacen.eliminarBebida(1);
		System.out.println("el precio de todo el almacen es: " + almacen.calcularPrecioBebidas());
		System.out.println("el precio total de la marca " + almacen.calcularPrecioPorMarca("free"));
		
		System.out.println(almacen.calcularPrecioPorColumna(1));
		almacen.mostrarInformacion();
	}

}
