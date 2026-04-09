package 6encp;

public class Mainencap {
	private int quantity;
	public Mainencap(int pid, String productName ,double price , int quantity) {
		super();
		this.pid=pid;
		this.productName=productName;
		this.price=price;
		this.quantity=quantity;
	}
	public class Mainenca{
		public static void main(String[]args) {
			ArrayList<Mainencap>list=new ArrayList<Mainencap>();
			list.add(new Mainencap(2,"Mobile",40000,30));
		}
		
		
	}

}
