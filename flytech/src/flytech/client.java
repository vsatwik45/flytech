package flytech;

public class client {
	

		   public static void main(String args[]){

		      String word="satwik";

		      int length = word.length();
		      System.out.println("Length: " + length);

		     
		      System.out.println("toUpperCase: " + word.toUpperCase());
		      System.out.println("toLowerCase: " + word.toLowerCase());

		      
		      System.out.println("indexOf('s'): " + word.indexOf('s'));

		      
		      System.out.println("first character: " + word.charAt(0));

		     
		      word = word.substring(0, 4);
		      System.out.println("sub string: " + word);
		   }
		}


