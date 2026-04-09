package pali;
interface PString{
	boolean checkPalin(String info);
}

public class palidromeMain {
	public static void main(String[]args) {
		PString ps=(String info)->{
			
				return new StringBuilder(info).reverse().toString().equals(info);
				
		};
		if(ps.checkPalin("ACA"))
		{
			System.out.println("Palidrome");
		}
		else {
			System.out.println("Not palidrome");
		}
	}
	
	

}
