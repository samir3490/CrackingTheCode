package allQuestions;
import java.util.Scanner;

/**
 * Write a method to replace all spaces in a string with'%20'. You may assume that
the string has sufficient space at the end of the string to hold the additional
characters, and that you are given the "true" length of the string. (Note: if implementing
in Java, please use a character array so that you can perform this operation
in place.)
EXAMPLE
Input: "Mr John Smith
Output: "Mr%20Dohn%20Smith"
 */

/**
 * @author samir
 *
 */
public class QuestionOnePointFour {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="",str1="";

		str= takeInput();
		System.out.println(str);
		str1= modifyString(str);
		System.out.println(str1);
	}

	private static String modifyString(String str) {
		// TODO Auto-generated method stub

		String[] words = str.split(" ");
		StringBuilder sentence = new StringBuilder();

		for (int i = 0; i < words.length; i++) {
			sentence.append(words[i]);
			sentence.append("%20");

		}

		return sentence.toString();
	}

	static String takeInput() {
		// TODO Auto-generated method stub
		String str="";
		System.out.println("Enter your string");
		Scanner obj = new Scanner(System.in);
		str= obj.nextLine();
		return str;
	}



}
