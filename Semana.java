package ana_ortega;

import java.util.ArrayList;

public class Semana {
//	// Vamos a hacer una pequeña agenda semanal. La semana constará de días del lunes
//	al viernes. Cada día tendrá cuatro periodos a los que asignar tareas. Cada tarea
//	debe contener un nombre, una descripción, un lugar en el que realizarse y en caso
//	de que sea una reunión la persona o entidad con la que nos reuniremos. No puede
//	asignarse más de una tarea al mismo periodo del mismo día. Si en algún momento
//	se ha ocupado más de la mitad de los periodos de una semana se avisará al usuario
//	mediante un mensaje cada vez que añadamos una nueva tarea. 
	
		// ATRIBUTOS
		private ArrayList<DiaSemana> dias;
		
		// CONTRUCTORES
		public Semana(ArrayList<DiaSemana> dias) {
			this.dias = dias;
		}
		
		public Semana() {
			this.dias = new ArrayList<DiaSemana>();
		}

		// METODOS
		@Override
		public String toString() {
			return "Semana [dias=" + dias + "]";
		}

		public ArrayList<DiaSemana> getDias() {
			return dias;
		}

		public void setDias(ArrayList<DiaSemana> dias) {
			this.dias = dias;
		}
		
		
		
		
}
