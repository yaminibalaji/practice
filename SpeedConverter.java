
public class SpeedConverter {
	 public  long toMilesPerHour(double kilometersPerHour)
	    {
	        if (kilometersPerHour<0){
	            return -1;
	        }
	        else{
	        	long l =(long) Math.round(kilometersPerHour);
	            long toMilesPerHour = Math.round(kilometersPerHour*0.621);
	            return toMilesPerHour;
	        }
	    }
	    public  void printConversion(double kilometersPerHour){
	        if(kilometersPerHour<0){
	            System.out.println("Invalid Value");
	        }
	        else{
	        	int m=(int) Math.round(kilometersPerHour * 0.621);
	             double l = kilometersPerHour;
	         System.out.println(l +" km/h = "+ m +" mi/h");
	        }
	        
	    }
        
    
    public static void main(String args[]) {
    	SpeedConverter s= new SpeedConverter();
    	s.toMilesPerHour(1.25);
    	s.printConversion(95.75);
    	
    	
   
    }
}
