package carrera;

import circuito.Circuito;
import equipo.Equipo;

public class Carrera {
	public Circuito circuito= null;
	public Equipo equipo1= null;
	
	public String ganador= null;
	
	public Carrera(String nombreCircuito){
		this.circuito= new Circuito(nombreCircuito);
		this.equipo1= new Equipo("Atletico GP");
	}

	public String simularCarrera(){
		ganador= "El ganador del GP de "+circuito.nombre+" es: ";
		if(Math.random()>0.5){
			ganador+= equipo1.piloto1.nombrePiloto;
		}else{
			ganador+= equipo1.piloto2.nombrePiloto;
		}
		
		return ganador;
	}
	
	
	
	
		//Getters y Setters
	public Circuito getCircuito() {
		return circuito;
	}

	public void setCircuito(Circuito circuito) {
		this.circuito = circuito;
	}

	public Equipo getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}
	
		// Fin - Getters y Setters
}
