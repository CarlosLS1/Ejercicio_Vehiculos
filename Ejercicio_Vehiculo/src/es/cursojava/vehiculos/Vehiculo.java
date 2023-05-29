/**
 * 
 */
package es.cursojava.vehiculos;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.Random;

/**
 * @author sinensia
 * @version 1.0
 */
public class Vehiculo {
	private long starttime;
	private long endtime;
	private String matricula;
	private String color;
	private int ruedas;

	/**
	 * Contructor de las propiedades de los vehiculos
	 * @param String color: color del vehiculo.
	 * @param String matricula: matricula del vehiculo
	 */
	public Vehiculo(String color,String matricula) {
		this.color = color;
		this.matricula = matricula;
	}
	

	/**
	 * Metodo para obtener el color del vehiculo.
	 * @return devuelve el color actual que posee el vehiculo
	 */
	public String getColor() {
		return "El color de su vehiculo es "+color;
	}

	/**
	 * Metodo para agregar el color nuevo del vehiculo.
	 * @param String color: color nuevo que poseera el vehiculo
	 */
	public void setColor(String color) {
		this.color = color;
		System.out.println("El color de su vehiculo se cambiado a "+color);
	}
	/**
	 * Metodo para obtener la matricula del vehiculo.
	 * @return devuelve unicamente la matricula del vehiculo
	 */
	
	public String getMatricula () {
		return "La matricula de su vehiculo es "+matricula;
	}
	/**
	 * Metodo para obtener la cantidad de ruedas del vehiculo.
	 * @return devuelve la cantidad de ruedas que posee el vehiculo.
	 */
	public int getRuedas() {
		return ruedas;
	}
	
	/**
	 * Metodo para agregar la cantidad de ruedas del vehiculo.
	 * @param int ruedas: cantidad de ruedas que posee el vehiculo.
	 */
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	
	/**
	 * Metodo arrancar: obtiene la fecha actual de metodofecha y Muestra por consola como fecha de inicio del viaje.
	 */
	public void arrancar() {
		starttime = metodofecha();
		System.out.println("Tiempo inicial del viaje ");
	}
	
	/**
	 * Metodo avanzar: muestra por consola la velicidad indicada y la hora actual del viaje
	 * @param int velocidad: la velocidad del vehiculo en metros
	 */
	public void avanzar(int velocidad) {
		long fecha = metodofecha();
		LocalDateTime localDateTime = LocalDateTime.ofEpochSecond(fecha, 0, ZoneOffset.UTC);
		System.out.println("Su velocidad es de "+velocidad+" y su fecha actual es "+ localDateTime);
	}
	/**
	 * Metodo para: calcula la fecha inicial y la final aleatoria mostrando la cantidad de dias y horas del viaje.
	 */	
	public void parar() {
		endtime = metodofecha();
		Random r = new Random();
		endtime+=r.nextLong(1000000)+1;
		Date date = new Date((endtime-starttime) * 1000L);
		SimpleDateFormat jdf = new SimpleDateFormat("dd  HH:mm:ss");
        System.out.println("Dias y horas de viaje "+ jdf.format(date));
	}
	
	/**
	 * Metodo privado: generacion de fecha actual en epoch
	 * @return devuelve la fecha epoch de tipo long.
	 */
	private long metodofecha() {
		LocalDateTime datetime = LocalDateTime.now();
		return datetime.toEpochSecond(ZoneOffset.UTC);
	}
}
