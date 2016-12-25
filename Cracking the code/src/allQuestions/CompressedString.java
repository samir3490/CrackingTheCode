/**
 * Implement a method to perform basic string compression using the counts
of repeated characters. For example, the string aabcccccaaa would become
a2blc5a3. If the "compressed" string would not become smaller than the original
string, your method should return the original string.
 */
package allQuestions;

/**
 * @author samir
 *
 */
public class CompressedString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QuestionOnePointFour obj= new QuestionOnePointFour();
		String str = obj.takeInput();
		compressedStrings(str);

	}

	private static void compressedStrings(String str) {
		// TODO Auto-generated method stub
	char[] var= str.toCharArray();
	StringBuffer sb= new StringBuffer();
	char prev,curr;
	prev = var[0];
	sb.append(prev);
	int count =1;
		for(int i=1;i<str.length();i++)
		{
			curr=var[i];
			
		    if(curr==prev)
			{
				count++;
			}
			else
			{
				sb.append(count);
				sb.append(curr);
				prev=curr;
				count=1;	
			    
			}
		    
		}
		sb.append(count);
	System.out.println(sb.toString());
	}
}
