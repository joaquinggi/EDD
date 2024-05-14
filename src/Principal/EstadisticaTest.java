package Principal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EstadisticaTest
{

	@Test
	void testEstadistica()
	{
		fail("Not yet implemented");
	}
	
	@Test
	void testValorMedio()
	{
		Estadistica est = new Estadistica((1.0,2.0,3.0), 3);
		double resultado = est.valorMedio();
		assert.equals(resultado);
	}

	@Test
	void testDesviacionMedia()
	{
		Estadistica est = new Estadistica();
		double resultado = est.desviacionMedia();
		assert.equals();
	}

	@Test
	void testDesviacionCuadratica()
	{
		Estadistica est = new Estadistica();
		double resultado = est.desviacionCuadratica();
		assert.equals(, resultado);
	}

	@Test
	void testToString()
	{
		Estadistica est = new Estadistica();
		String cadena = est.toString();
		assert.equals(, cadena);
	}

}
