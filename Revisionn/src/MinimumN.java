
public class MinimumN {
public static void main(String[] args) {
	int[] num= {10,2,3,4,5,6};
	int min=num[0];
	for(int i=1;i<num.length;i++)
	{
		if(num[i]<min)
		{
			min=num[i];
		}
	}
	System.out.println("the minimum number is: "+min);
}
}
