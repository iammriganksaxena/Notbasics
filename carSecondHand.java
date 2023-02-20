import java.time.LocalDate;

public class carSecondHand {
	
    public static int currentYear;
    public static int yearOfCar=0;
    public static String makeAndModel;
    public static int yearOfManufacturing;
    public static double kilometeresDriven;
    public static boolean hasRearViewCamera;
    public static boolean hasABS;
    public static boolean hasEBD;
    public static boolean hasAutoAC;
    public static boolean hasAccidentHistory;
    public static boolean hasSunRoof;
    public static int airBagsCount;
    public static int predictedPrice;
    public static int lostYears;
	
    public carSecondHand(String makeAndModel, int yearOfManufacturing, double kilometeresDriven, boolean hasRearViewCamera,
                                int airBagsCount, boolean hasABS, boolean hasEBD, boolean hasAutoAC, boolean hasAccidentHistory, boolean hasSunRoof) {

        this.makeAndModel = makeAndModel;
        this.yearOfManufacturing = yearOfManufacturing;
        this.kilometeresDriven = kilometeresDriven;
        this.hasRearViewCamera = hasRearViewCamera;
        this.airBagsCount = airBagsCount;
        this.hasABS = hasABS;
        this.hasEBD = hasEBD;
        this.hasAutoAC = hasAutoAC;
        this.hasAccidentHistory = hasAccidentHistory;
        this.hasSunRoof = hasSunRoof;
        currentYear = LocalDate.now().getYear();
        yearOfCar = currentYear - yearOfManufacturing + 1;
    }
	
        public static void main(String[] args){
            carSecondHand carSecondHand = new carSecondHand("ford",2013,23444,false,2,false,false,true,false,false);
            carSecondHand.yeardisplay();
            System.out.println("The Price is reduced by: "+carSecondHand.priceBasedOnYears(540000));
			System.out.println("The updated price is: "+carSecondHand.priceBasedOnSafetyMeasures(540000,false,false,true,2));
			carSecondHand.priceBasedOnLuxuryMeasures(540000,false,false,true,2,true,false);
        }

    public static void yeardisplay(){
        System.out.println("the car is "+yearOfCar+ " years old");
    }

    public static int priceBasedOnYears(int realPrice){
        if(yearOfCar>=5 && yearOfCar<=10){
            lostYears = yearOfCar-5;
            predictedPrice = realPrice - 50000 - lostYears*20000;
        }else if(yearOfCar<5){
            predictedPrice =realPrice - 5*10000;
        }else if(yearOfCar>10 && yearOfCar<=15) {
            lostYears = yearOfCar-10;
            predictedPrice = realPrice - 50000 - 100000- lostYears*50000;
        }
		return (realPrice-predictedPrice);
    }
	
	//public static int getPredictedPrice(){}
    public static double priceBasedOnSafetyMeasures(int realValueOfCar, boolean hasABS, boolean hasEBD, boolean hasAccidentHistory, int airBagsCount){
		if(airBagsCount>=2 && hasAccidentHistory==false && hasABS==true && hasEBD == true){
			return ((carSecondHand.priceBasedOnYears(realValueOfCar)+ carSecondHand.priceBasedOnYears(realValueOfCar)*0.055));
		}else if(airBagsCount>=2 && hasAccidentHistory==false && hasABS==true && hasEBD == false){
			return ((carSecondHand.priceBasedOnYears(realValueOfCar)+ carSecondHand.priceBasedOnYears(realValueOfCar)*0.035));
		}else if (airBagsCount>=2 && hasAccidentHistory==false && hasABS==false && hasEBD == false){
			return ((carSecondHand.priceBasedOnYears(realValueOfCar)+ carSecondHand.priceBasedOnYears(realValueOfCar)*0.025));
		}else if (airBagsCount>=2 && hasAccidentHistory==true && hasABS==false && hasEBD == false){
			return ((carSecondHand.priceBasedOnYears(realValueOfCar)+ carSecondHand.priceBasedOnYears(realValueOfCar)*0.020));
		}else if (airBagsCount<2 && hasAccidentHistory==true && hasABS==false && hasEBD == false){
			return ((carSecondHand.priceBasedOnYears(realValueOfCar)- carSecondHand.priceBasedOnYears(realValueOfCar)*0.080));
		}else{
			return ((carSecondHand.priceBasedOnYears(realValueOfCar)- carSecondHand.priceBasedOnYears(realValueOfCar)*0.1));
		}
	}
	

	public static void priceBasedOnLuxuryMeasures(int realValueOfCar, boolean hasABS, boolean hasEBD, boolean hasAccidentHistory, int airBagsCount, boolean hasAutoAC, boolean hasSunRoof){
		if(hasSunRoof){
		System.out.println((carSecondHand.priceBasedOnSafetyMeasures(realValueOfCar, hasABS, hasEBD, hasAccidentHistory, airBagsCount)) + 10000);
			}
		else if (hasAutoAC){
		System.out.println((carSecondHand.priceBasedOnSafetyMeasures(realValueOfCar, hasABS, hasEBD, hasAccidentHistory, airBagsCount)) + 5000);
			}
    }
}

