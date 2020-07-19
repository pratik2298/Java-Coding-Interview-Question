// Binary Search 
// it only work work for sorted array

/*

Complexity of Binary Search
1) Average and Worst Case = O(logn)
2) Best Case = O(1)

*/ 




import java.io.*;
class BinarySearch
{
public static void binSearch(int [] arr1, int key1)
{
 // lb is lower bound and ub is a upper bound
 // lb points the first index of an array and ub points the last index of an array
 
 int lb = 0, ub = arr1.length - 1, mid;
 boolean flag = false;
 while(lb <= ub)
 {

// mid contains middle element of an array

	mid = (lb + ub)/2;
	if(arr1[mid] == key1)
	{
		System.out.println("found");
		flag = true;
		break;
	}
	else if(arr1[mid] > key1)
		lb = mid + 1;
	else
		lb = mid - 1;

 }

if(flag == false)
System.out.println(" not found");



}


public static void main(String args[])
{
Console cl = System.console();
int size = Integer.parseInt(cl.readLine(" enter the size "));
int [] arr = new int[size];
for(int i = 0; i < arr.length; i++)
arr[i] = Integer.parseInt(cl.readLine("enter the element "));

int key = Integer.parseInt(cl.readLine(" enter the key "));

binSearch(arr, key);

}
}