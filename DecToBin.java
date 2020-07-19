// Decimal to Binary

import java.io.Console;
class DecToBin
{
public static void main(String args[])
{
Console cl = System.console();
int num, rem, copyNum;
String bin = "";

num = Integer.parseInt(cl.readLine(" enter the Num : " ));
copyNum = num;

while(num != 0)
{
rem = num%2;
bin = rem + bin;
num = num/2;
}

System.out.println("Decimal : " + copyNum);
System.out.println("Binary : " + bin);
}
}




