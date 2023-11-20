package poo_Guanabara_02b;

public class Caneta {
	//Atributos (Caracteristicas Caneta. "Coisas que Tenho")
	//Foi aplicado os modelos de segurança/acesso do atributo
	public String modelo;
	public String cor;
	private double ponta;
	protected int carga;
	protected boolean tampada;
	
	// Metodos(Coisas que o objeto faz)
	public void status() {
		System.out.println("Você tem uma caneta "+this.cor);
		System.out.println("com uma ponta "+this.ponta+" mm");
		System.out.println("Carga: "+this.carga);
		System.out.println("O modelo da sua caneta é: "+this.modelo);
		if(tampada == true) {
			System.out.println("E a sua caneta está tampada");
		}else {
		System.out.println("e a sua caneta está destampada");
		}
	}
	public void rabiscar() {
		if (tampada == true) {
			System.out.println("ERRO!! Favor destampar a caneta");
			
		}else {
			System.out.println("Estou rabiscando ");
			this.carga= carga--;
		}
	}
	protected void tampar() {
		this.tampada = true;
	}
	protected void destampar() {
		this.tampada = false;
	}
	
}
