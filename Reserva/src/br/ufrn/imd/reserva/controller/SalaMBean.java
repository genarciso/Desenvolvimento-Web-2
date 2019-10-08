package br.ufrn.imd.reserva.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import br.ufrn.imd.reserva.controller.UsuarioMBean;
import br.ufrn.imd.reserva.modelo.Sala;
import br.ufrn.imd.reserva.repositorio.SalaRepositorio;

@Named("salaMBean")
@SessionScoped
public class SalaMBean implements Serializable{
	private Sala sala;
	private DataModel<Sala> salasModel;
	@Inject
	private UsuarioMBean usuarioMBean;

	@Inject
	private SalaRepositorio salaRepositorio;

	public String novoSala() {
		sala = new Sala();
		return "/pages/Sala/form.jsf";
	}

	public String cadastrarSala() {
		
		salaRepositorio.adicionar(sala);
		sala = new Sala();
		return "/pages/Sala/form.jsf";
	}

	public String listarMateriais() {
		salasModel = new ListDataModel<Sala>(salaRepositorio.listarSalas());
		return "/pages/Sala/list.jsf";
	}

	public String removerSala() {
		Sala salaRemovido = salasModel.getRowData();
		salaRepositorio.remover(salaRemovido);
		return listarMateriais();
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala Sala) {
		this.sala = Sala;
	}

	public DataModel<Sala> getMateriaisModel() {
		return salasModel;
	}

	public void setMateriaisModel(DataModel<Sala> materiaisModel) {
		this.salasModel = materiaisModel;
	}

	public UsuarioMBean getUsuarioMBean() {
		return usuarioMBean;
	}

	public void setUsuarioMBean(UsuarioMBean usuarioMBean) {
		this.usuarioMBean = usuarioMBean;
	}
}
