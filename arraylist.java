import java.util.*;

public class arraylist {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(new Integer(1));
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		System.out.println(arr);
		
		for(int k :arr) {
			System.out.print(k);
		}
		
		System.out.println();
		for (int i=arr.size()-1;i>=0;i--) {
			System.out.print(arr.get(i));
		}
		System.out.println();
		System.out.println(" converting array to Arraylist ");
		
		String[] arrl = {"Rahul", "Utkarsh",
                "Shubham", "Neelam"};

		/*try {
		List al = Arrays.asList(geeks);
		System.out.println(al);
		al.add("Shashank");
		al.add("Nishant");     // java.lang.UnsupportedOperationException

		System.out.println(al);}
		catch(Exception e) {
			System.out.println(e);
		}*/
		List<String> al =  new ArrayList<String>(Arrays.asList(arrl));
		System.out.println(al);
		al.add("Shashank");
		al.add("Nishant"); 
		al.remove("Utkarsh");
		System.out.println(al);
		
		 String[] item = al.toArray(new String[al.size()]); 
		 for(String s : item){  
	            System.out.print(s+" ");  
	        }  
		
		

	}

}
