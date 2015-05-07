/**
 * 
 */
package estudios;

import java.util.ArrayList;

/**
 * @author Bruno Del Greco
 *
 */
public class Persona {
	
	String nombre;
	String dni;
	ArrayList<Asignatura> asignaturas;
	
	public Persona(){
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public ArrayList<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	
	
}
