class Message {
	/* List your fields here [NOTE: They should all be private] */
	private int month;
	private int day;
	private int timeMin;
	private int timeHou;
	private boolean isAm;
	private String message;
	/* Create a no-argument constructor 
	and sets the field values to empty values. */
	//Write the constructor here
	public Message(){
		
	}
	
	/* Create a constructor that takes the following as parameters:
	   @month a number representing the month
	   @day a number representing the day
	   @time the time the message was received with the following format: <HH:MM>
	   @timeOfDay if the message was received in AM or PM
	   @text a value that holds the text message of the contact
	*/
	//Write the constructor with parameters here
	public Message(int monthIn, int dayIn, int timeMinIn, int timeHouIn, boolean isAmIn, String messageIn){
		this.month = monthIn;
		this.day = dayIn;
		this.timeMin = timeMinIn;
		this.timeHou = timeHouIn;
		this.isAm = isAmIn;
		this.message = messageIn;
		
	}
	
	
	/* Setter Methods for each field */
	public void setMonth (int monthIn){
		this.month=monthIn;
	}
	public void setDay (int dayIn){
		this.day=dayIn;
	}
	public void setTimeMin (int timeMinIn){
		this.timeMin=timeMinIn;
	}
	public void setTimeHou (int timeHouIn){
		this.timeHou=timeHouIn;
	}
	public void setIsAm (boolean isAmIn){
		this.isAm=isAmIn;
	}
	public void setMessage (String messageIn){
		this.message=messageIn;
	}
	
	/* Getter methods for each field */
	public int getMonth(){
		return this.month;
	}
	public int getDay(){
		return this.day;
	}
	public int getTimeMin(){
		return this.timeMin;
	}
	public int getTimeHou(){
		return this.timeHou;
	}
	public boolean getIsAm(){
		return this.isAm;
	}
	public String getMessage(){
		return this.message;
	}
	
	/* If we try to print out a contact object, it would give us the allocation
	   of where that object is located in memory. This method lets us change that.
	   Instead of printing the allocation, we can now get the object to print the
	   object it in the following format:
	   ------------------------------------------------
	   MM/DD TIME <AM/PM>
	   Text Message 
	   ------------------------------------------------
	   How would you make your object print in that format?
	   [NOTE: For help, look at the toString() method in your Contact object class]
	*/
	//Write the method here. 
	public String toString() {
	return "" + this.month + "/" + this.day + " " + this.timeMin + ":" + this.timeHou + " " + this.isAm + "\n" + this.message;
	}
	
	
}