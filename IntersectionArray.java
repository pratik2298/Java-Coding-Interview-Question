// Intersection of two array
import java.io.*;
class IntersectionArray
{
public static void main(String args[])
{
Console cl = System.console();
int n1, n2, count = 0;
n1 = Integer.parseInt(cl.readLine("enter the number of element for array1 :"));

int [] arr1 = new int[n1];
for(int i = 0; i < arr1.length; i++)
	{
		arr1[i] = Integer.parseInt(cl.readLine("enter the element "));
	}

n2 = Integer.parseInt(cl.readLine("enter the number of element for array2 :"));
int [] arr2 = new int[n2];
for(int j = 0; j < arr2.length; j++)
	{
		arr2[j] = Integer.parseInt(cl.readLine("enter the element "));
	}


int [] temp = new int[n1 + n2];
for(int i = 0; i < arr1.length; i++)
	{
		for(int j = 0; j < arr2.length; j++)
		{
			if(arr1[i] == arr2[j])
			{
			     temp[i] = arr1[i];
			     count++;
			}
		}
	}

if(count == 0)
	System.out.println("No");
System.out.println("Intersection Elemet");
for(int d : temp)
	{
	System.out.println(d);
	}

}
}

