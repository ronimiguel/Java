package primeiro.projeto;

public class ExecutaMetodo {

	public static void main(String[] args) {
		
		MetodoVazio metodo = new MetodoVazio(); // string
		metodo.mensagem();
		
		MetodoVazio contando = new MetodoVazio(); // usando while
		contando.contandoComWhile();
		
		MetodoVazio num = new MetodoVazio(); // usando for
		num.contandoComFor();
		
		MetodoVazio quanto = new MetodoVazio(); // usando switch case
		quanto.casos();
		
		Bissexto anoBissexto = new Bissexto(); // ano bissexto
		anoBissexto.Ano();
	}

}
