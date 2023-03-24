import java.util.Arrays;
import java.util.Scanner;

public class orderalpha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		char[] ch1=s.toCharArray();
		Arrays.sort(ch1);
		String st1=new String(ch1);
		
		System.out.println(st1);	
			}
	}

	

