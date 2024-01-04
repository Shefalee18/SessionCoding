package n2s.ehc.shefalee;

public class UserExceptions extends Exception{
		public UserExceptions(String s){
		super(s);
	}
	public static class InvalidUseridException extends Exception{
		public InvalidUseridException(String msg){
		super(msg);
		}
	}
	public static class UserIdNotFoundException extends Exception{
		public UserIdNotFoundException(String msg){
		super(msg);
		}
	}
	public static class InvalidEntryException extends Exception{
		public InvalidEntryException(String msg){
			super(msg);
	}
}
}
