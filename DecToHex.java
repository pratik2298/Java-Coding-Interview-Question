// Decimal to HexaDecimal

import java.io.Console;
class DecToHex
{
public static void hexDecimal(int num1)
{
int rem;
String hex = "";
char [] hexDec = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

while(num1 != 0)
{
rem = num1%16;
hex = hexDec[rem] + hex;
num1 = num1/16;
}

System.out.println("HexaDecimal : " + hex);
}

public static void main(String args[])
{
Console cl = System.console();
int num = Integer.parseInt(cl.readLine("enter the number : "));
System.out.println("Decimal : " + num );
hexDecimal(num);
}
}
