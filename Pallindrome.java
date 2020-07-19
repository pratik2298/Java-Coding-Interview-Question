import java.io.*;
class Pallindrome
{
public static void main(String args[])
{
Console cl = System.console();
int i;
String word = cl.readLine(" enter the word ");
int len = word.length();
char [] ch = word.toCharArray();
for(i = 0; i < len/2; i++)
{
if(ch[i] != ch[len - i - 1])
{
System.out.println("Not pallindrome");
break;
}
}
if(i == len/2)
System.out.println("pallindrome");

}
}
