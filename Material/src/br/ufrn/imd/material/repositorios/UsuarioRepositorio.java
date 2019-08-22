package br.ufrn.imd.material.repositorios;

import java.util.ArrayList;
import java.util.List;

import br.ufrn.imd.material.dominio.Usuario;

public class UsuarioRepositorio {
	public static List<Usuario> usuarios;
	
	public static Usuario getUsuario(String login, String senha) {
		if (usuarios == null) {
			usuarios = new ArrayList<Usuario>();
			Usuario user = new Usuario("genarciso", "123");
			user.setNome("Gabriel");
			usuarios.add(user);
		}
		
		for (Usuario user: usuarios) {
			if (user.getLogin().equals(login) && user.getSenha().equals(senha)) {
				return user;
			}
		}
		return null;
	}
	
}
