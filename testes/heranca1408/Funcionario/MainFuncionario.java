package heranca1408;

public class MainFuncionario {

	public static void main(String[] args) {
		
		Engenheiro eng = new Engenheiro("Daniel" , 7000, "4251722X", 463876);
		
		System.out.println(eng.getNome());
		
		eng.setNome("Bruno");
		
		System.out.println(eng.getNome());
	}

}
