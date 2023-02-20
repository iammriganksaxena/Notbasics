public class objectA{
	
	int height;
	int length;
	int width;
	
	public objectA(int height,int length,int width)
	{
		
		this.height=height;
		this.length=length;
		this.width=width;
		
	}
	
	public objectA(int height,int length){
		
		this.height=height;
		this.length=length;
		
	}
	
	public static void main(String[] args){
	
	objectA a = new objectA(11,11,2);
	objectA b = new objectA(11,11);
	System.out.println(squared(b));
	System.out.println(volume(a));
	}

	public static int squared(objectA s){
	
	return s.height*s.length;
	
	}
	
	public static int volume(objectA v){
		
		return v.height*v.length*v.width;
		
	}

}