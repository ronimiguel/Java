package primeiro.projeto;

public class AprendendoIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idadePermitida = 18;
		int minhaIdade = 27;
		
		System.out.println("Esse programa calcula se voce pode tirar cnh de acordo com a sua idade");
		System.out.println("idade = " + minhaIdade);
		
		if (minhaIdade >= idadePermitida) {
			System.out.println("Parabens... Voce j� Pode tirar CNH, sua idade � " + minhaIdade +" anos");
		}else { 
			System.out.println("Que pena. Voce n�o pode tirar CNH, sua idade � " + minhaIdade + " anos");
		}
	}

}
