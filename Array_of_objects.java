package arrays;

public class Array_of_objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object [][] arr = {{"Maneesh",33,5.11,'m'},
				{"sruthi",30,5.12,'f'},
				{"john",56,4.10,'m'}};
		
		for(Object x : arr){
			for(Object y : x){
		System.out.println(y + "  ");
					
		}
		System.out.println("/n");

	}

}
}