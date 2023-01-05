package bancoCodeHerdadoContas;

public class ContaCorrente extends Contas implements Tributavel{
	//Construtor desta classe.
	public ContaCorrente(int agencia, int numero) {
	//construtor específico da classe mãe (Contas).
		super(agencia, numero);
		
	}

// Com a sobrescrita (Override), conseguimos especializar os métodos herdados das superclasses,
// alterando o seu comportamento nas subclasses por um mais específico.

	@Override
	public void deposita (double valor) {
		super.saldo += valor;
	}
		
	@Override
	public boolean saca(double valor) {
		return super.saca(valor + 0.2);
		
	}

	@Override
	public double getValorImposto() {
		
		return super.saldo * 0.01;
	}

}

