 public class firstNonRepeatingChar{
 
 public static void main(String[] args){
 
 String rep ="aaabbbnnfsd";
 int i=0;
 for(;i<rep.length();i++){
 
 if(rep.charAt(i)==rep.charAt(i+1)){
	System.out.println("the char at position " + i + " is a repeatable char");
	i++;
 }
 else if(rep.charAt(i)!=rep.charAt(i+1)){
 System.out.println("the char at position " + (i+1) + " is a non repeatable char");
 } else {
	  System.out.println(" No char at any position is repeatable char");

 }
 }
 }
 }