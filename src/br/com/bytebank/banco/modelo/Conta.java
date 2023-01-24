package br.com.bytebank.banco.modelo;

/**
 * Classe que representa a moldura de uma conta.
 * 
 * @author Evelyn Natashy
 *
 */

public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	/**
	 * Construtor para inicializar o objeto Conta a partir da agência e do número.
	 * 
	 * @param agencia
	 * @param numero
	 */
	
	public Conta(int agencia, int numero) {
		total ++;
		
		if(agencia < 1) {
            throw new IllegalArgumentException("Agência inválida");
        }

        if(numero < 1) {
            throw new IllegalArgumentException("Número da conta inválido");
        }
		
		this.agencia = agencia;
		this.numero = numero;
		}
	
	public abstract void deposita(double valor);
	
	
	/**
	 * O valor precisa ser maior do que o saldo.
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SacaException("Valor inválido: Saldo: " + this.saldo + ", Valor: " + valor);
		}
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return total;
	}
	
	@Override
	public String toString() {
		return " Numero: " + this.numero + ", Agencia: " + this.agencia;
	}
}
