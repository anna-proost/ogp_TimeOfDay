package ogp_TimeOfDay;


public class TimeOfDay {
	
	/**
	 * Representatie-invarianten:
	 * 
	 * @invar # uren is niet groter dan 23 en niet kleiner dan 0
	 * 		| 0 <= hours && hours <= 23
	 * 
	 * @invar # minuten is niet groter dan 59 en niet kleiner dan 0
	 *		| 0 <= minutes  && minutes <= 59
	 *		
	 */

	private int hours;
	private int minutes;

	
	// variabelen oproepen	
	public int getHours() {
		return this.hours;
	}
	
	public int getMinutes() {
		return this.minutes;
	}
	
	
	/**
	 * Stelt het # uren in. Laat het # minuten ongewijzigd.
	 * 
	 * @pre | 0 <= waarde && waarde <= 23
	 * 
	 * @post | getHours() == waarde
	 * @post | getMinutes() == old(getMinutes())
	 * 
	 */
	
	// variabelen aanpassen
	public void setHours(int waarde) {
		this.hours = waarde;
	}
	
	/**
	 * Stelt het # minuten in. Laat het # uren ongewijzigd.
	 * 
	 * @pre | 0 <= waarde && waarde <= 59
	 * 
	 * @post | getMinutes() == waarde
	 * @post | getHours() == old(getHours())
	 * 
	 */
	
	public void setMinutes(int waarde) {
		this.minutes = waarde;
	}
	
	// TimeOfDay initialiseren ...
	

	/**
	 * @post | getHours() == 0
	 * @post | getMinutes() == 0
	 */
	
	public TimeOfDay() {}
	
	
	/**
	 * @throws IllegalArgumentException | 0 > hours || 23 < hours
	 * @throws IllegalArgumentException | 0 > minutes || 59 < minutes
	 * @post | getHours() == hours
	 * @post | getMinutes() == minutes
	 */
	
	public TimeOfDay(int hours, int minutes) {			// klasse public dus constructor ook !
		if(0 > hours || 23 < hours) 
			throw new IllegalArgumentException("'hours' is invalid");
		
		if(0 > minutes || 59 < minutes) 
			throw new IllegalArgumentException("'minutes' is invalid"))
		
		this.minutes = minutes;
		this.hours = hours;
	}
}


