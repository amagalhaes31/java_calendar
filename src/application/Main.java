/**
 * Data: 18/05/2020
 */
package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author alexandre
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		//Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		Date d = new Date(System.currentTimeMillis());		// Pega o valor da data e hora atual
		
		// Imprime o valor da variável "d"
		System.out.println(sdf.format(d));
		
		// Cria a variável "cal" do tipo Calendar
		Calendar cal = Calendar.getInstance();
		
		// Passa o valor de "d" para "cal"
		cal.setTime(d);
		
		// Adiciona "4" horas
		cal.add(Calendar.HOUR_OF_DAY, 4);
		
		// Pega o valor atualizado
		d = cal.getTime();
		
		// Imprime o valor da variável "d" atualizado
		System.out.println(sdf.format(d));
		
	}

}
