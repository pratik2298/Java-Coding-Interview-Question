// Ascii code

import java.io.*;
class AsciiCode
{
public static void main(String args[])
{
Console cl = System.console();
String str = cl.readLine("Enter the word");
for(int i = 0; i < str.length(); i++)
System.out.println(str.charAt(i) + "-" +(int)str.charAt(i));
}
}
