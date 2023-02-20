public class moneytransferservices{
	
	public static void main(String[] args){

CurrencyConvertertwo cct = new CurrencyConvertertwo();
System.out.println(cct.computeTransferAmount(0,1000));
System.out.println(cct.computeTransferFee(0,1000));

}
}