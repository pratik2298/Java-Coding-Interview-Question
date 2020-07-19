// Decimal To Octal

import java.util.Scanner;
class DecToOctal
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int rem, copyNum;
String oct = "";
System.out.println("enter the number :");
int num = sc.nextInt();
copyNum = num;

while(num != 0)
{
rem = num%8;
oct = rem+oct;
num = num/8;
}

System.out.println("Decimal : " + copyNum);
System.out.println("Octal : " + oct);

}
}


