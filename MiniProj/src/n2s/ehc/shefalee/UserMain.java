package n2s.ehc.shefalee;
import java.util.InputMismatchException;
import java.util.Scanner;

import n2s.ehc.shefalee.UserExceptions.InvalidEntryException;
import n2s.ehc.shefalee.UserExceptions.InvalidUseridException;
import n2s.ehc.shefalee.UserExceptions.UserIdNotFoundException;

public class UserMain {
	  public static Scanner s = new Scanner(System.in);
		public static UserBean ub=new UserBean();
		public static void main(String[] args) throws InvalidEntryException {
		  	UserOptions uo= new UserOptions();
		 do{
		 try{
		  	System.out.println("Choose the option below");
			System.out.println("*****************************");
			System.out.println("1 - Insert");
			System.out.println("2 - Update");
			System.out.println("3 - Delete");
			System.out.println("4 - View");
			System.out.println("5 - Exit");
			System.out.println("Enter your option below:");
			ub.setInput(s.nextInt());
			if(!((ub.getInput()>=1)&&(ub.getInput()<=5)))
			 		throw new InvalidEntryException("Invalid Option Selected");
			 	else
			 		System.out.println("Valid option selected");
		 
		switch (ub.getInput()){
		case 1: 
				uo.insert();
			break;
		case 2:
				uo.update();
			break;
		case 3:
				uo.delete(); 
			break;
		case 4:
				uo.view();
			break;
		case 5:
				uo.exit();
			break;
		}
	 }catch(InputMismatchException e){
				e.printStackTrace();
				System.out.println("Please enter numeric input only.");
				s.next();
			}
	  catch(Exception e){
				e.printStackTrace();
				s.next();
			}
	}while(true);
}
}


