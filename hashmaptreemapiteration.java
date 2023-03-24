import java.util.*;
import java.util.Map.Entry;



public class hashmaptreemapiteration {
	public void hasmape() {
		HashMap<Integer,String> m = new HashMap<Integer, String>();
		m.put(1,"yamini");
		m.put(3,"hareesh");
		m.put(2,"advi");
		m.put(4,"abhai");
		System.out.println(m);// to display 
		// for iteration 
		m.forEach((key, value)-> System.out.println(key + " = " + value));
		for(Entry<Integer, String> h:m.entrySet()) {
			System.out.print(" "+h.getKey()+" : "+h.getValue());
		}// for
	}// method 1
	public void treeemap() {
		TreeMap< Integer,String> u = new TreeMap<Integer,String>();
		u.put(1," Treemap ");
		u.put(3," Deepali ");
		u.put(2," harsh");
		System.out.println(u);
		for(Map.Entry m:u.entrySet()) {
			System.out.println(m.getKey()+ " "+ m.getValue());
		}
		
		
		
	}//treeemap()
	
	public static void main(String args[]) {
		hashmaptreemapiteration h = new hashmaptreemapiteration();
		h.hasmape();
		System.out.println("  ");
		System.out.println(" **** *****");
		h.treeemap();
		
	}

}
