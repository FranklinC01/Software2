package controller;

import java.io.Serializable;
import query.DataQuery;

public class LoginController implements Serializable {
	
	private String nombreUsuario;
	private String contrase�a;
	private DataQuery query = new DataQuery();
	
	public String loginControlUser() {
		if(query.loginControl(nombreUsuario, contrase�a)) {
			return "user.xhtml?faces-redirect=true";
		}
		return "";
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
}
