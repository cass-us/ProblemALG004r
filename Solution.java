import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException 
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
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
        bufferedReader.close();
    }
}
