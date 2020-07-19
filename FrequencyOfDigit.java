// Frequency of Digit In Number

import java.io.Console;
class FrequencyOfDigit
{
public static void main(String args[])
{
Console cl = System.console();
int number = Integer.parseInt(cl.readLine("enter the number "));
int [] frequency = new int[10];
while(number != 0)
{
	// taking last digit
	int lastDigit = number % 10;
	frequency[lastDigit]++;
	
	// Removing the last Digit
	number/=10;
}

for(int i = 0; i < frequency.length; i++)
{
	if(frequency[i] != 0)
		System.out.println("   " + i + "  :   " + frequency[i]);
}

}
}