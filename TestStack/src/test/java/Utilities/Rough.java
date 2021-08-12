package Utilities;

public class Rough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;  
		for(int i=1;i<=n;i++)
		    {
		    if((n%3==0) && (n%5==0))
		        {
		            System.out.println("FizzBuzz");
		        }
		     else if((n%3==0) && (n%5!=0))
		     {
		         System.out.println("Fizz");
		     }
		     else if((n%3!=0) && (n%5==0))
		     {
		         System.out.println("Buzz");
		     }
		     else
		     {
		         System.out.println(n);
		     }
		    }


	}

}
