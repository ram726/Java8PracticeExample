package org.ram.java8Features.dateAndTime.zoneIdClass;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class CheckZoneId 
{
	public static void main(String[] args) {
		
		//local zone id
		ZoneId id=ZoneId.systemDefault();
		System.out.println(id);
		ZonedDateTime zdt=ZonedDateTime.now();
		System.out.println(zdt);
		
		//america/ LA id
		ZoneId la=ZoneId.of("America/Los_Angeles");
		System.out.println(la);
		ZonedDateTime zdt1=ZonedDateTime.now(la);
		System.out.println(zdt1);
	}
}
