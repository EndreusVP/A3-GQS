package br.com.endreus.A3GQS;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.endreus.A3GQS.model.Carro;

public class CarroTest {
	Carro carro1;
	Carro carro2;
	Carro carro3;

	String modelo1 = "Xino";
	String modelo2 = "Atlec";
	String modelo3 = "Orevas";

	@Before
	public void objetosCarro() {
		carro1 = new Carro("volks", modelo1, 2012);
		carro2 = new Carro("chev", modelo2, 2026, true, 0);
		carro3 = new Carro("toyot", modelo3, 2023, true, 60);

		System.out.println(carro1.situacaoMotor());
		System.out.println(carro2.situacaoMotor());
		System.out.println(carro3.situacaoMotor());
	}

	@Test
	public void testLigarMotor() {
		Assert.assertEquals(modelo1 + " --> Motor DESLIGADO.", carro1.situacaoMotor());
		Assert.assertEquals(modelo2 + " --> Motor LIGADO.", carro2.situacaoMotor());
		Assert.assertEquals(modelo3 + " --> Motor LIGADO.", carro3.situacaoMotor());
	}

	@Test
	public void testDesligarMotor() {
		Assert.assertEquals("O motor do " + modelo1 + " já estava desligado.", carro1.desligarMotor());
		Assert.assertEquals("O motor do " + modelo2 + " foi desligado agora.", carro2.desligarMotor());
		Assert.assertEquals("ATENÇÃO: O motor do " + modelo3 + " não foi desligado pois o carro está em movimento.",
				carro3.desligarMotor());
	}

	@Test
	public void testAcelerar() {
		Assert.assertEquals(modelo1 + " --> ATENÇÃO: Não é possível acelerar com o motor desligado!",
				carro1.acelerar(30));
		Assert.assertEquals(carro2.acelerar(30),
				modelo2 + " --> ACELEROU!!! Velocidade atual: " + carro2.getVelocidade() + " Km/h.");
		Assert.assertEquals(carro3.acelerar(30),
				modelo3 + " --> ACELEROU!!! Velocidade atual: " + carro3.getVelocidade() + " Km/h.");
	}

	@Test
	public void frear() {
		String modelo4 = "Alloroc";
		Carro carro4 = new Carro("Toyot", modelo4, 2003, true, 30);

		System.out.println(carro4.situacaoMotor());

		Assert.assertEquals(carro1.frear(40),
				modelo1 + " --> ATENÇÃO: O motor está desligado! O carro já está parado!");
		Assert.assertEquals(carro2.frear(40), modelo2 + " --> ATENÇÃO: O carro já está parado!");
		Assert.assertEquals(carro3.frear(40),
				modelo3 + " --> FREOU!!! Velocidade atual: " + carro3.getVelocidade() + " km/h.");
		Assert.assertEquals(carro4.frear(40), modelo4 + " --> FREOU!!! O carro está PARADO!");
	}
}
