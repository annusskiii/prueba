package ana_ortega;

import java.util.ArrayList;

public class Tarea {
//	// Vamos a hacer una pequeña agenda semanal. La semana constará de días del lunes
//	al viernes. Cada día tendrá cuatro periodos a los que asignar tareas. Cada tarea
//	debe contener un nombre, una descripción, un lugar en el que realizarse y en caso
//	de que sea una reunión la persona o entidad con la que nos reuniremos. No puede
//	asignarse más de una tarea al mismo periodo del mismo día. Si en algún momento
//	se ha ocupado más de la mitad de los periodos de una semana se avisará al usuario
//	mediante un mensaje cada vez que añadamos una nueva tarea. 
	
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
