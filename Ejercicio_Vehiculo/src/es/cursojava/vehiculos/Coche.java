/**
 * 
 */
package es.cursojava.vehiculos;

import es.cursojava.interfazvehiculos.Conducible;

/**
 * @author sinensia
 * @version 1.0
 */
public class Coche extends Vehiculo implements Conducible {
	
	/**
	 * Contructor de las propiedades heredadas de vehiculo para la clase coche
	 * @param String color: color del coche
	 * @param String matricula: identificador del coche
	 */
	public Coche(String color, String matricula) {
		super(color,matricula);
	}

	/**
	 * Metodo conducir heredado de conducible, adaptado para la clase coche
	 */
	@Override
	public void conducir() {
		System.out.println("se conduce con un volante");

	}
	
	/**
	 * Metodo avanzar heredado de conducible, adaptado para la clase coche
	 */
	@Override
	public void avanzar() {
		System.out.println("Avanza con el pedal de acelerador");

	}
	
	/**
	 * Metodo retroceder heredado de conducible, adaptado para la clase coche
	 */
	@Override
	public void retroceder() {
		System.out.println("Retrocedes con la marcha atras");

	}
	
	/**
	 * Metodo parar heredado de conducible, adaptado para la clase coche
	 */
	@Override
	public void parar() {
		System.out.println("Paras con el pedal de freno");
		super.parar();

	}

	/**
	 * Metodo de heredado de vehiculo, ejecuta el metodo setruedas con la cantidad de ruedas y devuele la cantidad de ruedas con el metodo getrueda.
	 */
	@Override
	public int getRuedas() {
		super.setRuedas(4);
		return super.getRuedas();
	}


	
	
	
	

}
