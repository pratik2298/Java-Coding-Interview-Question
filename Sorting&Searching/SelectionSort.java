// Selection sort

// Complexity
// Best Worst & Average Case: O(n^2)

import java.io.*;
class SelectionSort
{
public static void selSort(int [] arr1)
{
	for(int i = 0; i < arr1.length - 1; i++)
	{
		int min = i;
	for(int j = i + 1; j < arr1.length; j++)
	{
		if(arr1[j] < arr1[min])         // (arr1[j] > arr1[min]) it will sort in descending order
		{
			min = j;
		}
	}
	if(min != i)
	{
    		int temp = arr1[min];
		arr1[min] = arr1[i];
		arr1[i] = temp;
	}
	}


for(int d : arr1)
System.out.println(d);

}


public static void main(String args[])
{
Console cl = System.console();
int size = Integer.parseInt(cl.readLine("enter the size"));
int [] arr = new int[size];
for(int i = 0; i < arr.length; i++)
arr[i] = Integer.parseInt(cl.readLine("enter the element "));

selSort(arr);

}
}