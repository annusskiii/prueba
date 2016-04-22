package agenda;

import java.util.ArrayList;

public class Agenda {
//	// Vamos a hacer una peque�a agenda semanal. La semana constar� de d�as del lunes
//	al viernes. Cada d�a tendr� cuatro periodos a los que asignar tareas. Cada tarea
//	debe contener un nombre, una descripci�n, un lugar en el que realizarse y en caso
//	de que sea una reuni�n la persona o entidad con la que nos reuniremos. No puede
//	asignarse m�s de una tarea al mismo periodo del mismo d�a. Si en alg�n momento
//	se ha ocupado m�s de la mitad de los periodos de una semana se avisar� al usuario
//	mediante un mensaje cada vez que a�adamos una nueva tarea. 
	
		// ATRIBUTOS
		private ArrayList<Semana> semanas;
		private final int MAXPERIODOS=20; // 4 periodos x 5 dias = 20 periodos
		
		// CONTRUCTORES
		public Agenda(ArrayList<Semana> semanas) {
			this.semanas = semanas;
		}
		public Agenda() {
			this.semanas = new ArrayList<Semana>();
		}

		// METODOS
		public void alertarMitadOcupados() {
			ArrayList<DiaSemana> listaDias = semanas.get().getDias();
			int contPeriodos=0;
			for (DiaSemana dia : listaDias) {
				contPeriodos += dia.getPeriodos().size();
			}
			if (contPeriodos>=MAXPERIODOS/2) {
				System.out.println("SE HA SUPERADO LA MITAD DE LOS PERIODOS SEMANALES");
			}
		}
		
		@Override
		public String toString() {
			return "Agenda [semanas=" + semanas + "]";
		}

		public ArrayList<Semana> getSemanas() {
			return semanas;
		}

		public void setSemanas(ArrayList<Semana> semanas) {
			this.semanas = semanas;
		}

                
                
                
                
                
                
}
