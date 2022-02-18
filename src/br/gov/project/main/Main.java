package br.gov.project.main;

import java.util.ArrayList;

import br.gov.project.core.imoveis.*;
import br.gov.project.core.veiculos.*;
import br.gov.project.taxes.BemTributavel;

public class Main {
	public static void main(String[] args) {
		Imovel[] imoveis = new Imovel[4];
		imoveis[0] = new Comercial("Rua Tal, 220", 45000, "Lojinha");
		imoveis[1] = new Comercial("Rua Nise da Silveira, 1040", 70000, "Mercadinho");
		imoveis[2] = new Residencial("Rua Maria, 97", 100000, 100);
		imoveis[3] = new Rural("Rua Maria, 97", 20000, "Propriedade Familiar");
		
		Veiculo[] veiculos = new Veiculo[3];
		veiculos[0] = new Carro("Ford", "Focus", 2000, 20000, 4, 1.6f);
		veiculos[1] = new Moto("Suzuki", "Intruder", 2015, 15000, 500, "Custom");
		veiculos[0] = new Carro("Buick", "Riviera", 1964, 100000, 2, 1.0f);
		
		ArrayList<BemTributavel> bens = new ArrayList<BemTributavel>();
		
		for (Imovel imovel: imoveis) {
			if (imovel instanceof BemTributavel) {
				bens.add((BemTributavel) imovel);
			}
		}
		
		for (Veiculo veiculo: veiculos) {
			if (veiculo instanceof BemTributavel) {
				bens.add((BemTributavel) veiculo);
			}
		}
		
		for (BemTributavel bem: bens) {			
			System.out.println("BEM: \n" + bem + "IMPOSTO DEVIDO: R$" + String.format("%.2f", bem.calcularImposto()) + "\n");
		}
	}
}
