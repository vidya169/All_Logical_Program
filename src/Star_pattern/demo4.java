package Star_pattern;

public class demo4 {
/*	public static void main(String[] args) 
	{
		int i,j, row=8;
		for(i=1;i<row;i++)
		{
			for(j=2*(row-i);j>=1;j--)
			{
				System.out.print(" ");			
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
	
		}
		
		
	}

}
/*

* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 
* * * * * * *             */



public static void main(String[] args)

{
	int i, j, row=8;
	for(i=1;i<row;i++) {
		for(j=2*(row-i);j>=1;j--)
		{
			System.out.print(" ");
		}
		for(j=1;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
} 
}

























