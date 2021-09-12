package primeiro.projeto;

public class Habilitacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome = "Roni";
		int idade = 17;
		int idadeMinima = 18;
		boolean emancipado = true;
		
		
		if (idade >= idadeMinima || emancipado == true) {
			System.out.println("Parabens!!" + nome + "\nVoce pode tirar habilitação");
		}else {
			System.out.println("Que pena!" +nome + "\nVoce nao pode tirar habitação");
			}
	
	}

}
