package coche;

public class Coche {
	public String nombre= null;
	public int rendimiento;
	
	public Coche(String nombre, int rendimiento){
		this.nombre= nombre;
		this.rendimiento= rendimiento;
	}

	
	


		//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getRendimiento() {
		return rendimiento;
	}

	public void setRendimiento(int rendimiento) {
		this.rendimiento = rendimiento;
	}
		// Fin - Getters y Setters

}
