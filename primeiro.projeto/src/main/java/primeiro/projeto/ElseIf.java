package primeiro.projeto;

public class ElseIf {
	
	public static void main(String[] args) {
		
		boolean dinheiro = false;
		boolean cartao = false;
		boolean boleto = true;
		double preco = 10000.00;

		
// usando else if
		
		if(dinheiro) {
			double desconto = preco * 0.15;
			System.out.println("Valor da compra R$ " + preco);
			preco -= desconto;
			System.out.println("Desconto de R$"+ desconto +" (15%) para pagamento em dinheiro");
			System.out.println("Valor total com desconto: R$ " + preco);
		}else if (cartao) {
			double juros = preco * 0.10;
			System.out.println("Valor da compra R$ " + preco);
			preco += juros;
			System.out.println("Juros de R$"+ juros +" (10%) para pagamento em cartao");
			System.out.println("Valor total com juros: R$ " + preco);
		}else if (boleto) {
			double taxa = preco * 0.20;
			System.out.println("Valor da compra R$ " + preco);
			preco += taxa;
			System.out.println("Taxa de R$"+ taxa +" (20%) para pagamento via boleto");
			System.out.println("Valor total com a taxa: R$ " + preco);
		}
		
		
	}

}
