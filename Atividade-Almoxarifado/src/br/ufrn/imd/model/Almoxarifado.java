package br.ufrn.imd.model;

import java.util.List;

import br.ufrn.imd.ENUM.TipoMaterial;
import br.ufrn.imd.model.material.user.Usuario;

public class Almoxarifado {
	private String nome;
	private Usuario chefe;
	private List<TipoMaterial> tiposMateriais;
	private List<Usuario> usuariosAlmoxarifado;
	private boolean enderecado;
	private List<LocalizacaoAlmoxarifado> localizacoes;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Usuario getChefe() {
		return chefe;
	}
	public void setChefe(Usuario chefe) {
		this.chefe = chefe;
	}
	public List<TipoMaterial> getTiposMateriais() {
		return tiposMateriais;
	}
	public void setTiposMateriais(List<TipoMaterial> tiposMateriais) {
		this.tiposMateriais = tiposMateriais;
	}
	public List<Usuario> getUsuariosAlmoxarifado() {
		return usuariosAlmoxarifado;
	}
	public void setUsuariosAlmoxarifado(List<Usuario> usuariosAlmoxarifado) {
		this.usuariosAlmoxarifado = usuariosAlmoxarifado;
	}
	public boolean isEnderecado() {
		return enderecado;
	}
	public void setEnderecado(boolean enderecado) {
		this.enderecado = enderecado;
	}
	public List<LocalizacaoAlmoxarifado> getLocalizacoes() {
		return localizacoes;
	}
	public void setLocalizacoes(List<LocalizacaoAlmoxarifado> localizacoes) {
		this.localizacoes = localizacoes;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chefe == null) ? 0 : chefe.hashCode());
		result = prime * result + (enderecado ? 1231 : 1237);
		result = prime * result + ((localizacoes == null) ? 0 : localizacoes.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((tiposMateriais == null) ? 0 : tiposMateriais.hashCode());
		result = prime * result + ((usuariosAlmoxarifado == null) ? 0 : usuariosAlmoxarifado.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Almoxarifado other = (Almoxarifado) obj;
		if (chefe == null) {
			if (other.chefe != null)
				return false;
		} else if (!chefe.equals(other.chefe))
			return false;
		if (enderecado != other.enderecado)
			return false;
		if (localizacoes == null) {
			if (other.localizacoes != null)
				return false;
		} else if (!localizacoes.equals(other.localizacoes))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (tiposMateriais == null) {
			if (other.tiposMateriais != null)
				return false;
		} else if (!tiposMateriais.equals(other.tiposMateriais))
			return false;
		if (usuariosAlmoxarifado == null) {
			if (other.usuariosAlmoxarifado != null)
				return false;
		} else if (!usuariosAlmoxarifado.equals(other.usuariosAlmoxarifado))
			return false;
		return true;
	}
}
