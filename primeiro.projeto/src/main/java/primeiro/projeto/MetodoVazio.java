package primeiro.projeto;

public class MetodoVazio {
	
	public void mensagem() {
		
		System.out.println("Bem vindo ao mundo da programação. #BoraEstudar ");
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
			System.out.println(quanto + " é pouco");
			break;
		case 2:
			System.out.println(quanto + " é bom");
			break;
		case 3:
			System.out.println(quanto + " é demais");
			break;
		default:
			System.out.println("opção invalida");
		}
				
	}
}
