
public class ReverseeS {
public static void main(String[] args) {
	String str="Ankit is my name",nstr=" ";
	char ch;
	for(int i=0;i<str.length();i++)
	{
		ch=str.charAt(i);
		nstr=ch+nstr;
	}
	System.out.println("the reverse of string is: "+nstr);
}
}
