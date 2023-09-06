package power;
import java.util.*;
public class Power {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the base : "  );
		int base=sc.nextInt();
		
		System.out.println("Enter the Power : "  );
		int power=sc.nextInt();
//		int base=6;
//		int power=-2;
		double result=1;
		if(power<0)
		{
			int a=power;
			a=-a;
			for(int i=1;i<=a;i++)
				{
				result=result*base;
			
			
				}
		result=1/result;
		System.out.println(result);
		}
		else
				for(int i=1;i<=power;i++)
				{
					result=result*base;
						
				}
				System.out.println(result);
		// TODO Auto-generated method stub

	}

}
