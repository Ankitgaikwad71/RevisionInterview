
public class CountNAlpha {
public static void main(String[] args) {
	String str="Ankitaa";
	int count=0;
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)=='a')
		{
			count++;
		}
	}
	System.out.println("the number of times a comes is: "+count);
}
}
