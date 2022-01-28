package Java8;

import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;

public class LocalDate_ex {

	public static void main(String[] args) {
		LocalDate localDate= LocalDate.now(); //thread safe
		System.out.println(localDate);
		
		/* type of  
		 * date printing using different types of methods 
		 */
		
		Clock clock =Clock.systemDefaultZone();
		LocalDate localDate1= LocalDate.now(clock); //thread safe
		System.out.println(localDate1);
		/* this will print the 
		 * system default zone by taking systemDefaultZone() method 
		 */
		
		ZoneId zoneId= ZoneId.of("Europe/Paris");
		LocalDate localDate2= LocalDate.now(zoneId); //thread safe
		System.out.println(localDate2);
		/* this will print the
		 * using zoneId we can print other countries date 
		 */
		
		System.out.println("------------------------------------------");
		LocalDate localDate3 = LocalDate.of(2017, 03, 02);
		System.out.println(localDate3);
		
		
		LocalDate localDate4 = LocalDate.parse("2017-03-05");
		
		System.out.println(localDate4);
		
		LocalDate localDate5 = localDate4.plusDays(2);
		System.out.println(localDate5);
		
		Object chronoUnit;
		//LocalDate minus = localDate4.minus(2, chronoUnit.DAYS);
		//System.out.println(minus);
		
		
		
	

	}

}
