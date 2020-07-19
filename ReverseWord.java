// reverse each word in string

import java.util.*;
class ReverseWord
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the word");
String sent = sc.nextLine();
System.out.println(sent);


String [] s1 = sent.split(" ");
String revWord = " ";
String revString = " ";

for(int i = 0; i < s1.length; i++)
{
String words = s1[i];

for(int j = words.length() - 1; j >= 0; j--)
revWord += words.charAt(j);
}

revString += revWord + " ";
System.out.println(revString);

}
}