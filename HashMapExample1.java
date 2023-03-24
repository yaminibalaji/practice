import java.util.*;  
public class HashMapExample1{  
 public static void main(String args[]){  
   HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
   map.put(1,"Mango");  //Put elements in Map  
   map.put(2,"Apple");    
   map.put(3,"Banana");   
   map.put(4,"Grapes");
   int count=0;
       
   for(@SuppressWarnings("rawtypes") Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" : "+m.getValue());
    count++;
   } 
   System.out.println("count of words in hashmap : "+count);
   for(int i = 1; i<map.size()+1;i++ ) {
	   System.out.println(map.get(i));
   }
}  
}  