


import java.util.Scanner;



public class Solution {
    public static void main(String[] args) 
    {
        
  Scanner scan = new Scanner(System.in);

  int N = scan.nextInt();

	while(N%2!= 0)
     {
          System.out.print("Weird");
		  break;
     }
    while(N%2 == 0  )
	 
	 {
        if( N >= 2 && N <= 4 || N <5)
		{
         System.out.print("Not Weird");
         //
		}
		break;
		 }
     while(N%2==0  )
	 {
		 if( N>=6 || N>6 && N<20)
     {
         //if(N>=6 || N<20)
         //{
           System.out.print("Weird");
//}
	 }
	 break;
     }
   while(N%2==0)
    {
		if(N>20)
		{
     System.out.print("Not Weird");
		}
		break;
    }
    /*else if(N%2!= 0)
     {
          System.out.print("Weird");
     }*/
       
    }
}
