
public class Anakin extends Jedi{
	
	public Anakin(String nome, String mestre, String raca, SabreDeLuz sabreDeLuz) {
		super(nome, mestre, raca, sabreDeLuz);
	}
		
	//M�todo abstract 
	public void manipulacaoDaForca() {
		super.imprimirNomeJedi();
		System.out.println("est� Manipulando a For�a!");
	}
	
}
