package ana_ortega;

import java.util.ArrayList;

public class DiaSemana {

//	// Vamos a hacer una peque�a agenda semanal. La semana constar� de d�as del lunes
//	al viernes. Cada d�a tendr� cuatro periodos a los que asignar tareas. Cada tarea
//	debe contener un nombre, una descripci�n, un lugar en el que realizarse y en caso
//	de que sea una reuni�n la persona o entidad con la que nos reuniremos. No puede
//	asignarse m�s de una tarea al mismo periodo del mismo d�a. Si en alg�n momento
//	se ha ocupado m�s de la mitad de los periodos de una semana se avisar� al usuario
//	mediante un mensaje cada vez que a�adamos una nueva tarea. 
	
	// ATRIBUTOS
	private String nombreDia;
	private ArrayList<Tarea> periodos;
	
	// CONTRUCTORES
	public DiaSemana(String nombreDia, ArrayList<Tarea> periodos) {
		this.nombreDia = nombreDia;
		this.periodos = periodos;
	}
	public DiaSemana(String nombreDia) {
		this.nombreDia = nombreDia;
		this.periodos = new ArrayList<Tarea>(4);
	}

	// METODOS
	public String getDia() {
		return nombreDia;
	}

	@Override
	public String toString() {
		return "DiaSemana [dia=" + nombreDia + ", periodos=" + periodos + "]";
	}

	public void setDia(String nombreDia) {
		this.nombreDia = nombreDia;
	}

	public ArrayList<Tarea> getPeriodos() {
		return periodos;
	}

	public void setPeriodos(ArrayList<Tarea> periodos) {
		this.periodos = periodos;
	}
	
	
	
}
