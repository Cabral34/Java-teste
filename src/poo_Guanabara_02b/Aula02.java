package poo_Guanabara_02b;

public class Aula02 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.cor = "azul";
		//c1.ponta = 0.5f; //Colocado o "F" Devido ao fato de ser um numero real 
		c1.tampar();
		c1.carga = 50;
		c1.rabiscar();
		c1.status();
		
	}

}
