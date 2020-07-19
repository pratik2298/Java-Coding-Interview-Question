import java.io.*;
class DuplicateArrayElementTest
{
public static void main(String args[])
{
Console cl = System.console();
int size = Integer.parseInt(cl.readLine("enter the no of element"));
int [] a1  = new int[size];
for(int i = 0; i < a1.length; i++)
a1[i] = Integer.parseInt(cl.readLine("enter the  element"));

for(int i = 0; i < a1.length - 1; i++)
{
for(int j = i + 1; j < a1.length; j++)
{
	if(a1[i] == a1[j]);
	{
	  System.out.println("Duplicate element "  + a1[i]); 
	}
}
}
}
}