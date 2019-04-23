package es.sd.FlickrSPA;

public class Usuario {
	
	private String user_id;
	private String nombre;
	
	public Usuario () {
		
	}
	
	public Usuario (String user_id) {
		this.user_id = user_id;
		this.nombre = null;
	}

	public Usuario (String user_id, String nombre) {
		this.user_id = user_id;
		this.nombre = nombre;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
