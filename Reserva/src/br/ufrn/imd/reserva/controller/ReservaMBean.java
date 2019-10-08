package br.ufrn.imd.reserva.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.inject.Inject;
import javax.inject.Named;

import br.ufrn.imd.reserva.modelo.Reserva;
import br.ufrn.imd.reserva.repositorio.ReservaRepositorio;

@Named("reservaMBean")
@SessionScoped
public class ReservaMBean implements Serializable{
	
	private Reserva reserva;
	private DataModel<Reserva> listaReserva;
	
	@Inject
	private UsuarioMBean usuarioMBean;
	
	@Inject
	private ReservaRepositorio reservaRepositorio;
	
	
	public String novaReserva() {
		reserva = new Reserva();
		return "/pages/reservas/form.jsf";
	}
	
	public String cadastrarReserva() {
		reserva.setUsuarioReserva(usuarioMBean.getUsuarioLogado());
		reservaRepositorio.adicionar(reserva);
		return "/pages/reserva/form.jsf";
	}
	
	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	public DataModel<Reserva> getListaReserva() {
		return listaReserva;
	}

	public void setListaReserva(DataModel<Reserva> listaReserva) {
		this.listaReserva = listaReserva;
	}
	
}
