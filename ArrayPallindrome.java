import java.io.Console;
class ArrayPallindrome 
{
     public static void main(String args[])
     {
         Console cl = System.console();
         int n = Integer.parseInt(cl.readLine("enter the size"));
         boolean fla = true;
	int j;
         int [] arr = new int[n];
         for(int i = 0; i < arr.length; i++)
             arr[i] = Integer.parseInt(cl.readLine("enter the element"));

         for(j = 0; j <= (arr.length)/2; j++)
         {
             if(arr[j] != arr[n-1-j])
		{
		  fla = false;
		System.out.println(" not same");
                 break;
		}
	     
	 }
	
	if(fla)
	System.out.println("same");
	

         
         
     }
}