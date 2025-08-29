package animais2008;

public class Cachorro extends Animal {

	public Cachorro(String nome, String cor, double tamanho) {
		super(nome, cor, tamanho);
	}
	@Override
	public void fazerSom() {
		super.fazerSom();
		System.out.println("auauauuu");
	}

}
