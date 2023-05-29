/**
 * 
 */
package es.cursojava.principal;

import es.cursojava.vehiculos.Camion;
import es.cursojava.vehiculos.Coche;
import es.cursojava.vehiculos.Moto;


/**
 * @author sinensia
 * @version 1.0
 */
public class Persona {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Coche c1 = new Coche("Verde","123wqw");
		System.out.println(c1.getColor());
		c1.setColor("mostaza");
		System.out.println(c1.getMatricula());
		System.out.println("el coche tiene " +c1.getRuedas()+ " ruedas");
		
		
		Moto m1 = new Moto("purpura","948jia");
		System.out.println(m1.getColor());
		m1.setColor("negro");
		System.out.println(m1.getMatricula());
		System.out.println("La moto tiene "+m1.getRuedas()+ " ruedas");
		
		
		Camion ca1 = new Camion("azul","1ioihi3",8);
		System.out.println(ca1.getColor());
		ca1.setColor("negro");
		System.out.println(ca1.getMatricula());
		System.out.println("El camion tiene "+ca1.getRuedas()+ " ruedas");
		
		c1.arrancar();
		c1.avanzar(5);
		c1.parar();
	
	}

}
