package br.com.endreus.A3GQS.model;

public class Carro {

	private String fabricante;
	private String modelo;
	private int ano;
	private boolean motorLigado;
	private int velocidade;

	// Método construtor simples
	public Carro() {
		super();
	}

	// Método construtor completo
	public Carro(String fabricante, String modelo, int ano, boolean motorLigado, int velocidade) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.motorLigado = motorLigado;
		this.velocidade = velocidade;
	}

	// Método construtor persoanlizado
	public Carro(String fabricante, String modelo, int ano) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.motorLigado = false;
		this.velocidade = 0;
	}

	public void detalhes() {
		System.out.println("Detalhes do carro:");
		System.out.println("Fabricante: " + this.fabricante);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ano: " + this.ano + "\n");
	}

	public String situacaoMotor() {
		if (this.motorLigado) {
			return this.modelo + " --> Motor LIGADO.";
		} else {
			return this.modelo + " --> Motor DESLIGADO.";
		}
	}

	public String ligarMotor() {
		if (this.motorLigado) {
			return "O motor do " + this.modelo + " já estava ligado.";
		} else {
			this.motorLigado = true; // ligando o motor
			return "O motor do " + this.modelo + " foi ligado agora.";
		}
	}

	public String desligarMotor() {
		if (!this.motorLigado) {
			return "O motor do " + this.modelo + " já estava desligado.";
		} else {
			if (this.velocidade != 0) {
				return "ATENÇÃO: O motor do " + this.modelo + " não foi desligado pois o carro está em movimento.";
			} else {
				this.motorLigado = false; // desligando o motor
				return "O motor do " + this.modelo + " foi desligado agora.";
			}
		}
	}

	public String acelerar(int valor) {
		if (this.motorLigado) {
			this.velocidade += valor; // this.velocidade = this.velocidade + valor;
			return this.modelo + " --> ACELEROU!!! Velocidade atual: " + this.velocidade + " Km/h.";
		} else {
			return this.modelo + " --> ATENÇÃO: Não é possível acelerar com o motor desligado!";
		}
	}

	public String frear(int valor) {
		if (!this.motorLigado) {
			return this.modelo + " --> ATENÇÃO: O motor está desligado! O carro já está parado!";
		} else { // daqui em diante -> MOTOR LIGADO
			if (this.velocidade == 0) {
				return this.modelo + " --> ATENÇÃO: O carro já está parado!";
			} else {// daqui em diante -> MOTOR LIGADO e VELOCIDADE != 0
				if (this.velocidade - valor <= 0) {
					this.velocidade = 0; // Parando o carro (sem deixar virar velocidade negativa)
					return this.modelo + " --> FREOU!!! O carro está PARADO!";
				} else { // daqui em diante -> MOTOR LIGADO e Velocidade != 0 e FREA mas AINDA EM
							// MOVIMENTO
					this.velocidade -= valor; // this.velocidade = this.velocidade - valor;
					return this.modelo + " --> FREOU!!! Velocidade atual: " + this.velocidade + " km/h.";
				}
			}
		}
	}

	// Métodos getters e setters
	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean isMotorLigado() {
		return motorLigado;
	}

	public void setMotorLigado(boolean motorLigado) {
		this.motorLigado = motorLigado;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

}