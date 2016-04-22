package ana_ortega;

import java.util.ArrayList;

public class Tarea {
//	// Vamos a hacer una peque�a agenda semanal. La semana constar� de d�as del lunes
//	al viernes. Cada d�a tendr� cuatro periodos a los que asignar tareas. Cada tarea
//	debe contener un nombre, una descripci�n, un lugar en el que realizarse y en caso
//	de que sea una reuni�n la persona o entidad con la que nos reuniremos. No puede
//	asignarse m�s de una tarea al mismo periodo del mismo d�a. Si en alg�n momento
//	se ha ocupado m�s de la mitad de los periodos de una semana se avisar� al usuario
//	mediante un mensaje cada vez que a�adamos una nueva tarea. 
	
	// ATRIBUTOS
	private String nombre;
	private String descripcion;
	private String lugar;
	private String entidadReunion;
	
	// CONTRUCTORES
	public Tarea(String nombre, String descripcion, String lugar) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.lugar = lugar;
	}
	public Tarea(String nombre, String descripcion, String lugar, String entidadReunion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.lugar = lugar;
		this.entidadReunion = entidadReunion;
	}
	
	// METODOS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getEntidadReunion() {
		return entidadReunion;
	}
	public void setEntidadReunion(String entidadReunion) {
		this.entidadReunion = entidadReunion;
	}
	@Override
	public String toString() {
		return "Tarea [nombre=" + nombre + ", descripcion=" + descripcion + ", lugar=" + lugar + ", entidadReunion="
				+ entidadReunion + "]";
	}
	
	
	
	
}
