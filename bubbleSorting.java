public class bubbleSorting{

static int [] arr = {12,43,-2,54,-22,65};

public static void main(String[] args){
	
	for (int i=0;i<=arr.length-1;i++){
	System.out.print("\t" + arr[i]);
	}
	
	for(int j=arr.length-1;j>=0;j--){
	for(int i=0;i<j;i++){
		if(arr[i]>arr[i+1])
			sort(arr,i,i+1);
	}
	}
	
	for (int i=0;i<arr.length-1;i++){
			System.out.print("\n The sorted index is: ");
			System.out.print("\t" + arr[i]);
	}
}

public static void sort(int[]array, int i, int j){
	if(i==j){
		return;
	}
	int temp = array[i];
	array[i] = array[j];
	array[j] = temp;
}
}