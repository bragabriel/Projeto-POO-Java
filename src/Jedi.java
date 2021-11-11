
public abstract class Jedi {

	private String nome;
	private String mestre;
	private String raca;
	private SabreDeLuz sabreDeLuz;
	
	//Construtor
	public Jedi(String nome, String mestre, String raca, SabreDeLuz sabreDeLuz) {
		this.nome = nome;
		this.mestre = mestre;
		this.raca = raca;
		this.sabreDeLuz = sabreDeLuz;
	}
	
	//Sobrecarga de M�todos
		public void nivelJedi() {
			System.out.println("\n" + this.nome + " � um YOUNGLING!");
		}
		
		public void nivelJedi(String nivel) {
			System.out.println("\n" + this.nome + " � um " + nivel);
		}
	
	//M�todo abstract 
	public abstract void manipulacaoDaForca();
	
	//M�todo imprimir nome
	public void imprimirNomeJedi() {
		System.out.println(this.nome);
	}
	
	//M�todo imprimir
	public void imprimirCaracteristicasJedi() {
		System.out.println("Nome = " + this.nome);
		System.out.println("Mestre = " + this.mestre);
		System.out.println("Ra�a = " + this.raca);	
		System.out.println("Cor do Sabre de Luz = " + sabreDeLuz.getCor());
		System.out.println("Tipo do Sabre de Luz = " + sabreDeLuz.getTipoDoSabre() + "\n");
	}
}
