package streamreduce;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class ReduceEx {
public static void main(String[] args) {
		//List<Integer>list=Arrays.asList(12,13,1,34,6,45);
		//int result=list.stream().reduce(1,(a,b)->a*b);
		//System.out.println(result);
	
        //             int max = list.stream()
	  //                    .reduce((a, b) -> a > b ? a : b)
	//                      .get();                                                                                                                                                                 // get value from Optional
//
	  //      System.out.println("Maximum number is: " + max);
	                                              
	
	//	}
//}20, 25, 30);

     //   int sum = list.stream()
                     // .reduce(0, (a, b) -> (b % 2 == 0) ? a + b : a);

       // System.out.println("Sum of even numbers: " + sum);
    //}
//} int sum = list.stream()
     // .reduce(0, (a, b) -> a + (b * b));

//System.out.println("Sum of squares: " + sum);
//}
//}
//int[] result = list.stream()
//.reduce(new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE},
      //  (a, b) -> {
           // if (b > a[0]) {
              //  a[1] = a[0];  
              //  a[0] = b;    
           // } else if (b > a[1] && b != a[0]) {
               // a[1] = b;    
           // }
          //  return a;
      //  },
      //  (x, y) -> x);   

//System.out.println("Second highest: " + result[1]);
//}
//} 
		// list.stream()
       //  .filter(n -> n % 2 == 0)   // only even numbers
         //.sorted()                 // sort ascending
       //  .forEach(System.out::println); // print
 //}
//}
      //  list.stream()
        //.sorted(Comparator.reverseOrder()) // sort descending
        //.limit(3) // take top 3
        //.forEach(System.out::println); // print
//}
//} List<Integer> sortedList = list.stream()
  //      .sorted() // ascending
    //    .collect(Collectors.toList());

//System.out.println(sortedList);
//}
//}
      //  List<Integer> result = list.stream()
        //        .distinct()   // remove duplicates
          //      .sorted()     // sort ascending
            //    .collect(Collectors.toList());

//System.out.println(result);
//}
//}
	//	int secondHighest = list.stream()
      //          .distinct()
        //        .sorted(Comparator.reverseOrder())
          //      .skip(1)
            //    .findFirst(2f	2SX SED	
              //  .get();
		 List<String> names = Arrays.asList("Rahul", "Amit", "Vikas", "Anil");

	      //  List<String> sortedNames = names.stream()
	        //                                .sorted()
	          //                              .collect(Collectors.toList());

//System.out.println(sortedNames);
	    //}
	//}
List<String> sortedNames = names.stream()
.sorted(Comparator.reverseOrder())
.collect(Collectors.toList());

System.out.println(sortedNames);
}
}