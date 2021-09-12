package primeiro.projeto;

public class ForString {
public static void main(String[] args) {
	String texto = "Uma frase qualquer";
	System.out.println(texto + " tem " + texto.length() + " caracteres");
	System.out.println("Index 2 "+texto.charAt(2));
	System.out.println("Ela contem ras "+texto.contains("ras"));
	System.out.println("caixa alta "+ texto.toUpperCase());
	System.out.println("caixa baixa "+texto.toLowerCase());
	System.out.println("Substituir a por o "+ texto.replace("a", "o"));
	
	System.out.println("Imprimindo letra por letra usando for");
		for (int i = 0 ; i < texto.length() ;i++) {
			System.out.println( i+ " " + texto.charAt(i));
		}
	
	
}
}
