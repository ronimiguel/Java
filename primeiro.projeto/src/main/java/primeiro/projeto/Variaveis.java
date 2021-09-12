package primeiro.projeto;

public class Variaveis {

	public static void main(String[] args) {
		int numeroInteiro = 1;
		double numeroQuebrado = 1.5;
		boolean verdadeiroFalso = true;
		String tipoVariavel = "Variavel do tipo ";

		System.out.println(tipoVariavel + "int Numero inteiro Ex: " + numeroInteiro);
		System.out.println(tipoVariavel + "double Numero quebrado Ex: " + numeroQuebrado);
		System.out.println(tipoVariavel + "boolean Verdadeiro ou Falso Ex: " + verdadeiroFalso);

		/* Atividades utilizando os tipos diferentes de variaveis
		   imprimir idade
		   imprimir altura
		   imprimir nome */
		
		String nome = "Roni";
		int idade = 37;
		double altura = 1.70;

		System.out.println("Meu nome é " + nome + ", Tenho " + idade + " anos e " + altura + " de altura.");

	}
}
