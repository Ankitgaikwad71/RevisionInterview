
public class Palindrome 
{
public static void main(String[] args) {
	int num=121,reverse=0,temp;
	temp=num;
	while(num!=0)
	{
		int remainder=num%10;
		reverse=reverse*10+remainder;
		num=num/10;
	}
	if(temp==reverse)
	{
		System.out.println("palindrome number");
	}
	else
	{
		System.out.println("not a palindrome number");
	}
}
}
