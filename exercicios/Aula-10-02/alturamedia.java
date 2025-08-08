package Aula1002;

import java.util.Scanner;

public class AlturaMedia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nome da primeira pessoa:");
		String nome1;
		nome1 = sc.nextLine();
		
		System.out.print("Digite a altura dessa pessoa:");
		Double altura1;
		altura1 = sc.nextDouble();
		
		System.out.print("Digite o nome da segunda pessoa:");
		String nome2;
		nome2 = sc.next();
		
		System.out.print("Digite a altura dessa pessoa:");
		Double altura2;
		altura2 = sc.nextDouble();
		
		double alturaMedia;
		alturaMedia = (altura1 + altura2) / 2 ;
		System.out.print(String.format("Altura media:", alturaMedia );
		
		sc.close();
	
		
		
	
				
		
		
		
	
		
		
		

	}

}
