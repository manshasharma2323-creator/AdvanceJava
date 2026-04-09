package exercise2;
import java.util.*;
import java.util.stream.*;



	
		 //ArrayList<String> list = new ArrayList<>(Arrays.asList("Sachin", "rahul", "amit"));

	        //List<String> upperList = list.stream()
	        //                             .map(String::toUpperCase)
	      //                               .collect(Collectors.toList());

	    //    System.out.println(upperList);
	  //  }
	//}

//ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));

//List<Integer> squareList = list.stream()
                              //.map(n -> n * n)
                             // .collect(Collectors.toList());

//System.out.println(squareList);
//}
//}
		//  ArrayList<String> list = new ArrayList<>(Arrays.asList("java", "python", "c"));

	      //  List<Character> result = list.stream()
	                                  //  .map(s -> s.charAt(0))
	                                //    .collect(Collectors.toList());

	       // System.out.println(result);
	  //  }
	//}
		 //ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30));

	      //  List<String> stringList = list.stream()
	                                   //  .map(String::valueOf)
	                                   //  .collect(Collectors.toList());

	      //  System.out.println(stringList);
	   // }
	//}
		//  ArrayList<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));

	      //  List<String> result = list.stream()
	        //                         .map(s -> "Item-" + s)
	          //                       .collect(Collectors.toList());

	        //System.out.println(result);
	    //}
	//}import java.util.*;	
public class mapexercise{
public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 10, 15));

    List<Integer> result = list.stream()
                              .map(n -> n * 2)
                              .collect(Collectors.toList());

    System.out.println(result);
}
}
		