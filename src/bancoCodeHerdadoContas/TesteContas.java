package bancoCodeHerdadoContas;

public class TesteContas {
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(123, 321);
		cc.deposita(1000.0);
		
		ContaPoupanca cp = new ContaPoupanca(456, 654);
		cp.deposita(1000.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		cc.transfere(100, cp);
		
		System.out.println();
		System.out.println("O saldo da CC é = " + cc.getSaldo());
		System.out.println();
		System.out.println("O saldo da CP é = " + cp.getSaldo());
		
		CalculaImposto calc = new CalculaImposto();
		calc.registraValor(seguro);
		calc.registraValor(cc);
		System.out.println();
		System.out.println("O valor total de imposto é = " + calc.getTotalImposto());
		
	}

}
