package lin;
import java.util.Scanner;

public class linearseach {

	public static void main(String[] args) {
		int arr[]= {5,6,6,3,2,9};
		Scanner sc=new Scanner(System.in);
		System.out.print("eneter the number that u want to search:");
		int index=sc.nextInt(); int res=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==index) {
				System.out.println(index+" found");
				res=1;
				break;
			}
		}
		if(res==-1) {
			System.out.println(index+"not found");
		}
		// TODO Auto-generated method stub

	}

}
