public class arrayPassing{

public static void main(String[] args){
	
	int[] array ={22,11,33,44,55};
	passingArray(array);
	reverseArray(array);
	
}

public static void passingArray(int[] input){
		
	System.out.println("Inside passingArray method");
	for(int counter=0 ; counter < input.length ; counter++){
		System.out.println(input[counter]);
	}
			System.out.println("\n");
			
}

public static void reverseArray(int[] input){
	
		System.out.println("Inside reverseArray method");
		for(int counter = input.length-1 ; counter >=0 ; counter--){
			System.out.println(input[counter]);
			
}

}

}