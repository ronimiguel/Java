package primeiro.projeto;

public class MetodoVazio {
	
	public void mensagem() {
		
		System.out.println("Bem vindo ao mundo da programa��o. #BoraEstudar ");
	}

	public void contandoComWhile() {
		int i = 0;
		while (i < 5) {
			System.out.println("contando com while " + i);
			i++;
		}
	}
	
	public void contandoComFor() {
		for(int i = 0; i<5; i++)
			System.out.println("contando com for " + i);
	}
	
	public void casos() {
		int quanto = 3;
		
		switch (quanto) {
		case 1:
			System.out.println(quanto + " � pouco");
			break;
		case 2:
			System.out.println(quanto + " � bom");
			break;
		case 3:
			System.out.println(quanto + " � demais");
			break;
		default:
			System.out.println("op��o invalida");
		}
				
	}
}
