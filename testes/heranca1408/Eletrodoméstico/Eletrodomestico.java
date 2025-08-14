package heranca1408;

public class Eletrodomestico {
	
	private String modelo;
	private String marca;
	private double tensao;
	private double preço;
	public Eletrodomestico(String modelo, String marca, double tensao, double preço) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.tensao = tensao;
		this.preço = preço;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getTensao() {
		return tensao;
	}
	public void setTensao(double tensao) {
		this.tensao = tensao;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	
	

}
