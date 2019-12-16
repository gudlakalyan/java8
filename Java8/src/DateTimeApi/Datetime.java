package DateTimeApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Datetime {
	static int i = 0;

	public static void main(String[] args) {
		/*
		 * LocalDate ld = LocalDate.now(); System.out.println(ld); LocalDateTime ld1 =
		 * LocalDateTime.now(); System.out.println(ld1); Zone zn = ZoneId.of("Asia");
		 */
		int n3 = m1(0, 1, i);

	}

	public static int m1(int m1, int m2, int count) {
System.out.println(m1+"m1 <<< |  m2 >>>"+m2);
		int n3 = m1 + m2;
		System.out.println(n3);
		m1 = m2;
		m2 = n3;

		if (count <= 10) {
			m1(m1, m2, ++i);
		}
		return n3;

	}
}
