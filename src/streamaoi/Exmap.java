package streamaoi;
import java.util.*;
import java.util.stream.*;

public class Exmap {
	

	public class Main {
	    public static void main(String[] args) {
	        ArrayList<String> list = new ArrayList<>(Arrays.asList("Sachin", "rahul", "amit"));

	        List<String> upperList = list.stream()
	                                     .map(String::toUpperCase)
	                                     .collect(Collectors.toList());

	        System.out.println(upperList);
	    }
	}

}
