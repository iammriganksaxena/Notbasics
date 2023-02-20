public class doubleIntArray{
	
	static int[][] array = {{1,2,3,4,5,6},{2,4,7,8,9,11,15}};
	
	public static void main(String[] args){
	for(int i=0;i<array.length;i++){
		for(int j=0; j<array[i].length;j++){
			
			System.out.println("the value of "+i+"th array at "+j+"th psition is+: "+array[i][j]);
	}
	}
	}
}