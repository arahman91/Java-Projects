package Math;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ShowTime {
	public static String timeFormat() {
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHmm");

		String text = date.format(formatter);
		return text;
	}
}
