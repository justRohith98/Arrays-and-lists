package arrays;

import java.util.Scanner;

public class Enhanced_for_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s1 = new Scanner(System.in);
    System.out.println("enter a number");
    int num1=s1.nextInt();
    int [] arr= new int[10];
    for(int i=1;i<=10;i++) {
    	arr[i-1]=num1*i;
    	
    }
    for (int n : arr) {
    	System.out.println(n);
    }
	}

}
