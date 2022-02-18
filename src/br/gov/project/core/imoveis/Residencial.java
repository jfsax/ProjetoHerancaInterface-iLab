package br.gov.project.core.imoveis;

import br.gov.project.taxes.BemTributavel;

public class Residencial extends Imovel implements BemTributavel {
	private float metragem;
	
	public Residencial(String endereco, double valorVenal, float metragem) {
		super(endereco, valorVenal);
		this.metragem = metragem;
	}
	
	@Override
	public double calcularImposto() {
		double imposto = 0.015;
		
		if (this.metragem > 100) {
			imposto = 0.03;
		}
		
		return imposto * super.valorVenal;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Metragem: " + this.metragem + "\n";
	}

	public float getMetragem() {
		return metragem;
	}

	public void setMetragem(float metragem) {
		this.metragem = metragem;
	}
}