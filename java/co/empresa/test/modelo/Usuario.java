package co.empresa.test.modelo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Usuario implements Serializable {
	private Integer id;
	private String username;
	private String email;
	private String pais;
	
	public Usuario(String username, String pais, String email) {
		this.nombre = nombre;
		this.email = email;
		this.pais = pais;
	}
	
	
}
