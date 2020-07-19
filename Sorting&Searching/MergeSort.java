// Merge Sort


import java.io.Console;
class MergeSort
{
public static void merge(int [] arr1, int s1, int mid1, int e1)
{
 int i = s1;
 int j = mid1 + 1;
 int k = s1;
 int n = arr1.length;
int [] temp = new int[n];

        // element in both right subarray and left subarray
	while(i <= mid1 && j <= e1)
	{
	  if(arr1[i] < arr1[j])
	  	temp[k++] = arr1[i++];
	  
	  else
		temp[k++] = arr1[j++];
	}
	

 	// element in only left subarray
	while(i <= mid1)
		temp[k++] = arr1[i++];


	// element in only rightsubarray
	while(j <= e1)
		temp[k++] = arr1[j++];

		
	for(int x = s1, y = 0; x <= e1; x++, y++)
		arr1[x] = temp[y];

	

	
}
public static void mergesort(int [] arr1, int s, int e)
{
	if(s < e)
	{
	  int mid = (s+e)/2;
	  mergesort(arr1, s, mid);
	  mergesort(arr1, mid+1, e);
	  merge(arr1, s, mid, e);
	}


}

static void PrintArray(int [] arr)
{
for(int d : arr)
System.out.println(d);
}


public static void main(String args[])
{
Console cl = System.console();
int n = Integer.parseInt(cl.readLine("enter the size of an array"));
int [] arr = new int[n];
for(int i = 0; i < arr.length; i++)
arr[i] = Integer.parseInt(cl.readLine("enter the element "));

mergesort(arr, 0, n-1);
PrintArray(arr);


}
}