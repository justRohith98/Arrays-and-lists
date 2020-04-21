package lists;

import java.util.ArrayList;
import java.util.List;

public class Array_lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


    ArrayList<String> arr= new ArrayList<String>();
  arr.add("red");
  arr.add("white");
  arr.add("yellow");
  arr.add("pink");
  arr.add("blue");
  System.out.println(arr);
  System.out.println(arr.get(3));
  arr.set(2, "pink");
  System.out.println(arr.get(2));
  //arr.clear();
  //arr.remove(0);
  //arr.remove("blue");
  System.out.println(arr);
  System.out.println(arr.indexOf("pink"));
  System.out.println(arr.lastIndexOf("pink"));
  System.out.println(arr.contains("black"));
  List<String> arr2=arr.subList(2,5);
  System.out.println(arr2);
  System.out.println(arr.subList(1,3));
  System.out.println(arr.isEmpty());
  System.out.println(arr.size());
  System.out.println("list of elements" +arr);
  
  for(String x : arr) {
	  System.out.println(x);
  }
	}
	
}