// removing duplicate element from ArrayList

import java.util.*;
import java.util.stream.*;
import java.io.*;
class DuplicateArrayList
{
public static void main(String args[])
{
Console cl = System.console();
ArrayList<Integer> list = new ArrayList<Integer>();
String opt = cl.readLine(" enter data :- y/n ");
while(opt.equals("y"))
	{
		int data = Integer.parseInt(cl.readLine("Enter the element"));
		list.add(data);
		opt = cl.readLine(" enter data :- y/n ");
	}
System.out.println("original Array");
System.out.println(list);

Stream<Integer> s1 = list.distinct();
ArrayList<Integer> d1 = s1.collect(Collectors.toList());
System.out.println(d1);

}
}


