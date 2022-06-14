package calculadoraTeste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class calcTeste {
	private calc calculadora;
	@BeforeEach
		void setup() {
		calculadora = new calc();
	}
	@Test
	void testDoisMaisDois () {
		System.out.println ( "•• TESTE 1 EXECUTADO ••" );
		assertEquals ( 4 , calculadora.soma ( 2 , 2 ));
	}
	@Test
	void testDoisMenosQuatro () {
		System.out.println ( "•• TESTE 2 EXECUTADO ••" );
		assertEquals ( -2 , calculadora.sub ( 2 , 4 ));
	}
	@Test
	void testDoisDivZero () {
		System.out.println ( "•• TESTE 3 EXECUTADO ••" );
		Assertions.assertEquals (Double.POSITIVE_INFINITY , calculadora.div ( 2 , 0 )); 
	}
	@Test
	void testDozeMultTres () {
		System.out.println ( "•• TESTE 4 EXECUTADO ••" );
		Assertions.assertEquals ( 36 , calculadora.mult ( 12 , 3 )); 
	}
	@Test
	void testNQuinzeMaisNDez () {
		System.out.println ( "•• TESTE 5 EXECUTADO ••" );
		assertEquals ( -25 , calculadora.soma ( -15 , -10 ));
	}
	@Test
	void testNSeisMenosNDoze () {
		System.out.println ( "•• TESTE 6 EXECUTADO ••" );
		assertEquals ( 6 , calculadora.sub ( -6 , -12 ));
	}
	@Test
	void testSeisDivNDois () {
		System.out.println ( "•• TESTE 7 EXECUTADO ••" );
		Assertions.assertEquals ( -3 , calculadora.div ( 6 , -2 )); 
	}
	@Test
	void testVinQuaMultNMeno () {
		System.out.println ( "•• TESTE 8 EXECUTADO ••" );
		Assertions.assertEquals ( -1656 , calculadora.mult ( 24 , -69 )); 
	}
	@Test
	void testZeroMaisNQuatro () {
		System.out.println ( "•• TESTE 9 EXECUTADO ••" );
		assertEquals ( -4 , calculadora.soma ( 0 , -4 ));
	}
	@Test
	void testMenoMenosNCentincinco () {
		System.out.println ( "•• TESTE 10 EXECUTADO ••" );
		assertEquals ( 194 , calculadora.sub ( 69 , -125 ));
	}
	@Test
	void testZeroDivZero () {
		System.out.println ( "•• TESTE 11 EXECUTADO ••" );
		Assertions.assertEquals (Double.NaN , calculadora.div ( 0 , 0 )); 
	}
	@Test
	void testNSeteMultNOito () {
		System.out.println ( "•• TESTE 12 EXECUTADO ••" );
		Assertions.assertEquals ( 56 , calculadora.mult ( -7 , -8 )); 
	}
	@Test
	void testVinteMaisNSete () {
		System.out.println ( "•• TESTE 13 EXECUTADO ••" );
		assertEquals ( 13 , calculadora.soma ( 20 , -7 ));
	}
	@Test
	void testZeroMenosCinquenta () {
		System.out.println ( "•• TESTE 14 EXECUTADO ••" );
		assertEquals ( -50 , calculadora.sub ( 0 , 50 ));
	}
	@Test
	void testZeroMultTrintSete () {
		System.out.println ( "•• TESTE 15 EXECUTADO ••" );
		Assertions.assertEquals ( 0 , calculadora.mult ( 0 , 37 )); 
	}
	@Test
	void testMQuatroDivCinco () {
		System.out.println ( "•• TESTE 16 EXECUTADO ••" );
		Assertions.assertEquals (-0.8 , calculadora.div ( -4 , 5 )); 
	}
	@Test
	@AfterEach
		void tearThis () {
		System.out.println ( "@AfterEach executado" );
	}
}