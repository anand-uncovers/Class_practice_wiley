package lambda;

public interface Child extends Parent{

	public void sayHello();
	default void sayHI() {
		
	}
	//Methods of object class
	String toString();
	int hashCode();
	boolean equals(Object obj);
	
}
