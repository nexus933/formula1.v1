package equipo;

import piloto.Piloto;

public class Equipo {
	public String nombre= null;
	public Piloto piloto1= null;
	public Piloto piloto2= null;
	
	public Equipo(String nombre){
		this.nombre= nombre;
		this.piloto1= new Piloto("Jacinto Benavente", 68, "TLT-1.0", 73);
		this.piloto2= new Piloto("Israel Palestino", 51, "TLT-1.0", 73);
	}

	
	
	
		//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
		// Fin - Getters y Setters

}
