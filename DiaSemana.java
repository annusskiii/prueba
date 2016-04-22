package ana_ortega;

import java.util.ArrayList;

public class DiaSemana {

//	// Vamos a hacer una pequeña agenda semanal. La semana constará de días del lunes
//	al viernes. Cada día tendrá cuatro periodos a los que asignar tareas. Cada tarea
//	debe contener un nombre, una descripción, un lugar en el que realizarse y en caso
//	de que sea una reunión la persona o entidad con la que nos reuniremos. No puede
//	asignarse más de una tarea al mismo periodo del mismo día. Si en algún momento
//	se ha ocupado más de la mitad de los periodos de una semana se avisará al usuario
//	mediante un mensaje cada vez que añadamos una nueva tarea. 
	
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
