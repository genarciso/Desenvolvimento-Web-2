package br.ufrn.imd.model;

public class TipoEstoque {
	private int lote;
	private int material;
	public int getLote() {
		return lote;
	}
	public void setLote(int lote) {
		this.lote = lote;
	}
	public int getMaterial() {
		return material;
	}
	public void setMaterial(int material) {
		this.material = material;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + lote;
		result = prime * result + material;
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
		TipoEstoque other = (TipoEstoque) obj;
		if (lote != other.lote)
			return false;
		if (material != other.material)
			return false;
		return true;
	}
	
	
}	
