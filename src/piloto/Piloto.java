package piloto;

import coche.Coche;

public class Piloto {
	public String nombrePiloto= null;
	public int rendimientoPiloto;
	public Coche coche;
	
	public Piloto(String nombrePiloto, int rendimientoPiloto, String nombreCoche, int rendimientoCoche){
		this.nombrePiloto= nombrePiloto;
		this.rendimientoPiloto= rendimientoPiloto;
		this.coche= new Coche(nombreCoche, rendimientoCoche);
	}

	
	
	
	
	
		
		//Getters y Setters
	public String getNombrePiloto() {
		return nombrePiloto;
	}

	public void setNombrePiloto(String nombrePiloto) {
		this.nombrePiloto = nombrePiloto;
	}

	public int getRendimientoPiloto() {
		return rendimientoPiloto;
	}

	public void setRendimientoPiloto(int rendimientoPiloto) {
		this.rendimientoPiloto = rendimientoPiloto;
	}

	public Coche getCoche() {
		return coche;
	}

	public void setCoche(Coche coche) {
		this.coche = coche;
	}
		// Fin - Getters y Setters


}
