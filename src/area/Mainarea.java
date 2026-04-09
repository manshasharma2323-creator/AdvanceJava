package area;

interface   Area {
	double pi=3.14;
//  it is automattically public and abstract 
	void getArea();  //while doing abstraction two more thing do perform inheri and poly
    
}

/* abstract */ class Rectangle implements Area // if we are not overridding then we have to make the class abstract 
{   
	int l,b;
	Rectangle(int l, int b)
	{
		this.l=l;
		this.b=b;
		
	}
	@Override
	public void getArea() {//making the anonymous class 
		int r = l*b;
		System.out.println("The area of rectangle is : "+r);
	}
	void displayResult()
	{
		System.out.println("this is display function: ");
	}
}
public class Mainarea{
	public static void main(String []args)
	{
		Rectangle r1=new Rectangle(12,12);
		r1.getArea();
		r1.displayResult();
		Area r2=new Rectangle(12,12);
		r2.getArea();                     //the rectangle is the constructor of the subclass ;
           Area circle=new Area() {
            int r=12;
			@Override
			public void getArea() {
				// TODO Auto-generated method stub
				double result=3.34*r*r;
				System.out.println("Area of a circle : "+result);
			}
			
        	   
           };	
           circle.getArea();// also performing the upcasting;
		                                          //performing the downcasting
		                                           //java do not support downcasting
                                             //		Rectangle r1=(Rectangle) new  Area();
	}
}
	