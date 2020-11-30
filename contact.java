public class Contact {
	/* List your fields here [NOTE: They should all be private] */
	private String firstName;
	private String lastName;
	private String message;
	private int number;
	/* Create a no-argument constructor
	and sets the field values to empty values. */
	
	public Contact(){
		
	}
	
	/* Create a constructor that takes the following as parameters:
	   @firstName the first name of the contact
	   @lastName the last name of the contact 
	   @phoneNumber the phone number of the contact 
	   @message the message object for that contact
	*/
	public Contact(String firstNameIn ,String lastNameIn ,String messageIn ,int numberIn){
		this.firstName = firstNameIn;
		this.lastName = lastNameIn;
		this.message = messageIn;
		this.number = numberIn;
	}
	
	
	/* Setter Methods for each field */
	public void setFirstName (String firstNameIn){
		this.firstName=firstNameIn;
	}
	public void setLastName (String lastNameIn){
		this.lastName= lastNameIn;
	}
	public void setMessage (String messageIn){
		this.message = messageIn;
	}
	public void setNumber (int numberIn){
		this.number=numberIn;
	}
	
	
	
	
	/* Getter methods for each field */
	public String getFirstName(){
		return this.firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public String getMessage(){
		return this.message;
	}
	public int getNumber(){
		return this.number;
	}
	
	/* If we try to print out a contact object, it would give us the allocation
	   of where that object is located in memory. This method lets us change that.
	   Instead of printing the allocation, we can now get the object be printed
	   in the following format:
	   ------------------------------------
	   FirstName LastName
	*/
	public String toString() {
		return "" + this.firstName + " " + this.lastName;
	}
}