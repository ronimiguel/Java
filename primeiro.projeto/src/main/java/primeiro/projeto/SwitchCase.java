package primeiro.projeto;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcao = 1; // 1 - credito | 2 - dinheiro | 3 - Boleto
		double saldoCartao = 1400;
		double valorCompra = 1000;

		switch (opcao) {
		case 1:
			System.out.println("Opcao 1");
			if (saldoCartao >= valorCompra) {
				System.out.println("Compra Efetuada com sucesso.");
			} else {
				System.out.println("Saldo no cartao insuficiente.");
			}

			break;
		case 2:
			System.out.println("opcao 2");
			break;
		case 3:
			System.out.println("opcao 3");
			break;
		default:
			System.out.println("opcao invalida");

		}

	}

}
