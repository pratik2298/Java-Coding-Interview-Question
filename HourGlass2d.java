// HourGlass 2d Array sum(hackerrank)

import java.io.Console;
class HourGlass2d
{
Console cl = System.console();
public static void main(String args[])
{
Console cl = System.console();
int row = Integer.parseInt(cl.readLine("enter the rows :"));
int col = Integer.parseInt(cl.readLine("enter the coloumn"));
int [][] mat2d = new int[row][col];
	for(int i = 0; i < mat2d.length; i++)
	{
	for(int j = 0; j < mat2d.length; j++)
	{
		mat2d[i][j] = Integer.parseInt(cl.readLine("enter the the element"));
		
	}
	}


// hour glass calculation
int max_sum = -63;

for(int i = 0; i <= 3; i++)
{
for(int j = 0; j <= 3; j++)
{
int current_sum = mat2d[i][j] + mat2d[i][j+1] + mat2d[i][j+2] + mat2d[i+1][j+1] + mat2d[i+2][j] + mat2d[i+2][j+1] + mat2d[i+2][j+2];
if(current_sum > max_sum)
	max_sum = current_sum;
}
}
System.out.println(max_sum);

}
} 