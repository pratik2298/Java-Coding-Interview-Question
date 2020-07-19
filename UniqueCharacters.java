// unique character in String

import java.io.*;
class UniqueCharacters
{
public static void findUnique(String str)
{
boolean flag = false;
char [] ch = str.toCharArray();
for(int i = 0; i < ch.length; i++)
  {
     for(int j = i + 1; j < ch.length; j++)
	{
	   if(ch[i] == ch[j])
	   flag = true;
	   break;
	}

  }

if(flag)
	System.out.println("Not Unique");
else
	System.out.println("Unique");
}
}

class UniqueTest 
{
public static void main(String args[])
{
Console cl = System.console();
String string = cl.readLine("Enter the String : ");
UniqueCharacters.findUnique(string);
}
}

