package sistemaVeiculos;

import java.util.ArrayList;

public class MainVeiculo {

	public static void main(String[] args) {

		ArrayList<Veiculo> veiculos = new ArrayList<>();
		veiculos.add(new Carro("Fusca"));
		veiculos.add(new Bicicleta("Caloi"));
		veiculos.add(new Onibus("Mercedes-Benz", 5));

		System.out.println("----Sistema de Transporte----");
		for (Veiculo v : veiculos) {
			float tempo = v.calcularTempo(100);
			int horas = (int) tempo;
			int minutos = (int) ((tempo - horas) * 60);
			System.out.println(v.getModelo() + " leva aproximadamente " + horas + "h" +
			minutos + "min para percorrer 100km");

		}

	}

}
