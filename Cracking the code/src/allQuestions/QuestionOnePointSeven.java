/**
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row
and column are set to 0.
 */
package allQuestions;

import java.util.Scanner;

/**
 * @author samir
 *
 */
public class QuestionOnePointSeven {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row,column;
		System.out.println("Enter size of matrix");
		Scanner obj = new Scanner(System.in);
		row=obj.nextInt();
		column =obj.nextInt();

		setZero(row, column);
	}

	private static void setZero(int row, int column) {
		// TODO Auto-generated method stub
		System.out.println(row);
		System.out.println(column);
		int[][] matrix =new int[row][column];

		System.out.println("Please Enter the matrix " + row*column +" elements");
		Scanner mat=new Scanner(System.in);
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				matrix[i][j]=mat.nextInt();
			}
		}

		int rowno=0,colno=0;
		outerloop:
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					if(matrix[i][j]==0)
					{
						rowno=i;
						colno=j;
						break outerloop;	
					}

				}
			}

		for(int i=0;i<row;i++)
			matrix[i][colno]=0;

		for(int j=0;j<column;j++)
			matrix[rowno][j]=0;

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}
}
