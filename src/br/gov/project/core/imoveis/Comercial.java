package br.gov.project.core.imoveis;

import br.gov.project.taxes.BemTributavel;

public class Comercial extends Imovel implements BemTributavel {
	String uso;
	
	public Comercial(String endereco, double valorVenal, String uso) {
		super(endereco, valorVenal);
		this.uso = uso;
	}
	
	@Override
	public double calcularImposto() {
		return super.valorVenal * 0.04;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Uso: " + this.uso + "\n";
	}
}