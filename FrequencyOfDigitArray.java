// counting the frequency of digit in Array

import java.io.*; 
class FrequencyOfDigitArray
{
public static void main(String args[])
{
Console cl = System.console();
int n = Integer.parseInt(cl.readLine("Enter the size of array  "));
int [] arr = new int[n];

for(int i = 0; i < arr.length; i++)
arr[i] = Integer.parseInt(cl.readLine("enter the element : "));

int [] temp = new int[n];
for(int i = 0; i < temp.length; i++)
temp[i] = -1;

/*

for(int d : arr)
System.out.print(d + " ");
System.out.println();
for(int d1 : temp)
System.out.print(d1 + " ");


*/



for(int i = 0; i < arr.length; i++)
{
	int count = 1;
for(int j = i + 1; j < arr.length; j++)
{
	if(arr[i] == arr[j]) 
	{
		count++;
		temp[j] = 0;
	}

}

if(temp[i] != 0)
temp[i] = count;

}

for(int i = 0; i < temp.length; i++)
{
	if(temp[i] != 0)
	{
	System.out.println(arr[i] + "    "  + temp[i]);
	}
}

		
}
}

 

	