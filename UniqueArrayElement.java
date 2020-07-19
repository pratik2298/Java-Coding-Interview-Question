// Unique Array Element

import java.io.Console;
class UniqueArrayElement
{
public static void main(String args[])
{
Console cl = System.console();
int n = Integer.parseInt(cl.readLine("Enter the size "));
int [] arr = new int[n];
for(int i = 0; i<n; i++)
arr[i] = Integer.parseInt(cl.readLine("Enter the element "));

int [] temp = new int[n];
int k = 0;


for(int i = 0; i<n-1; i++)
	{
		int count = 1;
	
	for(int j = i+1; j<n; j++)
	{	
		if(arr[i] == arr[j])
		{
			count++;
			k = arr[i]-1;
			temp[k] = count;
			
		}
	}

	}

for(int i = 0; i <= temp.length / 2; i++)
{
	if(temp[i] == 0)
	System.out.println("Unique Element is " + (i+1));
}

}
}
			
			
				

