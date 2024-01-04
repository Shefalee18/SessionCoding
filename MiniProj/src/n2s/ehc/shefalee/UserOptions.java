package n2s.ehc.shefalee;
import java.util.Hashtable;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.TreeMap;

import n2s.ehc.shefalee.UserExceptions.InvalidUseridException;
import n2s.ehc.shefalee.UserExceptions.UserIdNotFoundException;

public class UserOptions {
		String str;
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		boolean loopback = true;
	public void insert()throws InvalidUseridException,InputMismatchException{
	do{
	  try{loopback = true;
		System.out.println("Enter UserId:-");
		UserMain.ub.setUserID(UserMain.s.nextInt());
		if(ht.containsKey(UserMain.ub.getUserID()))
			throw new InvalidUseridException("UserId already exist.Try different one");
		System.out.println("Valid Id entered");	
		System.out.println("Enter Name:-");
		UserMain.ub.setUserName(UserMain.s.next());
		ht.put(UserMain.ub.getUserID(), UserMain.ub.getUserName());	
		System.out.println("Your Insert success !!!");
		System.out.println("Wish to Insert more (y/n):");
		str=UserMain.s.next();
			while(!str.equals("y")&&!str.equals("n")){
				System.out.println("Please choose correctly either y/n:");
				str=UserMain.s.next();}
			if(str.equals("n"))
				loopback=false;
	  	}catch(InputMismatchException e){
			e.printStackTrace();
			System.out.println("Please enter numeric input only.");
			UserMain.s.next();}
	  	 catch(InvalidUseridException e){
			e.printStackTrace();
		}
	}while(loopback);
		}
	public void update()throws UserIdNotFoundException,InputMismatchException{
	do{
	  try{loopback = true;
		System.out.println("Enter UserId:-");
		UserMain.ub.setUserID(UserMain.s.nextInt());
		if(ht.containsKey(UserMain.ub.getUserID()))
			{System.out.println("Valid Id entered");	
			System.out.println("Enter Name:-");
			UserMain.ub.setUserName(UserMain.s.next());
			ht.put(UserMain.ub.getUserID(), UserMain.ub.getUserName());}
		else
			throw new UserIdNotFoundException("User Id not available. Try different one");
		System.out.println("Your Update success !!!");
		System.out.println("Wish to Update more (y/n):");
		str=UserMain.s.next();
			while(!str.equals("y")&&!str.equals("n")){
			System.out.println("Please choose correctly either y/n:");
			str=UserMain.s.next();}
			if(str.equals("n"))
				loopback=false;
		}catch(InputMismatchException e){
			e.printStackTrace();
			System.out.println("Please enter numeric input only.");
			UserMain.s.next();}
		catch (UserIdNotFoundException e) {
			e.printStackTrace();
		}
	}while(loopback);
	}
	public void delete()throws UserIdNotFoundException,InputMismatchException{
	do{
	  try{loopback = true;
		System.out.println("Enter UserId:-");
		UserMain.ub.setUserID(UserMain.s.nextInt());
		if(ht.containsKey(UserMain.ub.getUserID()))
			{System.out.println("Valid Id entered");	
			ht.remove(UserMain.ub.getUserID());}
		else
			throw new UserIdNotFoundException("User Id not available. Try different one");
		System.out.println("Your Delete success !!!");
		System.out.println("Wish to Delete more (y/n):");
		str=UserMain.s.next();
			while(!str.equals("y")&&!str.equals("n")){
				System.out.println("Please choose correctly either y/n:");
				str=UserMain.s.next();}
			if(str.equals("n"))
				loopback=false;
		}catch(InputMismatchException e){
			e.printStackTrace();
			System.out.println("Please enter numeric input only.");
			UserMain.s.next();}
		catch (UserIdNotFoundException e) {
			e.printStackTrace();
		}
	}while(loopback);
	}
	public void view(){
		int num=0;
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(ht); 
		System.out.println("S.No "+" "+"Id "+"    "+"Name   ");
		System.out.println("-------------------------------");
		for(Map.Entry<Integer, String> me: tm.entrySet()){
			System.out.println(++num+"    "+me.getKey()+"    "+me.getValue());
		}
			System.out.println("Choose from main menu again");	
	}
	public void exit(){
			UserMain.s.close();
			System.out.println("Ending the flow. Thank you!!!");
			System.exit(0);
	}
}
