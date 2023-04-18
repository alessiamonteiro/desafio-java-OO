public class Main
{
	public static void main(String[] args) {
		Conta conta = new Conta(1234, 01, 1500);
		System.out.println("saldo:"+ conta.saldo);
		conta.sacar(500);
		conta.depositar(300);
	}
}

