package ogp_TimeOfDay;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ogp_TimeOfDay.TimeOfDay;

class TimeOfDayTest {

	@Test
	void test() {
		TimeOfDay mijnTijd = new TimeOfDay();		// velden initieel allemaal waarde 0
		assertEquals(0, mijnTijd.getHours());
		assertEquals(0, mijnTijd.getMinutes());
		
		mijnTijd.setHours(2);
		assertEquals(2, mijnTijd.getHours());
		
		mijnTijd.setMinutes(37);
		assertEquals(37, mijnTijd.getMinutes());
		
	}

}
