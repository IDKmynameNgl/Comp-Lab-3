import java.util.Scanner;

class Notification {
		
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in); 
		int i = 0;
		Contact[] contact = new Contact[4];
		Message[] message = new Message [4];
		Contact contact1 = new Contact("Daniel", "Mejia" ,"So, What is your favorite Disney Charecter?", "915-123-4567");
		Contact contact2 = new Contact("Ali", "Nouri", "Are you going to be eating frozen pizza again tonight?", "915-891-0111");
		Contact contact3 = new Contact();
		Contact contact4 = new Contact();
		Message message1 = new Message("11-19","07:10", "PM" );
		Message message2 = new Message("11-20","12:30","PM");
		Message message3 = new Message();
		Message message4 = new Message();
		contact[0] = contact1;
		contact[1] = contact2;
		contact[2] = contact3;
		contact[3] = contact4;
		message[0] = message1;
		message[1] = message2;
		message[2] = message3;
		message[3] = message4;
		fillContact(contact1, contact2,  contact3, contact4, message1, message2, message3, message4, contact, message);
		

		int numOfTry = 1;
		
		int contactNumber = 0;
		
		  String userInput = "a";
		System.out.println("Please enter your name");
		String userName = in.next();

		System.out.println("Hello " + userName + ", welcome to iMessage!\n\n");
		
		
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
		showMessageInfo(contactNumber, contact1, contact2,  contact3, contact4, message1, message2, message3, message4);
		System.out.println("Would you like to view aother message? [y] Yes, [n] No");
		userInput = in.next();
		if (userInput.equals("n")){
			numOfTry --;
			System.out.println("Thanks for using IMessage. Have a great day.");
		}
	}

		
	}//end main
	
	/* The method, showMessageInfo, returns the message of the specific Contact the user chose. */
	public static void  showMessageInfo (int contactNumber, Contact contact1, Contact contact2, Contact contact3, Contact contact4, Message message1, Message message2, Message message3, Message message4){
		Scanner in = new Scanner(System.in);
		String s = "s";
		String userInput = "a";
		if (contactNumber == 1 ){
			System.out.println("Message from:" + contact1.getFirstName());
			System.out.println(message1.getDay() + " " + message1.getTime() + " " + message1.getIsAm() );
			System.out.println(contact1.getMessage());
			System.out.println("Would you like to view the phone number? [y] Yes, [n] No");
			userInput = in.next();
			if (userInput.equals("y")){
				showPhoneNumber(contactNumber, contact1, contact2,  contact3, contact4, message1, message2, message3, message4);
			}
			 
		}
		if (contactNumber == 2 ){
			System.out.println("Message from:" + contact2.getFirstName());
			System.out.println(message2.getDay() + " "+ message2.getTime()+ " " + message2.getIsAm());
			System.out.println(contact2.getMessage());
			System.out.println("Would you like to view the phone number? [y] Yes, [n] No");
			userInput = in.next();
			if (userInput.equals("y")){
				showPhoneNumber(contactNumber, contact1, contact2,  contact3, contact4, message1, message2, message3, message4);
			}
		}
		if (contactNumber == 3 ){
			System.out.println("Message from:" + contact3.getFirstName());
			System.out.println(message3.getDay() + " " +message3.getTime()+ " " + message3.getIsAm());
			System.out.println(contact3.getMessage());
			System.out.println("Would you like to view the phone number? [y] Yes, [n] No");
			userInput = in.next();
			if (userInput.equals("y")){
				showPhoneNumber(contactNumber, contact1, contact2,  contact3, contact4, message1, message2, message3, message4);
			}else{

			}
		}
		if (contactNumber == 4){
			System.out.println("Message from:" + contact4.getFirstName());
			System.out.println(message4.getDay() + " " + message4.getTime()+ " " + message4.getIsAm());
			System.out.println(contact4.getMessage());
			System.out.println("Would you like to view the phone number? [y] Yes, [n] No");
			userInput = in.next();
			if (userInput.equals("y")){
				showPhoneNumber(contactNumber, contact1, contact2,  contact3, contact4, message1, message2, message3, message4);
			}
		}
	}
	
	/* The method, showPhoneNumber, returns phone number of the specific Contact the user chose. */
	public static String showPhoneNumber(int contactNumber, Contact contact1, Contact contact2, Contact contact3, Contact contact4, Message message1, Message message2, Message message3, Message message4){
		String s = "s";
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
	
	public static void fillContact (Contact contact1, Contact contact2, Contact contact3, Contact contact4, Message message1, Message message2, Message message3, Message message4, Contact[] contact, Message[] message){
		Scanner in = new Scanner (System.in);
		int i = 0;
		for (i = 2; i > contact.length; i++){
		System.out.println("Creating new contact...");
		System.out.println("Please enter contacts  First name");
		contact[i].setFirstName(in.next());
		System.out.println("Please enter contacts Last name");
		contact[i].setLastName(in.next());
		System.out.println("Please enter the contacts Phone number");
		contact[i].setNumber(in.next());
		for (i = 2; i > message.length; i++){
		System.out.println("Please enter the date of the message [MM/DD]");
		message[i].setDay(in.next());
		System.out.println("Please enter the time [XX:XX]");
		message[i].setTime(in.next());
		System.out.println("Please enter the time of day AM or PM");
		message[i].setIsAm(in.next());
		System.out.println("What does the message contain?");
		contact[i].setMessage(in.nextLine());
		}
		}
	}
	
	
}//end Notification class