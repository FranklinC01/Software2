package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the login database table.
 * 
 */
@Entity
@NamedQueries({
	@NamedQuery(name="Login.control", query="SELECT l FROM Login l WHERE l.nombreUsuario = :nombreUsuario AND l.contrase�a = :contrase�a"),
	@NamedQuery(name="Login.findAll", query="SELECT l FROM Login l")})
public class Login implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idregistro;

	private String contrase�a;

	private String nombreUsuario;

	public Login() {
	}

	public int getIdregistro() {
		return this.idregistro;
	}

	public void setIdregistro(int idregistro) {
		this.idregistro = idregistro;
	}

	public String getContrase�a() {
		return this.contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	public String getNombreUsuario() {
		return this.nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

}