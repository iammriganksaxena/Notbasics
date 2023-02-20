public class sportsCar extends car{
	
	boolean navigationSystem;
	boolean nitroOxide;
	int topSpeed;
	
	public sportsCar(boolean navigationSystem, boolean nitroOxide, int topSpeed){
			this.navigationSystem = navigationSystem;
			this.nitroOxide = nitroOxide;
			this.topSpeed = topSpeed; 
	}
	
public void setnavigationSystem(boolean navigationSystem){
	this.navigationSystem = navigationSystem;
}

public void setnitroOxide(boolean nitroOxide){
	this.nitroOxide = nitroOxide;
}

public void settopSpeed(int  topSpeed){
	this.topSpeed = topSpeed;
}

public int gettopSpeed(){
	return topSpeed;
}

public boolean getnitroOxide(){
	return nitroOxide;
}

public boolean navigationSystem(){
	return navigationSystem;
}
	
	public void getAllFeatures(){
		System.out.println("navigation System: "+navigationSystem);
		System.out.println("nitroOxide System: "+nitroOxide);
		System.out.println("Top Speed of the car is: "+topSpeed);
	}

}