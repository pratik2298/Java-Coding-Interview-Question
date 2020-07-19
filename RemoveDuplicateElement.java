// remove duplicate element 
// it will work correct if array is sorted in ascending order 

import java.io.*;
class RemoveDuplicateElement
{
private static void remove(int a[])
{
int j = 0;
int size = a.length;
int [] temp = new int[a.length];
for(int i = 0; i < a.length-1; i++)
{
 if(a[i] != a[i+1])
{
temp[j++] = a[i];
}
}
temp[j++] = a[size - 1];
for(int d : temp)
	System.out.println(d);
}


public static void main(String args[])
{
Console cl = System.console();
int n = Integer.parseInt(cl.readLine("enter the size "));
int [] arr = new int[n];
for(int i = 0; i < arr.length; i++)
arr[i] = Integer.parseInt(cl.readLine("enter the element "));
remove(arr);
}
}