package br.ufrn.imd.reserva.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import br.ufrn.imd.reserva.modelo.Usuario;
import br.ufrn.imd.reserva.repositorio.UsuarioRepositorio;

@Named("usuarioMBean")
@SessionScoped
public class UsuarioMBean implements Serializable{
	
	@Inject
	private UsuarioRepositorio usuarioRepositorio;
	
	private Usuario usuario;
	
	private Usuario usuarioLogado;
	
	public UsuarioMBean() {
		usuario = new Usuario();
	}
	
	public String logar() {
		Usuario usuarioBD = usuarioRepositorio.getUsuario(usuario.getLogin(), usuario.getSenha());
		
		if (usuarioBD != null) {
			usuarioLogado = usuarioBD;
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().
			put("usuarioLogado", usuarioLogado);
			return "/pages/index.jsf";
		} else {
			FacesMessage msg = new FacesMessage("Usuário não encontrado");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			FacesContext.getCurrentInstance().addMessage("", msg);
			return null;
		}
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Usuario getUsuarioLogado() {
		return usuarioLogado;
	}

	public void setUsuarioLogado(Usuario usuarioLogado) {
		this.usuarioLogado = usuarioLogado;
	}
}
