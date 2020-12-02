import java.util.Scanner;

class Notification {
		
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in); 
		Contact contact1 = new Contact("Daniel", "Mejia" ,"915-123-4567", "So, What is your favorite Disney Charecter?");
		Contact contact2 = new Contact("Ali", "Nouri", "915-891-0111", "Are you going to be eating frozen pizza again tonight?");
		Contact contact3 = new Contact();
		Contact contact4 = new Contact();
		Message contact1M = new Message("11-19","07:10", "PM" );
		Message contact2M = new Message("11-20","12:30","PM");
		Message contact3M = new Message();
		Message contact4M = new Message();
		System.out.println("Please enter contacts  First name");
		contact3.setFirstName(in.next());
		System.out.println("Please enter contacts Last name");
		contact3.setLastName(in.next());
		System.out.println("Please enter the contacts Phone number");
		contact3.setNumber(in.next());
		System.out.println("Please enter the date of the message [MM/DD]");
		contact3M.setDay(in.next());
		System.out.println("Please enter the time [XX:XX]");
		contact3M.setTime(in.next());
		System.out.println("Please enter the time of day AM or PM");
		contact3M.setIsAm(in.next());
		System.out.println("What does the message contain?");
		contact3.setMessage(in.next());
		System.out.println("Creating new contact");
		System.out.println("Please enter contacts  First name");
		contact4.setFirstName(in.next());
		System.out.println("Please enter contacts Last name");
		contact4.setLastName(in.next());
		System.out.println("Please enter the contacts Phone number");
		contact4.setNumber(in.next());
		System.out.println("Please enter the date of the message [MM/DD]");
		contact4M.setDay(in.next());
		System.out.println("Please enter the time [XX:XX]");
		contact4M.setTime(in.next());
		System.out.println("Please enter the time of day AM or PM");
		contact4M.setIsAm(in.next());
		System.out.println("What does the message contain?");
		contact4.setMessage(in.next());

		int numOfTry = 1;
		
		int contactNumber = 0;
		
		   String userInput = "a";
		System.out.println("Please enther your name");
		String userName = in.next();

		System.out.println("Hello" + userName + ", welcome to iMessage!\n\n");
		
		
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
		userInput = in.next();
		if (userInput == "n"){
			numOfTry --;
			System.out.println("Thanks for using IMessage. Have a great day.");
		}
	}

		
	}//end main
	
	/* The method, showMessageInfo, returns the message of the specific Contact the user chose. */
	public static void  showMessageInfo (int contactNumber){
		Scanner in = new Scanner(System.in);
		String s = "s";
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
			System.out.println(contact1M.getDay() + " " + contact1M.getTime());
			contact1M.getMessage();
			System.out.println("Would you like to view the phone number? [y] Yes, [n] No");
			userInput = in.next();
			if (userInput == "y"){
				System.out.println(showPhoneNumber(contactNumber));
			}
			 
		}
		if (contactNumber == 2 ){
			System.out.println("Message from:" + contact2.getFirstName());
			System.out.println(contact2M.getDay() + " "+ contact2M.getTime());
			System.out.println(contact2M.getMessage());
			System.out.println("Would you like to view the phone number? [y] Yes, [n] No");
			userInput = in.next();
			if (userInput == "y"){
				System.out.println(showPhoneNumber(contactNumber));
			}
		}
		if (contactNumber == 3 ){
			System.out.println("Message from:" + contact3.getFirstName());
			System.out.println(contact3M.getDay() + " " +contact3M.getTime());
			System.out.println(contact3M.getMessage());
			System.out.println("Would you like to view the phone number? [y] Yes, [n] No");
			userInput = in.next();
			if (userInput == "y"){
				System.out.println(showPhoneNumber(contactNumber));
			}else{

			}
		}
		if (contactNumber == 4){
			System.out.println("Message from:" + contact4.getFirstName());
			System.out.println(contact4M.getDay() + " " + contact4M.getTime());
			System.out.println(contact4M.getMessage());
			System.out.println("Would you like to view the phone number? [y] Yes, [n] No");
			userInput = in.next();
			if (userInput == "y"){
				System.out.println(showPhoneNumber(contactNumber));
			}
		}
	}
	
	/* The method, showPhoneNumber, returns phone number of the specific Contact the user chose. */
	public static String showPhoneNumber(int contactNumber){
		String s = "s";
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
			s = contact1.getNumber();
		}
		if (contactNumber == 2 ){
			System.out.println(contact2.getNumber());
			s = contact2.getNumber();
		}
		if (contactNumber == 3 ){
			System.out.println(contact3.getNumber());
			s = contact3.getNumber();
		}
		if (contactNumber == 4){
			System.out.println(contact4.getNumber());
			s = contact4.getNumber();
		}
		return s;
	}
	
	
}//end Notification class