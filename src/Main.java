import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//Objetos (sabreDeLuz) 
		SabreDeLuz sabreYoda = new SabreDeLuz("Verde", "Curto");
		SabreDeLuz sabreAnakin = new SabreDeLuz("Azul", "Comum");
		SabreDeLuz sabreLuke = new SabreDeLuz("Azul", "Comum");
		
		//Objeto (Yoda)
		Yoda yoda = new Yoda("Yoda", "N'Kata Del Gormo", "Yoda", sabreYoda, "Absorver Rel�mpago");
				
		//Sobrecarga de m�todo 
		yoda.nivelJedi("Gr�o-Mestre Jedi");
		
		//M�todo abstract
		yoda.manipulacaoDaForca();
		
		//M�todo + interface/protocolo
		yoda.imprimirHabilidadeEspecial();
		
		
		
		//Objeto (Anakin crian�a)
		Anakin anakinKID = new Anakin("Anakin Skywalker (crian�a)", "Obi-Wan Kenobi", "Humano", sabreAnakin);
		
		//Sobrecarga de m�todo
		anakinKID.nivelJedi();
		
		
		
		//Objeto (Luke Skywalker)
		Luke luke = new Luke("Luke Skywalker", "Obi-Wan & Yoda", "Humano", sabreLuke, "Comunica��o com os mortos");
		
		//Sobrecarga de m�todo
		luke.nivelJedi("Cavalheiro Jedi");
		
		//M�todo abstract
		luke.manipulacaoDaForca();
		
		//M�todo + interface/protocolo
		luke.imprimirHabilidadeEspecial();
		
		
		
		//Polimorfismo
		ArrayList<Jedi> listaJedis = new ArrayList<Jedi>();
		
		listaJedis.add(yoda);
		listaJedis.add(anakinKID);
		listaJedis.add(luke);
		
		System.out.println("\nvvvvvvvvvvvvvvvvvv");
		System.out.println("\nImprimindo a lista de Jedi(s):\n");
		for(int i = 0; i < listaJedis.size(); i++) {
			System.out.println((i+1) + "� Jedi da lista: ");
			listaJedis.get(i).imprimirCaracteristicasJedi();;
		}
		System.out.println("^^^^^^^^^^^^^^^^^^");
		
		
		
		
		//Objeto (Clone Trooper)
		CloneTrooper clone1 = new CloneTrooper();
		
		//M�todo + Membro Constante
		clone1.exibirCaracteristicaCloneTrooper();
		
		clone1.gerarClone();
	
		clone1.getquantidadeCloneTrooper();
		
		clone1.gerarClone();
		
		clone1.getquantidadeCloneTrooper();
	}
	
}