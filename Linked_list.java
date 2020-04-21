package arrays;

import java.util.LinkedList;

public class Linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 var list=new LinkedList<Double>();
 list.add(1.1);
 list.add(2.8);
 list.add(7.2);
 list.add(3.4);
 list.add(4.3);
 list.add(5.6);
System.out.println(list.get(2));
list.add(3, 9.8);
list.set(2,3.3);
System.out.println(list.get(2));
//list.remove(0);
//list.remove(7.2);
System.out.println(list.indexOf(2.8));
System.out.println(list.lastIndexOf(2.8));
System.out.println(list.contains(2.8));
//System.out.println(list.indexOf(1.99));
//System.out.println(list);
//System.out.println(list.subList(2,4));
System.out.println(list.peekFirst());
System.out.println(list.peekLast());
System.out.println(list.pollFirst());
System.out.println(list.pollLast()); 
	}

}
