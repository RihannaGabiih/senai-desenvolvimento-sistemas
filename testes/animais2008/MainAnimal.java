package animais2008;

public class MainAnimal {

	public static void main(String[] args) {
		
		Gato gt = new Gato("Gordão", "branco", 0.80);
		Cachorro ca = new Cachorro("Pipoca", "Amarela", 1);
		Vaca vc = new Vaca("Mimosa", "Pintada", 2);
		
		gt.fazerSom();
		ca.fazerSom();
		vc.fazerSom();

	}

}
