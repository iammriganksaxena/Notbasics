import java.util.Scanner;

public class segregateAlphabets{

	public static void main(String[] args){

		
		Scanner scan = new Scanner(System.in);
		System.out.println("please provide the number of elements you want to store :\n");
		int index = scan.nextInt();
		String arr[] =new String[index];
		System.out.println("\n");

		for(int i = 0;i<index;i++){
				arr[i] = scan.next();
				System.out.print("\n");

			}
				System.out.println("\n");
				System.out.print("the provided input is : ");
				for(int i = 0;i<index;i++){
				System.out.print(arr[i]+"\t");
				}
				check(arr);
	}

	public static void check(String[] array){
		
		int num = array.length;
		String arr = "";
		String brr = "";
		
		for(int i=0;i<num;i++){
			for(int j=i+1;j<num;j++){
				if(array[i].equals(array[j])){
					arr = arr + array[i];
				}
				else if (!(array[i].equals(array[j])))
				{
					brr = brr + array[i];
					break;
				}
			}	
		}
		
		System.out.println(arr);
		System.out.println("\n");
		System.out.println(brr);
		
}
}