package br.gov.project.core.imoveis;

public abstract class Imovel {
	protected String endereco;
	protected double valorVenal;
	
	public Imovel(String endereco, double valorVenal) {
		super();
		this.endereco = endereco;
		this.valorVenal = valorVenal;
	}
	
	@Override
	public String toString() {
		return "Endereco: " + this.endereco + "\n"
				+ "Valor venal: " + String.format("%.2f", this.valorVenal) + "\n";
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getValorVenal() {
		return valorVenal;
	}

	public void setValorVenal(double valorVenal) {
		this.valorVenal = valorVenal;
	}
}