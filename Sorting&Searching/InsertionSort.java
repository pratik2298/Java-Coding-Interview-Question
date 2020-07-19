// insertion Sort

/*

Complexity
1) Average & Worst = O(n^2)
2) Best = O(n)

*/

import java.io.*;
class InsertionSort
{
public static void insSort(int [] arr1)
{
 int key, j;
 for(int i = 1; i < arr1.length; i++)
 {
	key = arr1[i];
	j = i - 1;
 	
	while(j >= 0 && arr1[j] > key)
	{
		arr1[j+1] = arr1[j];
		j = j - 1;
	}
	
	arr1[j+1] = key;
 }
 
 for(int d : arr1)
	System.out.println(d);		
}

public static void main(String args[])
{
Console cl = System.console();
int size = Integer.parseInt(cl.readLine(" enter the size "));
int [] arr = new int[size];
for(int i = 0; i < arr.length; i++)
arr[i] = Integer.parseInt(cl.readLine("enter the element "));

insSort(arr);

}
}