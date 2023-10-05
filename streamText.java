package streampkg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class streamText {

	public static void main(String[] args) {
		//Using Map---> Perform cubic of list 2*2*2=8 --->forEach()
		List<Integer> arr=Arrays.asList(2,3,4,5,6);
		arr.stream().map(a -> a*a*a).forEach(x->System.out.println(x));
		
		//filter() ---> endswith,toUppercase,toLowercase----> with String--->Collect
		List<String> arrStrings=Arrays.asList("hello","hii","who","and");	
		List<String> arr1= arrStrings.stream().map(b->b.toUpperCase()).collect(Collectors.toList());
		List<String> arr2= arrStrings.stream().filter(b->b.endsWith("i")).collect(Collectors.toList());
		System.out.println(arr1);
		System.out.println(arr2);
		//Sorted()--->
		List<String> arr3= arrStrings.stream().sorted().collect(Collectors.toList());
		System.out.println(arr3);
	}

}
