// place all the zero to right to extreme right

import java.io.*;
class AllRightZeros
{
public static void main(String args[])
{
Console cl = System.console();
int temp, k = 1, zc = 0, sorted = 0;
int n = Integer.parseInt(cl.readLine("enter the size "));
int [] arr = new int[n];
for(int i = 0; i < n; i++)

arr[i] = Integer.parseInt(cl.readLine("Enter the data"));

// counting all zero element
for(int d : arr)
{
	if(d == 0)
	zc++;
}
// System.out.println(zc);



for(int i = 0; i < n; i++)
{
	// if zero is found then placing all the zeros to last
	// second last and so on..
	if(arr[i] == 0)
	{
	  temp = arr[n - k]; //assigining last element to temp
	  arr[n - k] = arr[i];  // placing zero to last index of array
	  arr[i] = temp;        // placing last value of array which is in temp to a[i] position
	  k++;
	  sorted++;             // it keep the count of zero which is place at last and second last and so on
	  if(sorted == zc)      // it tells all the zero have been placed at exterme right
		break;
	}	  	  

}
for(int disp : arr)
System.out.print(disp + " ");

}
}