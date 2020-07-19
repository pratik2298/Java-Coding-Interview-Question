import java.io.*;
class TwoArrayEqual
{
public static void checkEqual(int [] arr1, int [] arr2)
{

if(arr1.length != arr2.length)
	System.out.println("Not Equal");
else
{
int i, j,k,l,temp, temp1;
for(i = 0; i < arr1.length - 1; i++)
  {
	for(j = 0; j < arr1.length - i - 1; j++)
	{
		if(arr1[j] > arr1[j+1])
		{
		   temp = arr1[j];
		   arr1[j] = arr1[j+1];
		   arr1[j+1] = temp;

		}
	}
  }

for(l = 0; l < arr2.length - 1; l++)
  {
	for(k = 0; k < arr2.length - l - 1; k++)
	{
		if(arr2[k] > arr2[k+1])
		{
		   temp1 = arr2[k];
		   arr2[k] = arr2[k+1];
		   arr2[k+1] = temp1;

		}
	}
  }

for(int p1 : arr1)
	System.out.println(" sorted Array 1  " +  p1);

for(k = 0; k < arr2.length; k++)
	System.out.println(arr2[k]);

		
for(j = 0; j < arr1.length; j++)
	{
		if(arr1[j] != arr2[j])
			System.out.println("Not Equal");
			break;
		
	}

System.out.println(" Equal");

}

}
}

class TwoArrayEqualTest
{
public static void main(String args[])
{
Console cl = System.console();
int size1 = Integer.parseInt(cl.readLine("Enter the no of element "));
int [] a1 = new int[size1];
for(int i = 0; i < a1.length; i++)
a1[i] = Integer.parseInt(cl.readLine("Array 1 element : "));

int size2 = Integer.parseInt(cl.readLine("Enter the no of element "));
int [] a2 = new int[size2];
for(int j = 0; j < a2.length; j++)
a2[j] = Integer.parseInt(cl.readLine("Array 2 element : "));
TwoArrayEqual.checkEqual(a1, a2);
}
}