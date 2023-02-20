public class car{
	
	private String colour;
	String companyName;
	String modelNumber;
	int mileage;
	int groundClearance;
	int tankCapacity;

public void setColour(String c){
	colour = c;
}

public void setMilage(int mileage){
	this.mileage = mileage;
}

public void setTankCapacity(int  tankCapacity){
	this.tankCapacity = tankCapacity;
}

public String getColour(){
	return colour;
}

public int getMilage(){
	return mileage;
}

public int getTankCapacity(){
	return tankCapacity;
}


}