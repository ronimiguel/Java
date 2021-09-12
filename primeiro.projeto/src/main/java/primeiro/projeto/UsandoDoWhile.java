package primeiro.projeto;

public class UsandoDoWhile {
	public static void main(String[] args) {
		/* Usando do while
		 * o do executa codigo antes de testar
		 * o while (testa) e só executa as instruções enquanto a expressão
		 * for verdadeira
		*/
	
	int n1 = 0;
	int n2 = 2;
	String separador = "****************************************************";
	String inicio = "----------------------inicio-----------------------";
	String fim = "-----------------------fim-------------------------\n\n";

	System.out.println(separador);
	System.out.println("*****USANDO O WHILE: TESTANDO ANTES DE EXECUTAR*****");
	System.out.println("Se n1 for menor do que n2, será adicionado 1 a n1\n");
	System.out.println(inicio);
	
	/*
	 * será adicionado 1 a n1 enquanto n1 for menor que n2 
	 * Deve-se incrementar a variavel n1 para que esse laço de repetição
	 * não seja infinito
	 */
	while (n1 < n2) {
		System.out.println("Entrei no while n1 = " + n1 + " e n2 = " + n2);
		n1 ++;
		System.out.println("Adicionando 1 a n1... agora n1 vale " + n1);
		
	}
	System.out.println("\nResultado:\nn1 = " + n1 + " e n2 = " + n2);
	System.out.println(fim);
	System.out.println(separador);
	System.out.println("*****EXECUTANDO O 'DO' ANTES DE TESTAR O WHILE.*****");
	n1 = 0; // resetando n1 = 0 para repeticao do teste
	System.out.println("Primeiro Exemplo: n1 tem o valor menor do que n2.");
	System.out.println("Nesse caso o resultado será o mesmo que exemplo \nanterior.\n");
	System.out.println(inicio);
	
	/*  Primeiro:
	 *  Sera executado uma vez tudo o que estiver dentro dos colchetes do DO 
	 *  antes de testar as condições do while.
	 *  
	 *  Segundo:
	 *  Se a condição do while for verdadeira após isso
	 *  será executado o DO novamente até que ela seja falsa 
	 */
	do {
		System.out.println("Entrei no do " + "n1 = " + n1 + " e n2 = " + n2);
		n1 ++;
		System.out.println("Adicionando 1 a n1... agora n1 = " + n1);
	}while(n1 < n2); 
	System.out.println("\nResultado:\nn1 = " + n1 + " e n2 = " + n2);
	System.out.println("\nComo n1 era menor antes do teste o resultado foi o mesmo.");
	System.out.println(fim);
	System.out.println(separador);
	System.out.println("*****EXECUTANDO O 'DO' ANTES DE TESTAR O WHILE.*****");
	System.out.println("Segundo Exemplo: n1 tem o valor menor do que n2");
	System.out.println("neste caso n1 terminaria com resultado maior que n2");
	System.out.println("Vamos testar...\n");
	n1 = n2;
	System.out.println("A partir de agora " + "n1 = " + n1 + " e n2 = " + n2 + "\n");
	System.out.println(inicio);	
		do {
			System.out.println("Entrei no do " + n1 + " e n2 = " + n2);
			n1 ++;
			System.out.println("Adicionando 1...\nn1 = " + n1);
		}while(n1 < n2);
	
	System.out.println("Fim. Foi adicionado 1 a n1 antes de testar se ele \nera menor do que 2" );
	System.out.println("\nResultado:\nn1 = " + n1 + " e n2 = " + n2);
	System.out.println(fim);	
		
	
	
	 

}

}
