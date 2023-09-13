
import java.util.Scanner;
public class numberReverse {
    public static void main(String []args)
    {
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter the number");
    	int number=s.nextInt();
    	int temp=number;
    	int total=0;
    	while(number>0)
    	{
    		int lastvalue=number%10;
    		 total=total*10+lastvalue;
    		  number=number/10;
    		
    	}
    	if(temp==total)
    	System.out.println("polindram");
    	
    	else
    	System.out.println("not polindram");
    	
    }
}
