
public class maximumN {
	 public static void main(String[] args) {
int[] num= {1,2,3,4,5,600,7,8,9};
int max=num[0];
for(int i=1;i<num.length;i++)
 {
if(num[i]>max)
   {
	max=num[i];
   }
 }
System.out.println("the maximum number is : "+ max);
}
}