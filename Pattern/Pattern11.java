
/*

A
BB
CCC
DDDD
EEEEE

*/


class Pattern11
{
public static void main(String args[])
{
char ch = 'A';

for(int i = 1; i<=5; i++)
{

for(int j = 1; j<=5; j++)
{
	if(j <= i)
	{
	System.out.print(ch);
	}
	else
	System.out.print("");
}
System.out.println();
ch++;
}

}
}