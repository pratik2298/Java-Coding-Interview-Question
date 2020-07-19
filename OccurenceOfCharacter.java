// Occurence of character

import java.io.*;
class OccurenceOfCharacter
{
public static void main(String args[])
{
Console cl = System.console();
int a[] = new int[26];
String str = cl.readLine("enter the String :");
for(int i = 0; i < str.length(); i++)
{
if(str.charAt(i) >= 65 && str.charAt(i) <= 90)
{
a[str.charAt(i) - 65]++;
}
else if(str.charAt(i) >= 97 && str.charAt(i) <= 122)
{
a[str.charAt(i) - 97]++;
}
}
for(int i = 0; i < a.length; i++)
{
if(a[i] > 0)
	System.out.println((char)(i+65) + "-" + a[i]);
}
}
}