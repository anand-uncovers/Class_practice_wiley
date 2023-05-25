package StringClasses;

public class StringBuilderClass {

	public static void main(String[] args) {
	//	StringBuilder sb = new StringBuilder("Wiley");
	//	sb.append(" Edge");

		//"[timestamp] user userID: logged in successfully"
		
		StringBuilder logMessage = new StringBuilder();
		
		long timeStamp= System.currentTimeMillis();
		
		logMessage
		.append("[")
		.append(timeStamp)
		.append("]");
		int userID=123456;
		
		logMessage
		.append("User ")
		.append(userID)
		.append(": ");
		
		String message="Login Successfully";
		logMessage.append(message);
		System.out.println(logMessage);
		
		
		
	}

}
