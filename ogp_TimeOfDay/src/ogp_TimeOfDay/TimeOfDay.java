package ogp_TimeOfDay;


public class TimeOfDay {
	
	/**
	 * Representatie-invarianten:
	 * 
	 * @invar tot # minuten is niet kleiner dan 0 en niet groter dan 1439
	 * 		| 0 <= midnight_minutes && midnight_minutes <= 1439
	 * 
	 */

	private int midnight_minutes;

	
	// variabelen oproepen	
	public int getHours() {
		int hours = this.midnight_minutes / 60;  //integer !
		return hours;
	}
	
	public int getMinutes() {
		int minutes = this.midnight_minutes % 60;  //integer !
		return minutes;
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
		 int tot_minutes = waarde * 60 + (this.midnight_minutes % 60);	
		 this.midnight_minutes = tot_minutes;
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
		int tot_minutes = waarde + ((this.midnight_minutes / 60) * 60);
		this.midnight_minutes = tot_minutes;	
	}
	
	// TimeOfDay initialiseren ...
	

	/**
	 * @post | getHours() == 0
	 * @post | getMinutes() == 0
	 */
	
	public TimeOfDay() {
		this.midnight_minutes = 0;
	}
	
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
			throw new IllegalArgumentException("'minutes' is invalid");
		
		int tot_minutes = minutes + 60 * hours; 

		this.midnight_minutes = tot_minutes;
	}
}


