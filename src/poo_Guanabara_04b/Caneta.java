package poo_Guanabara_04b;

public class Caneta {
	public String modelo;
	public String cor;
	private double ponta;
	protected int carga;
	protected boolean tampada;
	
	
	public Caneta(String m, String c, float p ) {//Metodo Construtor
		this.modelo = m;
		this.cor = c;
		this.ponta = p;
		this.tampar();
		
	}
	
	public String getmodelo() {//Metodo Getter
		return this.modelo;
	}
	
	public void setmodelo(String m ) {//Metodo Setter
		this.modelo = m;
	}
	public double getponta() {
		return this.ponta;
		
	}
	public void setponta(double p) {
		this.ponta = p;
		
	}
	
	public void tampar() {
		this.tampada = true;
		
	}
	public void destampar() {
		this.tampada = false;
	}
	
	public void status() {
	System.out.println("Modelo: "+ this.getmodelo());		
	System.out.println("Ponta: "+  this.getponta());
	System.out.println("Cor : "+ this.cor);
	System.out.println("Tampada?: "+ this.tampada);
	
	
	}
	
	

	
	
	

}
