package model;

public class Yeezy {

	private String referencia;
	private String color;
	
	
	public Yeezy() {}
	
	public Yeezy(String string) {
	this.referencia = string;
	int random = (int) (Math.random() * 5);	
	if (random == 0) {	
		this.color = "Negro";
		} else if (random == 1) {
			this.color = "Crema";
		} else if (random == 2) {
			this.color = "Terracota";
		} else if (random == 3) {
			this.color = "Blanco";
		} else if (random == 4) {
			this.color = "Gris";
		}	
	}
	
	public Yeezy(String referencia, String color) {
		super();
		this.referencia = referencia;
		this.color = color;
	}
	
	
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
