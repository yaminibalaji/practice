import java.util.Scanner;

public class Palindrome {
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int last,first,rev = 0;
				
		for(int i=n; n>0;i++) {
			last=n%10;
			rev= rev*10+last;
			n=n/10; 	
		}
		System.out.println(rev);
		
	}

}
