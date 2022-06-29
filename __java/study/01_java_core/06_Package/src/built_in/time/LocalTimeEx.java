package built_in.time;

import java.time.LocalTime;

public class LocalTimeEx {

	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		System.out.println(now.toNanoOfDay());
		System.out.println(now.toSecondOfDay());
		System.out.println(now.toString());
		System.out.println(now.MAX);
		System.out.println(now.MIN);
		System.out.println(now.MIDNIGHT);
		System.out.println(now.NOON);
		System.out.println(now.plusHours(1L));
		System.out.println(now.plusMinutes(10L));
		System.out.println(now.plusSeconds(100L));
		System.out.println(now.plusNanos(100000L));
		System.out.println(now.minusHours(2L));
		System.out.println(now.minusMinutes(12L));
		System.out.println(now.minusSeconds(200L));
		System.out.println(now.minusNanos(300000L));
		
	}

}
