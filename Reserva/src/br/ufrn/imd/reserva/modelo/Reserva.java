package br.ufrn.imd.reserva.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Reserva {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_RESERVA")
	@SequenceGenerator(name="SEQ_RESERVA", sequenceName="id_seq_reserva", allocationSize=1)
	private int id;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataInicio;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataFim;
	
	@ManyToOne
	@JoinColumn(name="id_sala")
	private Sala salaReservada;
	
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private Usuario usuarioReserva;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public Sala getSalaReservada() {
		return salaReservada;
	}

	public void setSalaReservada(Sala salaReservada) {
		this.salaReservada = salaReservada;
	}

	public Usuario getUsuarioReserva() {
		return usuarioReserva;
	}

	public void setUsuarioReserva(Usuario usuarioReserva) {
		this.usuarioReserva = usuarioReserva;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Reserva other = (Reserva) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	

}
