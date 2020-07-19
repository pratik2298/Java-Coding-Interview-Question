import java.io.*;
class SumPairArray
{
public static void main(String args[])
{
Console cl = System.console();
int key = 20; 



int size = Integer.parseInt(cl.readLine("Enter the size"));
int [] arr = new int[size];

for(int i = 0; i < size; i++)
arr[i] = Integer.parseInt(cl.readLine("Enter the element"));

for(int i = 0; i < arr.length - 1; i++)
{
for(int j = i + 1; j < arr.length; j++)
{
if(arr[i] + arr[j] == key)
{
 System.out.println(arr[i] + " + " + arr[j] + " + " + "  =  " + key);
}
}
}

}
}
