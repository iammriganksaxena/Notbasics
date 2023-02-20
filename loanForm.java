public class loanForm{

static int age;
static int salary;
static String name;
static boolean badCredit = false; 


public static void main(String[] args)
{

loanForm lf = new loanForm();
lf.age = 36;
lf.salary = 90000;
lf.name = "Rahul";


if(lf.name != null && lf.age>35 && lf.salary>=90000){
	System.out.println("The loan is Aprroved kyunki vidhayak ke rishtedaar hai");
	System.out.println(lf.name);
}
else{
	System.out.println("Vidhayak ko nahi jantey");
	System.out.println(lf.name);
}

}

}