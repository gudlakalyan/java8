package DateTimeApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Iterator;
import java.util.Locale;

public class DateTimeA {
	public static void main(String[] args) {
		LocalDate dt = LocalDate.now();
		System.out.println(dt);
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		Iterator itr = ZoneId.getAvailableZoneIds().iterator();
		ZoneId zn = ZoneId.of("Indian/Cocos");
		System.out.println(zn.getDisplayName(TextStyle.FULL_STANDALONE, Locale.ENGLISH));
		
		while (itr.hasNext()) {
//			System.out.println(itr.next());

		}
		/*
		 * for (String str : ZoneId.getAvailableZoneIds()) { System.out.println(str); }
		 */
		/* Stream(). */
	}
}
