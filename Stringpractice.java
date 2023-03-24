import java.util.Arrays;
import java.util.Scanner;

public class Stringpractice {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str = sc.nextLine();
		String[] array=str.split(" ");
		Arrays.sort(array);
		
		
		for(int i=0;i<array.length;i++) {
			
			if(i<array.length-1 && array[i]== array[i+1]) {
				
				continue;
				
			}
			else {
				System.out.println(array[i]);	
			
			}
				
			}
			
			
		}
	}

	
	


