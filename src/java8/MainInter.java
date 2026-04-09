package java8;
interface sub{
	void displayMsg();
	int subtract(int n1, int n2);// interface control abstract method 
	int subtract
  default void display(String msg){
	  System.out.println(msg);
  }
}
class DisplayMessage implements Message{
	
	public void displayMsg() {
		System.out.println("This is main display method");
		
}

	public void displayMsg(String msg) {
		System.out.println("Message by DM class ="+msg);
		
}

public class MainInter {
	
}
   
	public static void main(String[]args) {
}
}