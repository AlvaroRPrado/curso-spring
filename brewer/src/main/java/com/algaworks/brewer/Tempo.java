package com.algaworks.brewer;

import java.time.LocalDate;
import java.time.Month;

public class Tempo {

	public static void main(String[] args) {
	
LocalDate date = LocalDate.of(2019, Month.JUNE, 1);
LocalDate date2 = LocalDate.of(2019, Month.NOVEMBER, 1);
LocalDate date3 = LocalDate.of(2019, Month.FEBRUARY, 1);
System.out.println( date.toEpochDay()*24*60*60 );
System.out.println( date2.toEpochDay()*24*60*60 );
System.out.println( date3.toEpochDay()*24*60*60 );

	}

}
