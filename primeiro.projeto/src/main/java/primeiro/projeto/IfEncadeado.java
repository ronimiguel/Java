package primeiro.projeto;

public class IfEncadeado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean n1 = true;
		boolean n2 = true;
		boolean n3 = true;
		
		if(n1) {
			System.out.println("Entrou no if 1");
			if(n2) {
				System.out.println("Entrou no if 2");
				if(n3) {
					System.out.println("Entrou no if 3");
				}else {
					System.out.println("Nao Entrou no if 3");
				}
			}else {
				System.out.println("Nao Entrou no if 2");
			}
		}else {
			System.out.println("Nao entrou no if 1");
		}
		
		
	}

}
