import java.util.Scanner;

class Notification {
		
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in); 
		/* Create an array of Contact that has a size of 4*/
		Contact[] contact = new Contact[4];
		Contact contact1 = new Contact();
		Contact contact2 = new Contact();
		Contact contact3 = new Contact();
		Contact contact4 = new Contact();
		Message contact1M = new Message();
		Message contact2M = new Message();
		Message contact3M = new Message();
		Message contact4M = new Message();

		/* Create a variable that will control when to end the 
		   loop (to reshow the menu if the user wants to view
		   another message) or stop it otherwise
		*/
		int numOfTry = 1;
		
		/* A variable that will hold the menu choice of the user */
		int contactNumber = 0;
		
		/* Variables that will display phone number IF the user 
		   wants to view it and a variable that will let you know
		   if the user wants to repeat or not */ 
		   String userInput = "a";
		/* Fill the Contacts in the array */
		System.out.println("Please enther your name");
		String userName = in.nextLine();
		System.out.println(fillContacts());
		/* Welcome the user */
		System.out.println("Hello <users_name_here>, welcome to iMessage!\n\n");
		
		
		/* You will create a loop: while/doWhile
		   STEPS
		   ------------------------------------------------
		   1. Show the user the menu 
		   2. Store the users menu choice
		   3. Display the Message object for the Contact choice of the user 
		   4. Ask if they would want to see the phone number, if yes, display it,
			  if no, continue to step 5.
		   5. Ask the user if they would like to view another message (see the menu again) 
		      [If yes, repeat steps 1-5, otherwise end the program]
		*/
	while (numOfTry == 1){
		System.out.println("Please select a contact [1-4]");
		System.out.println("1." + contact1.getFirstName());
		System.out.println("2." + contact2.getFirstName());
		System.out.println("3." + contact3.getFirstName());
		System.out.println("4." + contact4.getFirstName());
		contactNumber = in.nextInt();
		System.out.println(showMessageInfo(contactNumber));
		System.out.println("Would you like to view aother message? [y] Yes, [n] No");
		userInput = in.nextLine();
		if (userInput == "n"){
			numOfTry --;
			System.out.println("Thanks for using IMessage. Have a great day.");
		}
	}
		
		/* Display a message that lets the user know
		   they successfully left the iMessage application*/
		
	}//end main
	
	/* The method, showMessageInfo, returns the message of the specific Contact the user chose. */
	public static String  showMessageInfo (int contactNumber){
		Scanner in = new Scanner(System.in);
		String userInput = "a";
		Contact contact1 = new Contact();
		Contact contact2 = new Contact();
		Contact contact3 = new Contact();
		Contact contact4 = new Contact();
		Message contact1M = new Message();
		Message contact2M = new Message();
		Message contact3M = new Message();
		Message contact4M = new Message();
		if (contactNumber == 1 ){
			System.out.println("Message from:" + contact1.getFirstName());
			System.out.println(contact1M.getDay() + " " + contact1M.getTimeHou() + ":" + contact1M.getTimeMin());
			contact1M.getMessage();
			System.out.println("Would you like to view the phone number? [y] Yes, [n] No");
			userInput = in.nextLine();
			if (userInput == "y"){
				System.out.println(showPhoneNumber(contactNumber));
			}
		}
		if (contactNumber == 2 ){
			System.out.println("Message from:" + contact2.getFirstName());
			System.out.println(contact2M.getDay() + " " + contact2M.getTimeHou() + ":" + contact2M.getTimeMin());
			System.out.println(contact2M.getMessage());
			System.out.println("Would you like to view the phone number? [y] Yes, [n] No");
			if (userInput == "y"){
				System.out.println(showPhoneNumber(contactNumber));
			}
		}
		if (contactNumber == 3 ){
			System.out.println("Message from:" + contact3.getFirstName());
			System.out.println(contact3M.getDay() + " " + contact3M.getTimeHou() + ":" + contact3M.getTimeMin());
			System.out.println(contact3M.getMessage());
			System.out.println("Would you like to view the phone number? [y] Yes, [n] No");
			if (userInput == "y"){
				System.out.println(showPhoneNumber(contactNumber));
			}else{

			}
		}
		if (contactNumber == 4){
			System.out.println("Message from:" + contact4.getFirstName());
			System.out.println(contact4M.getDay() + " " + contact4M.getTimeHou() + ":" + contact4M.getTimeMin());
			System.out.println(contact4M.getMessage());
			System.out.println("Would you like to view the phone number? [y] Yes, [n] No");
			if (userInput == "y"){
				System.out.println(showPhoneNumber(contactNumber));
			}
		}
	}
	
	/* The method, showPhoneNumber, returns phone number of the specific Contact the user chose. */
	public static int showPhoneNumber(int contactNumber){
		Contact contact1 = new Contact();
		Contact contact2 = new Contact();
		Contact contact3 = new Contact();
		Contact contact4 = new Contact();
		Message contact1M = new Message();
		Message contact2M = new Message();
		Message contact3M = new Message();
		Message contact4M = new Message();
		if (contactNumber == 1 ){
			System.out.println(contact1.getNumber());
		}
		if (contactNumber == 2 ){
			System.out.println(contact2.getNumber());
		}
		if (contactNumber == 3 ){
			System.out.println(contact3.getNumber());
		}
		if (contactNumber == 4){
			System.out.println(contact4.getNumber());
		}
	}
	
	/* The method, displayMenu, displays all the contact objects in a menu format that helps the user 
	   choose easily
    */
	public static int displayMenu(int contactNumber){
		Scanner in = new Scanner(System.in);
		int Choice = in.nextInt();
			switch (Choice) {
				case 1:
				
				break;
				
				case 2:
				
				break;
				
				case 3:
				
				break;
				
				case 4:
				
				break;
		}
	}
	
	/* The method, fillContacts, will fill the Contact ARRAY in the main menu with the contact list provided to students.
	   > Two contacts should be created using the no-argument constructor
	   > Two contacts should be created using the setter methods to set the fields
	*/
	public static String fillContacts(){
		String timeOfDay = "a";
		Contact contact1 = new Contact();
		Contact contact2 = new Contact();
		Contact contact3 = new Contact();
		Contact contact4 = new Contact();
		Message contact1M = new Message();
		Message contact2M = new Message();
		Message contact3M = new Message();
		Message contact4M = new Message();
		Scanner in = new Scanner (System.in);
		System.out.println("Please enter contacts  First name");
		contact1.setFirstName(in.nextLine());
		System.out.println("Please enter contacts Last name");
		contact1.setLastName(in.nextLine());
		System.out.println("Please enter the contacts Phone number");
		contact1.setNumber(in.nextInt());
		System.out.println("Please enter the date of the message");
		System.out.println("Month:");
		contact1.setMonth(in.nextInt());
		System.out.println("Day:");
		contact1.setDay(in.nextInt());
		System.out.println("Please enter the time in hours");
		contact1.setTimeHou(in.nextInt());
		System.out.println("Please enter time in minutes");
		contact1.setTimeMin(in.nextInt());
		System.out.println("Please enter the time of day AM or PM");
		timeOfDay = in.nextLine();
		if (timeOfDay == "AM"){
			contact1.setIsAm(true);
		}else{
			contact1.setIsAm(false);
		}
		System.out.println("What does the message contain?");
		contact1.setMessage(in.nextLine());
		System.out.println("Creating new contact");
		
	}
	
}//end Notification class
