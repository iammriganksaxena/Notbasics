public class runCar{

public static void main(String []args){
	
	sportsCar sportsCar = new sportsCar(false,true,200);
	sportsCar.setnavigationSystem(true);
	sportsCar.setnitroOxide(true);
	sportsCar.settopSpeed(300);
	sportsCar.setTankCapacity(200);
	sportsCar.setColour("Blue");

	
	sportsCar.getAllFeatures();
	System.out.println("Tank Capacity is: "   +sportsCar.getTankCapacity());
	System.out.println("colour of the car is: "+sportsCar.getColour());

}

}