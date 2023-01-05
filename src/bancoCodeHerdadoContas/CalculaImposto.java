package bancoCodeHerdadoContas;

public class CalculaImposto {
	
	private double totalImposto;
	
	public void registraValor (Tributavel tri) {
		double valor = tri.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return this.totalImposto;
	}

}
