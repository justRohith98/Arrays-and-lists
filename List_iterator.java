package lists;

import java.util.ArrayList;
import java.util.ListIterator;

public class List_iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var list = new ArrayList<Double>();
  list.add(1.1);
  list.add(1.2);
  list.add(1.3);
  
  list.add(1.4);
  list.add(1.5);
  ListIterator itr=list.listIterator(list.size());
  
 // while(itr.hasNext()) {
//	  System.out.println(itr.next());
  while(itr.hasPrevious()) {
	  System.out.println(itr.previous());
	  
  }
	}

}
