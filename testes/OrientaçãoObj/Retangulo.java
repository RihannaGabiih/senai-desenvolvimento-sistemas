package testes;

public class Retangulo {
	
	
	public double alt;
	public double comp;
	
	public double area () {
		return alt * comp;
	}

	@Override
	public String toString() {
		return "Retangulo [alt=" + alt + ", comp=" + comp + "]";
	}
	


}
