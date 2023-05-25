package StringClasses;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer chatHistory = new StringBuffer();
		
		String sender ="Venkat";
		String message= "Hey Sachin!";
		
		chatHistory.append(sender);
		chatHistory.append(":");
		chatHistory.append(message);
		chatHistory.append("\n");
		
		sender="Sachin";
	 message="Hey Venka";
		
		chatHistory.append(sender);
		chatHistory.append(":");
		chatHistory.append(message);
		chatHistory.append("\n");
		
		System.out.println(chatHistory);
		
		
		
		

	}

}
