package primeiro.projeto;

public class Sinais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1;
		int n2 = 20;
		boolean pergunta = true;
		
		
		n1 = 210;
		if (n1 > n2) {
			System.out.println("N1 = " + n1 + " e N2 = "+ n2 +"\nN1 � maior > que N2\n");
		}
		n1 = 10;
		if (n1 < n2) {
			System.out.println("N1 = "+ n1 + " e N2 = " + n2 + "\nN1 � menor < que N2\n");
		n1 = n2	;
		}if (n1 == n2) {
			System.out.println("N1 = " + n1 + " e N2 = " + n2 + "\nN1 e N2 s�o iguais");
			
		}if (pergunta) {
			System.out.println("A pergunta � verdadeira");
			
		}if (!pergunta) {
			System.out.println("A pergunta � falsa");
		}
		
	}

}
