package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.*;

public class TesteSaca {

	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente(222,333);
		
		conta.deposita(200.0);
		conta.saca(210.0);
		
		System.out.println(conta.getSaldo());

	}

}
