package br.ufrn.imd.model;

import java.math.BigDecimal;

import br.ufrn.imd.documento.Documento;
import br.ufrn.imd.producao.DenominacaoComumBrasileira;

public class MaterialAnalisavel {
	private BigDecimal teorConcentracao;
	private int prazoEntrega;
	private DenominacaoComumBrasileira dcb;
	private String apresentacaoFarmaceutica;
	private BigDecimal volumeMinimo;
	private Documento fichaSeguranca;
	private long registroAnvisa;
	private BigDecimal qtdAmostraAnalise;
	private int tempoLimiteAnalise;
	private int testeMaquina;
	private Material material;
	
	public BigDecimal getTeorConcentracao() {
		return teorConcentracao;
	}
	public void setTeorConcentracao(BigDecimal teorConcentracao) {
		this.teorConcentracao = teorConcentracao;
	}
	public int getPrazoEntrega() {
		return prazoEntrega;
	}
	public void setPrazoEntrega(int prazoEntrega) {
		this.prazoEntrega = prazoEntrega;
	}
	public DenominacaoComumBrasileira getDcb() {
		return dcb;
	}
	public void setDcb(DenominacaoComumBrasileira dcb) {
		this.dcb = dcb;
	}
	public String getApresentacaoFarmaceutica() {
		return apresentacaoFarmaceutica;
	}
	public void setApresentacaoFarmaceutica(String apresentacaoFarmaceutica) {
		this.apresentacaoFarmaceutica = apresentacaoFarmaceutica;
	}
	public BigDecimal getVolumeMinimo() {
		return volumeMinimo;
	}
	public void setVolumeMinimo(BigDecimal volumeMinimo) {
		this.volumeMinimo = volumeMinimo;
	}
	public Documento getFichaSeguranca() {
		return fichaSeguranca;
	}
	public void setFichaSeguranca(Documento fichaSeguranca) {
		this.fichaSeguranca = fichaSeguranca;
	}
	public long getRegistroAnvisa() {
		return registroAnvisa;
	}
	public void setRegistroAnvisa(long registroAnvisa) {
		this.registroAnvisa = registroAnvisa;
	}
	public BigDecimal getQtdAmostraAnalise() {
		return qtdAmostraAnalise;
	}
	public void setQtdAmostraAnalise(BigDecimal qtdAmostraAnalise) {
		this.qtdAmostraAnalise = qtdAmostraAnalise;
	}
	public int getTempoLimiteAnalise() {
		return tempoLimiteAnalise;
	}
	public void setTempoLimiteAnalise(int tempoLimiteAnalise) {
		this.tempoLimiteAnalise = tempoLimiteAnalise;
	}
	public int getTesteMaquina() {
		return testeMaquina;
	}
	public void setTesteMaquina(int testeMaquina) {
		this.testeMaquina = testeMaquina;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apresentacaoFarmaceutica == null) ? 0 : apresentacaoFarmaceutica.hashCode());
		result = prime * result + prazoEntrega;
		result = prime * result + ((qtdAmostraAnalise == null) ? 0 : qtdAmostraAnalise.hashCode());
		result = prime * result + (int) (registroAnvisa ^ (registroAnvisa >>> 32));
		result = prime * result + tempoLimiteAnalise;
		result = prime * result + ((teorConcentracao == null) ? 0 : teorConcentracao.hashCode());
		result = prime * result + testeMaquina;
		result = prime * result + ((volumeMinimo == null) ? 0 : volumeMinimo.hashCode());
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
		MaterialAnalisavel other = (MaterialAnalisavel) obj;
		if (apresentacaoFarmaceutica == null) {
			if (other.apresentacaoFarmaceutica != null)
				return false;
		} else if (!apresentacaoFarmaceutica.equals(other.apresentacaoFarmaceutica))
			return false;
		if (prazoEntrega != other.prazoEntrega)
			return false;
		if (qtdAmostraAnalise == null) {
			if (other.qtdAmostraAnalise != null)
				return false;
		} else if (!qtdAmostraAnalise.equals(other.qtdAmostraAnalise))
			return false;
		if (registroAnvisa != other.registroAnvisa)
			return false;
		if (tempoLimiteAnalise != other.tempoLimiteAnalise)
			return false;
		if (teorConcentracao == null) {
			if (other.teorConcentracao != null)
				return false;
		} else if (!teorConcentracao.equals(other.teorConcentracao))
			return false;
		if (testeMaquina != other.testeMaquina)
			return false;
		if (volumeMinimo == null) {
			if (other.volumeMinimo != null)
				return false;
		} else if (!volumeMinimo.equals(other.volumeMinimo))
			return false;
		return true;
	}
	
}
