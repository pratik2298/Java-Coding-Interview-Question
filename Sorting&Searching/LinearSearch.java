// linear Search

/*

Complexity of linear search
1) Worst & Average Case = O(n)
2) Best Case = O(1)

*/

import java.util.*;
class LinearSearch
{
public static void linSearch(int [] arr1, int key1)
{
	boolean flag = false;
	for(int k = 0; k < arr1.length; k++)
	{
		if(arr1[k] == key1)
		{
		flag = true;
		System.out.println("key found");
		break;
		}
	}
	
	if(flag == false)
		System.out.println("key not found");
}

public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
System.out.println(" Enter the size of an array : ");
int size = scan.nextInt();

int [] arr = new int[size];
System.out.println("enter the element");
for(int i = 0; i < arr.length; i++)
arr[i] = scan.nextInt();

System.out.println(" enter the key to find in array  ");
int key = scan.nextInt();

linSearch(arr, key);
}
}
