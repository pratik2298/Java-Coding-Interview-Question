import java.io.*;
class MatrixAdd
{
public static void main(String args[])
{
Console cl = System.console();
int row1 = Integer.parseInt(cl.readLine("Enter the row "));
int col1  = Integer.parseInt(cl.readLine("Enter the coloumn "));
int [][] A = new int[row1][col1];
for(int i = 0; i < row1; i++)
  {
    for(int j = 0; j < col1; j++)
	{
		A[i][j] = Integer.parseInt(cl.readLine("Enter the data"));
	 }
  }


int row2 = Integer.parseInt(cl.readLine("Enter the row "));
int col2  = Integer.parseInt(cl.readLine("Enter the coloumn "));
int [][] B = new int[row2][col2];
for(int i = 0; i < row2; i++)
  {
    for(int j = 0; j < col2; j++)
	{
		B[i][j] = Integer.parseInt(cl.readLine("Enter the data"));
	 }
  }

// Addition of A and B
int [][] C = new int[row2][col2];
for(int i = 0; i < row2; i++)
  {
    for(int j = 0; j < col2; j++)
	{
		C[i][j] = A[i][j] + B[i][j];
		System.out.print("Sum");
		System.out.print(C[i][j] + "\t");
	 }
	System.out.println();
  }

}
}
