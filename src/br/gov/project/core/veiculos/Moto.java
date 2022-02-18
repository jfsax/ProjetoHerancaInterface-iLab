package br.gov.project.core.veiculos;

public class Moto extends Veiculo {
	private int cilindradas;
	private String tipo;
	
	public Moto(String marca, String modelo, int ano, double preco, int cilindradas, String tipo) {
		super(marca, modelo, ano, preco);
		this.cilindradas = cilindradas;
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Cilindradas: " + this.cilindradas + "\n"
				+ "Tipo: " + this.tipo + "\n";
	}
	
	@Override
	public double calcularImposto() {
		double imposto = 0.025;
		
		if (this.cilindradas > 500) {
			imposto = super.preco * 0.05;
		}
		
		return imposto * super.preco;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
