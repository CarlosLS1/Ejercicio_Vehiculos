/**
 * 
 */
package es.cursojava.vehiculos;

import es.cursojava.interfazvehiculos.Conducible;

/**
 * @author sinensia
 * @version 1.0
 */
public class Moto extends Vehiculo implements Conducible {
	
	/**
	 * Contructor de las propiedades heredadas de vehiculo para la clase moto
	 * @param String color: color de la moto
	 * @param String matricula: identificador de la moto
	 */
	public Moto(String color, String matricula) {
		super(color, matricula);
	}

	/**
	 * Metodo conducir heredado de conducible, adaptado para la clase moto
	 */
	@Override
	public void conducir() {
		System.out.println("se conduce con un manillar");
	}

	/**
	 * Metodo avanzar heredado de conducible, adaptado para la clase moto
	 */
	@Override
	public void avanzar() {
		System.out.println("Avanza con el manillar");

	}

	/**
	 * Metodo retroceder heredado de conducible, adaptado para la clase moto
	 */
	@Override
	public void retroceder() {
		System.out.println("Retrocedes con los pies no hay marchas");

	}
	
	/**
	 * Metodo parar heredado de conducible, adaptado para la clase moto
	 */

	@Override
	public void parar() {
		System.out.println("Paras con los frenos del manillar");

	}

	/**
	 * Metodo de heredado de vehiculo, ejecuta el metodo setruedas con la cantidad de ruedas y devuele la cantidad de ruedas con el metodo getrueda.
	 */
	@Override
	public int getRuedas() {
		super.setRuedas(2);
		return super.getRuedas();
	}
	
	

}
