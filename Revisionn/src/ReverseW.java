
public class ReverseW {

    public static void main(String[] args) {
    
    	        String str = "Ankis is my name";
    	        String[] words = str.split(" "); // Split the string into words
    	        String reversed = " ";

    	        for (int i = words.length - 1; i >= 0; i--) {
    	            reversed = reversed + words[i];
    	            if (i > 0) {
    	                reversed = reversed + " ";
    	            }
    	        }

    	        System.out.println("The reverse of the words is: " + reversed);
    	    }
    	}
    	







