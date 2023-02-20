public class reverseString{

public static String name ="my name is khan and I am not a terrorist";
public static String reverseName = "";

public static void main(String[] args){
	System.out.println("the string is :"+name);
	System.out.println("the reverse of the given string is :"+reverse(name));
	
}

public static String reverse(String name){
	
	for(int i=name.length()-1;i>=0;i--){
		reverseName = reverseName + name.charAt(i);
	}
	return reverseName;
}
}