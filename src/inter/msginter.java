package inter;



interface Message{
	void displayMsg();
  default void display(String msg){
	  System.out.println(msg);
  }
}
class DisplayMessage implements Message{
	
	public void msginter() {
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