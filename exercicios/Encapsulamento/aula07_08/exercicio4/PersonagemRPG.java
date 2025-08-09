package exercicio4;

public class PersonagemRPG {
	private String nome;
	private String classe;
	private int nivel;
	private int vida;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		while (nivel <0) {
			System.out.println ("Nível invalido");
		}
		}
		
	
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		if (vida <0 || vida >100) {
			System.out.println("A vida só pode ir de 0 até 100.");
		} else {
			this.vida = vida;
		}
	}
	@Override
	public String toString() {
		return "PersonagemRPG "
				+ "nome =" + nome + ", classe = " + classe + ", nivel = " + nivel + ", vida = " + vida + "";
	} 
	
	

}
