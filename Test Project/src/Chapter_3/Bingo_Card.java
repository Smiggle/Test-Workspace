package Chapter_3;

public class Bingo_Card {

	public static void main(String[] args) {
		
		// Generates random number
		int a[] = new int[25];
        int y=0,x=0;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                for(;;)
                {
                	
                	// Makes sure there is no repeat numbers
                    x = (int)(Math.random()*25)+1;
                    if(contain(a,x)==false)
                    break;
                }
                
                // Correctly spaces out the numbers
                a[y++] = x;
                if(x<10)
                System.out.print(x+"  ");
                else
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
	
	// not too sure what this does
   public static boolean contain(int a[],int x)
    {
        boolean res = false;
        for(int i=0;i<a.length;i++)
        if(a[i]==x)
        res = true;
        return res;
    }

}
