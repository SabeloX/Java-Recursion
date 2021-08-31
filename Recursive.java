/**
 *A class that shows some recursive methods
 *@author Sabelo Mtetwa
 * */
public class Recursive {

	/**
	 * The main method to test the recursive methods
	 * @param args For the command-line arguments
	 * */
	public static void main(String[] args){
		System.out.println(countChar(args[0]));
	}

	/**
	 * Finding Factorial using recursion
	 * @param n Number to get factorial of.
	 * @return factorial value
	 * */
	public static int factorial(int n){
		if(n == 1){
			return 1;
		}
		else{
			return n * factorial(n - 1);
		}
	}

	/**
	 * Find the length of a string using recursion
	 * @param word
	 * @return the length
	 * */
	public static int countChar(String word){
		if(word.length() == 1){
			return 1;
		}
		else{
			return countChar(word.substring(0, word.length()/2)) + countChar(word.substring(word.length()/2, word.length()));
		}
	}
}
