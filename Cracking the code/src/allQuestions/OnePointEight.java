/**
 * Assume you have a method isSubstring which checks if one word is a
substring of another. Given two strings, si and s2, write code to check if s2 is
a rotation of si using only one call to isSubstring (e.g.,"waterbottle"is a rotation
of "erbottlewat").
 */
package allQuestions;

/**
 * @author samir
 *
 */
public class OnePointEight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="",str2="";
		boolean result;
		QuestionOnePointFour obj=new QuestionOnePointFour();
		str1= obj.takeInput();
		str2=obj.takeInput();

		result= isSubstring(str1,str2);
		System.out.println(result);
	}

	private static boolean isSubstring(String str1, String str2) {
		// TODO Auto-generated method stub
		int j=0,count=0;
		if(str1.length()!=str2.length())
			return false;
		j= str1.length()-1;

		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)==str2.charAt(j))
			{
				count++;
				j--;
			}
			else
				return false;
		}
		if(count== str1.length())
			return true;
		else return false;

	}

}
