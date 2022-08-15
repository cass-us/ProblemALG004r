import java.util.Scanner;

public class ProblemALG004r
{
 public static void rotateMatrix( int[][] p_magicSquare)
{

  int t = 3;
 
 for(int x = 0; x < t/2;x++)
 {
	 for(int y = x; y<t-x-1;y++)
	 {
		int temp = p_magicSquare[x][y];
        p_magicSquare[y][t-1-x] = p_magicSquare[t-1-x][t-1-y];
		p_magicSquare[t-1-x][t-1-y] =p_magicSquare[t-1-y][x];
		p_magicSquare[t-1-y][x] = temp;
		
		System.out.print(p_magicSquare[t-1-y][x]);
	 }
	System.out.print(" "); 
	 
 }

}	
	
public static void main(String[] args)
{
	
    Scanner scan = new Scanner(System.in);
    int oddNumber = scan.nextInt();	
	int number = 1, rows = 0, coll;
	int[][] magicSquare =new int[oddNumber][oddNumber];
	
	coll = oddNumber/2;
	
	int row,collum;
	while(number <= oddNumber*oddNumber)
	{

			magicSquare[rows][coll] = number;
			number = number +1;
			row = rows;
			collum = coll;
			
			rows -=1;
			coll=coll+1;
			
			if(rows == -1)
			{
				
				rows = oddNumber -1;
			}
			
			if(coll == oddNumber)
			{
				coll = 0;
				
			}
			
			
			if(magicSquare[rows][coll] != 0)
			{
				rows = row +1;
				coll = collum;
				
				if( rows == -1)
				{
					rows = oddNumber - 1;
					
				}
				
			}
		
	}

   for( int x = 0; x < magicSquare.length;x++)
   {
	  for( int p = 0; p <  magicSquare.length; p++)
	  {
		  System.out.print(magicSquare[x][p]+ " ");
	  }
	  
	System.out.println(" ");  
   }




  
  
  
System.out.println("------After 180 degree rotation-------");
rotateMatrix(magicSquare);

}	
	
	
}