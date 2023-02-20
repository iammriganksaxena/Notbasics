import java.util.*;
public class alok{

public static void main(String []args){

String all = "This string This everything useless";

//List<String> list = new ArrayList<String>();

int len = all.length();
	
String[] arr = all.split(" ");

	List list = Arrays.asList(arr);
	System.out.println(list);


}
}