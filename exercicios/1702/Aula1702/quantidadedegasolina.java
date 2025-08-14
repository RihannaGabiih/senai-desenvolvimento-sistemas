package Aula1702;

import java.util.Scanner;

public class quantidadedegasolina{

	public static void main(String[] args) {
		// Efetuar o cálculo da quantidade de litros de combustível,gasta em uma viagem, 
		//utilizando um automóvel que faz 12quilômetros por litro.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o tempo gasto durante a viagem:");
		double tempo;
		tempo = sc.nextDouble();
		
		System.out.print("Digite a velocidade média durante a viagem:");
		double velocidade;
		velocidade = sc.nextDouble();
		
		double distancia;
		distancia = tempo * velocidade;
		
		double litros;
		litros = distancia / 12;
		
		System.out.println("Tempo gasto durante a viagem: " + tempo);
		System.out.println("Velocidade média durante a viagem: " + velocidade);
		System.out.println("Distância percorrida: " + distancia);
		System.out.println(String.format("Quantidade de litros de gasolina utilizados na viagem: %.2f " , litros));
		
		sc.close();
		
	
	

	}

}
