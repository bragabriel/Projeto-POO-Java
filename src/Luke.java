
public class Luke extends Jedi implements IHabEspecial {
	
	private String habilidadeEspecial;
	
	public Luke(String nome, String mestre, String raca, SabreDeLuz sabreDeLuz, String habilidadeEspecial) {
		super(nome, mestre, raca, sabreDeLuz);
		this.habilidadeEspecial = habilidadeEspecial;
	}
	
	//M�todo abstract 
	public void manipulacaoDaForca() {
		System.out.println("Luke Skywalker est� Manipulando a For�a!");
	}
	
	//M�todo imprimir habilidadeEspecial
	public void imprimirHabilidadeEspecial() {
		System.out.print("Sua habilidade especial �: " + this.habilidadeEspecial + "\n");
	}

}
