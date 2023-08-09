
public class SwappW 
{
public static void main(String[] args) {
	int a=350,b=450;
	System.out.println("before swapping");
	System.out.println("a= "+a);
	System.out.println("b= "+b);
	
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println("after swapping");
	System.out.println("a= "+a);
	System.out.println("a= "+b);
}
}
