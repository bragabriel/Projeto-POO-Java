
public class CloneTrooper {

	private final String caracteristicaPadrao = "\"Todos os Clone Troopers s�o um clone do ca�ador de recompensas Jango Fett\"";
	
	private static int quantidadeCloneTrooper = 0; // Membro Est�tico
	
	public void exibirCaracteristicaCloneTrooper() {
		System.out.println("\nA caracteristica padr�o dos Clone Troopers �: \n" + this.caracteristicaPadrao);
	}

	public void imprimirCaracteristicaClone() {
		System.out.println(this.caracteristicaPadrao);
	}
	
	public void gerarClone() {
		quantidadeCloneTrooper++; // Membro Est�tico
	}
	
	public int getquantidadeCloneTrooper() {
		System.out.println("\nA quantidade de Cloone(s) Trooper(s) existente � de: " + quantidadeCloneTrooper);
		return quantidadeCloneTrooper; // Membro Est�tico
	}
	
}
