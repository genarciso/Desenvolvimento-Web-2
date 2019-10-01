package br.ufrn.imd.reserva.modelo;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import br.ufrn.imd.enums.TipoSala;

@Entity
public class Sala {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_SALA")
	@SequenceGenerator(name="SEQ_SALA", sequenceName="id_seq_sala", allocationSize=1)
	private int id;
	
	private String codigo;
	
	private int qtdPessoas;
	
	@Enumerated(EnumType.STRING)
	private TipoSala tipo;
	
	public Sala() {}
	
	public Sala(String codigo, int qtdPessoas, TipoSala tipo) {
		super();
		this.codigo = codigo;
		this.qtdPessoas = qtdPessoas;
		this.tipo = tipo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getQtdPessoas() {
		return qtdPessoas;
	}

	public void setQtdPessoas(int qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}

	public TipoSala getTipo() {
		return tipo;
	}

	public void setTipo(TipoSala tipo) {
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		Sala other = (Sala) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
	
	
}
