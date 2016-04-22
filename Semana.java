package ana_ortega;

import java.util.ArrayList;

public class Semana {
//	// Vamos a hacer una peque�a agenda semanal. La semana constar� de d�as del lunes
//	al viernes. Cada d�a tendr� cuatro periodos a los que asignar tareas. Cada tarea
//	debe contener un nombre, una descripci�n, un lugar en el que realizarse y en caso
//	de que sea una reuni�n la persona o entidad con la que nos reuniremos. No puede
//	asignarse m�s de una tarea al mismo periodo del mismo d�a. Si en alg�n momento
//	se ha ocupado m�s de la mitad de los periodos de una semana se avisar� al usuario
//	mediante un mensaje cada vez que a�adamos una nueva tarea. 
	
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
