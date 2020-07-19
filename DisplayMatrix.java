import java.io.*;
class DisplayMatrix
{
public static void main(String args[])
{
Console cl = System.console();
int k = 0;

// getting row
int row = Integer.parseInt(cl.readLine("enter the row"));

// getting coloumn
int col = Integer.parseInt(cl.readLine("enter the coloumn"));

int [][] mat2d = new int[row][col];
for(int i = 0; i < row; i++)
  {
     for(int j = 0; j < col; j++)
	{
	  mat2d[i][j] = Integer.parseInt(cl.readLine(" Enter the  " + k + " data "));
	  k++;
        }
  }
for(int i = 0; i < row; i++)
  {
     for(int j = 0; j < col; j++)
	{
	  System.out.print(mat2d[i][j] + "\t");
		
        }
	System.out.println();
  }

}
}