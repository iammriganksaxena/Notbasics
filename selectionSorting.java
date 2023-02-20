public class selectionSorting{

static int [] arr = {12,43,-2,54,-22,-1};

public static void main(String[] args){
	
	for (int i=0;i<=arr.length-1;i++){
	System.out.print("\t" + arr[i]);
	}
	
	for(int i=arr.length-1;i>=0;i--){
			
		int highestValIndex = 0;

		for(int j=0;j<=i;j++){
			if(arr[highestValIndex]<arr[j]){
			highestValIndex=j;
			}
		}
		sort(arr,highestValIndex, i);
	}
	System.out.print("\n The sorted array is: ");

	for (int i=0;i<=arr.length-1;i++){
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