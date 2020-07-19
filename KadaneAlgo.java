// Maximum SubArray Using (Kadane Algorithm)

import java.io.Console;
class KadaneAlgo
{
public static void main(String args[])
{
Console cl = System.console();
int n = Integer.parseInt(cl.readLine("enter the size "));
int [] arr = new int[n];
for(int i = 0; i < arr.length; i++)
arr[i] = Integer.parseInt(cl.readLine("enter the "+ i+1 + "element "));

int current_sum = 0, max_sum = 0, start = 0, end = 0, s = 0;

// Kadane Algo implementation
for(int i = 0; i < arr.length; i++)
{
	current_sum+=arr[i];
	
	if(max_sum < current_sum)
	{
		max_sum = current_sum;
		start = s;
		end = i;
	}
	
	if(current_sum < 0)
	{
		current_sum = 0;
		s = i+1;
	}
}

System.out.print("Maximum Sum of SubArray " + max_sum);

}
}