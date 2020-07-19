import java.io.*;
class ContinousSubArraySum
{
private static void sumArray(int a[], int n)
{
int sum = 0, k;
for(int i = 0; i < a.length; i++)
   {
	sum = a[i];
for(int j = i + 1; j < a.length; j++)
   {
	sum += a[j];
	if(sum == n)
	{
		for(k = i; k <= j; k++)
		System.out.print(a[k] + " ");
	System.out.println();
	}
	else 
	if(sum > n)
		break;
   }
   }  
}


public static void main(String args[])
{
Console cl = System.console();
int n = Integer.parseInt(cl.readLine("enter the size"));
int key = 45;
int [] arr = new int[n];
for(int i = 0; i < arr.length; i++)
arr[i] = Integer.parseInt(cl.readLine("enter the data"));
sumArray(arr, key);

}
}
   

