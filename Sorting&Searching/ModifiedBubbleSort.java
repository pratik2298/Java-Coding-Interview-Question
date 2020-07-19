// modified bubble sort

import java.io.*;
class ModifiedBubbleSort
{
public static void bubsort(int [] arr1, int size1)
{
	int temp;
	boolean flag;
	
	for(int i = 0; i < arr1.length - 1; i++)
	{
		flag = false;
	for(int j = 0; j < arr1.length - 1 - i; j++)
	{
		if(arr1[j] > arr1[j+1])
		{
			
			temp = arr1[j];
			arr1[j] = arr1[j+1];
			arr1[j+1] = temp;
			flag = true;
		}
	 
	}
		if(flag == false)
		break;



	}
	
	for(int d : arr1)
		System.out.println("sorted array" + d);

}

public static void main(String args[])
{
Console cl = System.console();
int size = Integer.parseInt(cl.readLine("enter the size "));
int [] arr = new int[size];
for(int i = 0; i < arr.length; i++)
arr[i] = Integer.parseInt(cl.readLine(" enter the element"));


bubsort(arr, size);
}
}