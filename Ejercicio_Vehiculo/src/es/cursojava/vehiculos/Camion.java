/**
 * 
 */
package es.cursojava.vehiculos;

import java.util.ArrayList;

import es.cursojava.interfazvehiculos.Conducible;

/**
 * @author sinensia
 * @version 1.0
 */
public class Camion extends Vehiculo implements Conducible {
	
	private ArrayList<Integer> tacometro = new ArrayList<Integer>();
	
	/**
	 * Contructor de las propiedades heredadas de vehiculo para la clase camion
	 * @param String color: color del camion
	 * @param String matricula: identificador del camion
	 */
	public Camion(String color, String matricula, int ruedas) {
		super(color,matricula);
		super.setRuedas(ruedas);
		
	}

	
	/**
	 * Metodo conducir heredado de conducible, adaptado para la clase camion
	 */
	@Override
	public void conducir() {
		System.out.println("se conduce con un volante");

	}

	/**
	 * Metodo avanzar heredado de conducible, adaptado para la clase camion
	 */
	@Override
	public void avanzar() {
		System.out.println("Avanza con el pedal de acelerador");

	}
	
	/**
	 * Metodo retroceder heredado de conducible, adaptado para la clase camion
	 */
	@Override
	public void retroceder() {
		System.out.println("Retrocedes con la marcha atras");

	}

	/**
	 * Metodo parar heredado de conducible, adaptado para la clase moto
	 */
	@Override
	public void parar() {
		System.out.println("Paras con el pedal de freno");

	}
	/**
	 * Metodo de heredado de vehiculo, devuele la cantidad de ruedas con el metodo getrueda.
	 */
	@Override
	public int getRuedas() {
		return super.getRuedas();
	}

}
