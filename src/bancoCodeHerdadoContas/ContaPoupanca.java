package bancoCodeHerdadoContas;

public class ContaPoupanca extends Contas {
	//Construtor desta classe.
	public ContaPoupanca(int agencia, int numero) {
	//Construtor específico da classe mãe(Contas).
		super(agencia, numero);
		
	}

	@Override
	public void deposita (double valor) {
		super.saldo += valor;
	}
}
