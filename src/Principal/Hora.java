package Principal;

public class Hora 
{
	private int hora;
	private int minuto;
	private int segundo;
	
	public Hora (int hh,int mm,int ss)
	{
		this.hora = hh;
		this.minuto = mm;
		this.segundo = ss;
	}
	
	public Hora nextSecond()
	{
		Hora siguiente = new Hora (hora,minuto,segundo+1);
		if (sumarMinuto(siguiente))
		{
			siguiente.segundo = 0;
			siguiente.minuto++;
		}

		if (sumarHora(siguiente))
		{
			siguiente.minuto = 0;
			siguiente.hora++;
		}
			
		if (reiniciarHora(siguiente))
		{
			siguiente.hora = 0;
		}

		return siguiente;
	}

	
	// se crea un método para que una vez que el contador de horas llegue a 24, se reinicie a 0 y empiece de nuevo ;
	public boolean reiniciarHora(Hora siguiente)
	{
		return siguiente.hora == 24;
	}
	
	// se crea un método para que cuando el contador de minutos llegue a 60, pase a la siguiente hora
	public boolean sumarHora(Hora siguiente)
	{
		return siguiente.minuto == 60;
	}
	
	//se crea un método para que cuando el contador de segundos llegue a 60, pase al siguiente minuto.
	public boolean sumarMinuto(Hora siguiente)
	{
		return siguiente.segundo==60;
	}
	public String toString()
	{
		return String.format("%02d",hora)+":"+String.format("%02d",minuto)+":"+String.format("%02d",segundo);
	}
}
