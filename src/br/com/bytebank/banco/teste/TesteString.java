package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteString {

	public static void main(String[] args) {
		
//		String nome = "Mario";
//		
//		nome.replace('o', 'a');
//		
//		System.out.println(nome);

//		String nome = "ALURA";
//		CharSequence cs = new StringBuilder("al");
//
//		nome = nome.replace("AL", cs);
//
//		System.out.println(nome);
		
		Object cc = new ContaPoupanca(11, 22);
		
		System.out.println(cc);
		
	}

}
