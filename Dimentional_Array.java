package arrays;

public class Dimentional_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String [] [] arr= {{"av","b"},
    		            {"b","cg"},
    		            {"w","ef","r"}
     };
     System.out.println(arr.length);
     System.out.println(arr[0].length);
     System.out.println(arr[0][1]);
     arr[2][0]="AAA";
     System.out.println(arr[2][1]);
     
     for(String[] x :arr){
    	 for(String[] y : x) {
    		 System.out.println(y);
     }
     }
	}

}
