public class insertionSorrting{

public static int [] arr = {32,13,-2,54,-22,-1};

public static void main(String[] args){
	
	
	for(int unsortedArray = 1; unsortedArray<arr.length; unsortedArray++){
		
		int currentVal = arr[unsortedArray];
		System.out.println(currentVal);
		
		for(int i=unsortedArray;i>0;i--){
			
			if(arr[i-1]>arr[i]){
				arr[i]=arr[i-1];
				arr[i-1]=currentVal;
			}
			
		}
		
	}
	
	for (int i=0;i<=arr.length-1;i++){
		System.out.print("\t" + arr[i]);
	}
	
} 


}