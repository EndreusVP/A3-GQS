package br.com.endreus.A3GQS.controller;

import br.com.endreus.A3GQS.model.Carro;

public class Cadastro {

	public static void main(String[] args) {
		Carro uno = new Carro();
		uno.setFabricante("Fiat");
		uno.setModelo("Uno Mille");
		uno.setAno(2015);
		uno.setMotorLigado(false);
		uno.setVelocidade(0);
		
		Carro gol = new Carro("VW", "Gol Turbo", 2020, true, 70);
		
		Carro ka = new Carro("Ford", "Ka Sedan", 2019);
		
		System.out.println("\nFabricante: " + uno.getFabricante());
		System.out.println("Modelo: " + uno.getModelo());
		
		System.out.println("\nFabricante: " + gol.getFabricante());
		System.out.println("Modelo: " + gol.getModelo());
		
		System.out.println("\nFabricante: " + ka.getFabricante());
		System.out.println("Modelo: " + ka.getModelo());
		System.out.println("Motor Ligado: " + ka.isMotorLigado());
		System.out.println("Velocidade: " + ka.getVelocidade() + "\n" );
		
		uno.detalhes();
		gol.detalhes();
		ka.detalhes();
		
		
		String texto;
		texto = uno.situacaoMotor();
		System.out.println(texto);
		
		System.out.println(gol.situacaoMotor());
		System.out.println(ka.situacaoMotor());
		
		System.out.println(uno.ligarMotor());
		System.out.println(uno.situacaoMotor());
		
		//Neste momento: Uno LIGADO PARADO. gol LIGADO a 70km/h. ka está DESLIGADO
		System.out.println(uno.desligarMotor());
		System.out.println(gol.desligarMotor());
		System.out.println(ka.desligarMotor());
		
		//Neste momento: Uno DESLIGADO. gol LIGADO a 70km/h. ka DESLIGADO
		System.out.println(uno.acelerar(50));
		System.out.println(gol.acelerar(30));
		System.out.println(ka.acelerar(40));
		
		//Neste momento: Uno DESLIGADO. gol LIGADO a 100km/h. ka DESLIGADO
		System.out.println(uno.frear(30));
		System.out.println(uno.ligarMotor()); //uno LIGADO e PARADO
		System.out.println(uno.frear(30));
		System.out.println(uno.acelerar(80)); //uno LIGADO a 80km/h
		System.out.println(uno.frear(30)); //uno LIGADO a 50 km/h
		System.out.println(uno.frear(70)); //uno LIGADO e PARADO
		System.out.println(uno.desligarMotor()); //uno DESLIGADO
	

	}

}

