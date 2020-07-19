// Quick Sort

Complexity
1) Best and Average = O(nlogn)
2) Average  = O(n^2)



import java.io.Console;
class QuickSort
{

public static int Partition(int []arr, int s, int e)
{
	int pivot = arr[e];
	int pindex = s;
	for(int i = s; i < e-1; i++)
	{
		if(arr[i] < pivot)
		{
		  int temp = arr[i];
		  arr[i] = arr[pindex];
		  arr[pindex] = temp;
		  pindex++;
		}
	}
	
int temp = arr[e];
arr[e] = arr[pindex];
arr[pindex] = temp;

return pindex;

}




// s = start e = end
public static void sortQuick(int [] arr, int s, int e)
{
	if(s < e)
	{
	  int p = Partition(arr, s, e);
	  sortQuick(arr, s, p-1);
	  sortQuick(arr, p+1, e);
	}



}

static void printArray(int arr[])
{
for(int d : arr)
System.out.println(d);
}




public static void main(String args[])
{
Console cl = System.console();
int n = Integer.parseInt(cl.readLine("enter the size of array "));
int [] arr = new int[n];
for(int i = 0; i < arr.length; i++)
arr[i] = Integer.parseInt(cl.readLine("enter the element "));

sortQuick(arr, 0, n-1);
printArray(arr);

}
}