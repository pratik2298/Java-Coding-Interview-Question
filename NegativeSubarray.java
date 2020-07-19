import java.io.*;
class NegativeSubArray
{
private static void sumArray(int a[])
{
int sum = 0, count = 0;
for(int i = 0; i < a.length; i++)
{  
for(int j = i; j < a.length; j++)
{
for(int k = i; k<=j; k++)
	sum+=a[k];

if(sum < 0)
	count++;
}
}
	

System.out.println(count);
}

public static void main(String args[])
{
Console cl = System.console();
int n = Integer.parseInt(cl.readLine("enter the size"));
int [] arr = new int[n];
for(int i = 0; i < arr.length; i++)
arr[i] = Integer.parseInt(cl.readLine("enter the data"));
sumArray(arr);

}
}



