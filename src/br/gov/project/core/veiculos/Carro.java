package br.gov.project.core.veiculos;

public class Carro extends Veiculo {
	private int numeroPortas;
	private float potencia;
	
	public Carro(String marca, String modelo, int ano, double preco, int numeroPortas, float potencia) {
		super(marca, modelo, ano, preco);
		this.numeroPortas = numeroPortas;
		this.potencia = potencia;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Numero de portas: " + this.numeroPortas + "\n"
				+ "Potencia: " + this.potencia + "\n";
	}
	
	@Override
	public double calcularImposto() {
		double imposto = 0;
		
		if (this.ano >= 2000) {
			imposto = 0.04;
		}
		
		return imposto * super.preco;
	}

	public int getNumeroPortas() {
		return numeroPortas;
	}

	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}
}
