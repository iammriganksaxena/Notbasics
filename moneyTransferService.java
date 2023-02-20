package util;
import C.javaindeapth.src.com.basics.moneyConverter;

public class moneyTransferService{
moneyConverter mC = new moneyConverter();

public static double setExchangeRatesOfIndex(int index, double value){
rates[index]=value;
return rates[index];
}

public static double transferMoney(int index, double value,moneyConverter mC){
return setExchangeRatesOfIndex(int index, double value)*moneySent;
}

public static double getExchangeRatesOfIndex(int index){
return rates[index];
}

}