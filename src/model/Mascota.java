package model;

public class Mascota {
	private String id;
	private String name;
	private int edad;
	private String ficha;
	
	public Mascota() {
		super();
		id="-1";
		name = "";
		edad = 0;
		ficha = "";
	}

	public Mascota(String id,String name, int edad, String descripcion) {
		super();
		this.id = id;
		this.name = name;
		this.edad = edad;
		this.ficha = descripcion;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDescripcion() {
		return ficha;
	}
	public void setFicha(String ficha) {
		this.ficha = ficha;
	}
	
}
