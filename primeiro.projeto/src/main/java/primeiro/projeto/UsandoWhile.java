package primeiro.projeto;

public class UsandoWhile {
public static void main(String[] args) {
	
	// TODO Auto-generated method stub
	System.out.println("Testando se variavel n1 = n2");
	System.out.println("Adicionaremos 1 até que elas sejam iguais");
	System.out.println("Usaremos laço de repetição while para isso:");
	
	int n1 = 0;
	int n2 = 2;
	
	System.out.println("n1 = " + n1 + " n2 = " + n2);
	while (n1 < n2) {
		System.out.println("Entrei no bloco while\n");
		System.out.println("n1 tem valor " + n1 + " e n2 tem valor " + n2);
		n1++;
		System.out.println("Adicionando 1 a variavel n1");
	}
	System.out.println("Sai do laço de repetição while");
	System.out.println("Agora  n1 = " + n1 + " e n2 = " + n2);
}
}
