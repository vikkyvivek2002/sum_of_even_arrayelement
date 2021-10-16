import java.util.*;
public class sum_of_even_arrayelements {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number of elemnts");
		int  n = s.nextInt();
		int ary[] =new int[n];
		System.out.println("enter the vallues of the array ");
		for(int i = 0;i<n;i++)
		{
			ary[i] = s.nextInt();
		}
				
		int sum = 0;
		int d=0;
		for(int i=0; i<n ;i++)
		{
			if(ary[i]%2 == 0 && ary[i] != 0)
				{
				  sum = sum + ary[i];
			      d++;
			    }
		}
		
		int avg = sum/d;
		System.out.println("the avarag value is ");
		System.out.println(avg);
	}

}
