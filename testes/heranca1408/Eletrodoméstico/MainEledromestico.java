package heranca1408;

import java.util.Scanner;

public class MainEledromestico {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Microondas micro = new Microondas(null, null, 110, 770, 20);
		
		System.out.println("Digite a marca do microondas:");
		micro.setMarca(sc.next());
		
		System.out.println("Digite o modelo do microondas:");
		
		System.out.println(micro.getModelo());
		
		sc.close();
		
	}

}
