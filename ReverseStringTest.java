// Reverse a String without using inbuilt function

import java.io.*;
class ReverseString
{
public static void isReverse(String str)
{
char [] ch = str.toCharArray();
for(int i = ch.length - 1; i >=0; i--)
{
System.out.println(ch[i]);
}
}
}

class ReverseStringTest
{
public static void main(String args[])
{
Console cl = System.console();
String word = cl.readLine("enter the word :");
ReverseString.isReverse(word);
}
}