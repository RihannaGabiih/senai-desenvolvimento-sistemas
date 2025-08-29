package cachePessoas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Pessoa ps = new Pessoa();

		ArrayList<Pessoa> banco = new ArrayList<>();
		banco.add(new Pessoa(123456789, "Amanda", 15));
		banco.add(new Pessoa(234567908, "Lais", 18));
		banco.add(new Pessoa(123456098, "Bruno", 18));
		banco.add(new Pessoa(679321987, "Marlene", 37));
		banco.add(new Pessoa(998345678, "Marianna", 22));
		banco.add(new Pessoa(111222333, "Felipe", 25));
		banco.add(new Pessoa(222333444, "Julia", 30));
		banco.add(new Pessoa(333444555, "Carlos", 28));
		banco.add(new Pessoa(444555666, "Marina", 21));
		banco.add(new Pessoa(555666777, "Lucas", 35));
		banco.add(new Pessoa(666777888, "Sofia", 27));
		banco.add(new Pessoa(777888999, "Rafael", 32));
		banco.add(new Pessoa(888999111, "Beatriz", 24));

		ArrayList<Pessoa> cache = new ArrayList<>();
		cache.add(new Pessoa(234567908, "Lais", 18));
		cache.add(new Pessoa(123456098, "Bruno", 18));
		cache.add(new Pessoa(679321987, "Marlene", 37));
		cache.add(new Pessoa(998345678, "Marianna", 22));
		cache.add(new Pessoa(111222333, "Felipe", 25));


		while (true) {
		    System.out.print("Digite o ID (0 para sair): ");
		    ps.setId(sc.nextInt());
		    if (ps.getId() == 0) break;
		    

		Pessoa encontrada = null;

		for (Pessoa p : cache) {
			if (p.getId() == ps.getId()) {
				encontrada = p;
				break;
			}
		}
		if (encontrada != null) {
			System.out.println("Pessoa encontrada no cache");
		} else {

			for (Pessoa p : banco) {
				if (p.getId() == ps.getId()) {
					encontrada = p;
					break;
				}
			}

			if (encontrada != null) {
				if (cache.size() == 10) {
					cache.remove(0);
				}
				cache.add(encontrada);
				System.out.println("Pessoa encontrada no banco e adicionada no cache");
			} else {
				System.out.println("Pessoa não encontrada");
			}
		}
		System.out.println(encontrada);

		
		}
		sc.close();
	}

}
