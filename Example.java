class A{

public void foo(int x){
System.out.println("In Class A");
}
}

class B extends A{

public void foo(int x){
System.out.println("In Class B");
}
}

class Example{

public static void main(String[] args){
B b = new B();

b.foo(3);
}
}