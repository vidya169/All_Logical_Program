package Star_pattern;

public class demo11 {
	public static void main(String[] args) 
	{
		int star=10;
		int space = 0;
		
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			space++;
			star--;
			
		}
		
	}
	

}


/*
**********
 *********
  ********
   *******
    ******
     *****
      ****
       ***
        **
         *
*/
