package br.ufrn.imd.model;

import java.math.BigDecimal;

import br.ufrn.imd.ENUM.StatusMaterial;

public class Material {
	private int codigo;
	private String nome;
	private String especificao;
	private GrupoMaterial grupoMaterial;
	private int estoqueMinimo;
	private int pontoPedido;
	private UnidadeMedida unidadeEstoque;
	private UnidadeMedida unidadeEntrada;
	private BigDecimal fatorConversaoEntrada;
	private UnidadeMedida unidadeSaida;
	private BigDecimal fatorConversaoSaida;
	private String dadosAdicionais;
	private ClassificacaoMaterial classificao;
	private int catmat;
	private String condicaoArmazenagem;
	private StatusMaterial status;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecificao() {
		return especificao;
	}
	public void setEspecificao(String especificao) {
		this.especificao = especificao;
	}
	public GrupoMaterial getGrupoMaterial() {
		return grupoMaterial;
	}
	public void setGrupoMaterial(GrupoMaterial grupoMaterial) {
		this.grupoMaterial = grupoMaterial;
	}
	public int getEstoqueMinimo() {
		return estoqueMinimo;
	}
	public void setEstoqueMinimo(int estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}
	public int getPontoPedido() {
		return pontoPedido;
	}
	public void setPontoPedido(int pontoPedido) {
		this.pontoPedido = pontoPedido;
	}
	public UnidadeMedida getUnidadeEstoque() {
		return unidadeEstoque;
	}
	public void setUnidadeEstoque(UnidadeMedida unidadeEstoque) {
		this.unidadeEstoque = unidadeEstoque;
	}
	public UnidadeMedida getUnidadeEntrada() {
		return unidadeEntrada;
	}
	public void setUnidadeEntrada(UnidadeMedida unidadeEntrada) {
		this.unidadeEntrada = unidadeEntrada;
	}
	public BigDecimal getFatorConversaoEntrada() {
		return fatorConversaoEntrada;
	}
	public void setFatorConversaoEntrada(BigDecimal fatorConversaoEntrada) {
		this.fatorConversaoEntrada = fatorConversaoEntrada;
	}
	public UnidadeMedida getUnidadeSaida() {
		return unidadeSaida;
	}
	public void setUnidadeSaida(UnidadeMedida unidadeSaida) {
		this.unidadeSaida = unidadeSaida;
	}
	public BigDecimal getFatorConversaoSaida() {
		return fatorConversaoSaida;
	}
	public void setFatorConversaoSaida(BigDecimal fatorConversaoSaida) {
		this.fatorConversaoSaida = fatorConversaoSaida;
	}
	public String getDadosAdicionais() {
		return dadosAdicionais;
	}
	public void setDadosAdicionais(String dadosAdicionais) {
		this.dadosAdicionais = dadosAdicionais;
	}
	public ClassificacaoMaterial getClassificao() {
		return classificao;
	}
	public void setClassificao(ClassificacaoMaterial classificao) {
		this.classificao = classificao;
	}
	public int getCatmat() {
		return catmat;
	}
	public void setCatmat(int catmat) {
		this.catmat = catmat;
	}
	public String getCondicaoArmazenagem() {
		return condicaoArmazenagem;
	}
	public void setCondicaoArmazenagem(String condicaoArmazenagem) {
		this.condicaoArmazenagem = condicaoArmazenagem;
	}
	public StatusMaterial getStatus() {
		return status;
	}
	public void setStatus(StatusMaterial status) {
		this.status = status;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + catmat;
		result = prime * result + ((classificao == null) ? 0 : classificao.hashCode());
		result = prime * result + codigo;
		result = prime * result + ((condicaoArmazenagem == null) ? 0 : condicaoArmazenagem.hashCode());
		result = prime * result + ((dadosAdicionais == null) ? 0 : dadosAdicionais.hashCode());
		result = prime * result + ((especificao == null) ? 0 : especificao.hashCode());
		result = prime * result + estoqueMinimo;
		result = prime * result + ((fatorConversaoEntrada == null) ? 0 : fatorConversaoEntrada.hashCode());
		result = prime * result + ((fatorConversaoSaida == null) ? 0 : fatorConversaoSaida.hashCode());
		result = prime * result + ((grupoMaterial == null) ? 0 : grupoMaterial.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + pontoPedido;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((unidadeEntrada == null) ? 0 : unidadeEntrada.hashCode());
		result = prime * result + ((unidadeEstoque == null) ? 0 : unidadeEstoque.hashCode());
		result = prime * result + ((unidadeSaida == null) ? 0 : unidadeSaida.hashCode());
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
		Material other = (Material) obj;
		if (catmat != other.catmat)
			return false;
		if (classificao == null) {
			if (other.classificao != null)
				return false;
		} else if (!classificao.equals(other.classificao))
			return false;
		if (codigo != other.codigo)
			return false;
		if (condicaoArmazenagem == null) {
			if (other.condicaoArmazenagem != null)
				return false;
		} else if (!condicaoArmazenagem.equals(other.condicaoArmazenagem))
			return false;
		if (dadosAdicionais == null) {
			if (other.dadosAdicionais != null)
				return false;
		} else if (!dadosAdicionais.equals(other.dadosAdicionais))
			return false;
		if (especificao == null) {
			if (other.especificao != null)
				return false;
		} else if (!especificao.equals(other.especificao))
			return false;
		if (estoqueMinimo != other.estoqueMinimo)
			return false;
		if (fatorConversaoEntrada == null) {
			if (other.fatorConversaoEntrada != null)
				return false;
		} else if (!fatorConversaoEntrada.equals(other.fatorConversaoEntrada))
			return false;
		if (fatorConversaoSaida == null) {
			if (other.fatorConversaoSaida != null)
				return false;
		} else if (!fatorConversaoSaida.equals(other.fatorConversaoSaida))
			return false;
		if (grupoMaterial == null) {
			if (other.grupoMaterial != null)
				return false;
		} else if (!grupoMaterial.equals(other.grupoMaterial))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (pontoPedido != other.pontoPedido)
			return false;
		if (status != other.status)
			return false;
		if (unidadeEntrada == null) {
			if (other.unidadeEntrada != null)
				return false;
		} else if (!unidadeEntrada.equals(other.unidadeEntrada))
			return false;
		if (unidadeEstoque == null) {
			if (other.unidadeEstoque != null)
				return false;
		} else if (!unidadeEstoque.equals(other.unidadeEstoque))
			return false;
		if (unidadeSaida == null) {
			if (other.unidadeSaida != null)
				return false;
		} else if (!unidadeSaida.equals(other.unidadeSaida))
			return false;
		return true;
	}
	
	
}
