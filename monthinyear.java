
public class monthinyear {
	
	 public static boolean isLeapYear(int year){
	        if(year >=1 && year<=9999){
	            if((year%400==0)||(year%100!=0&&year%4==0)){
	                return true;
	            }else 
	            return false;
	            
	            
	        }else{
	            return false;
	        }
	    }
	    public static int getDaysInMonth(int month,int year){
	        if((month<1||month>12) || (year<1 || year >9999)){

	        boolean LeapYear = isLeapYear(year);
	        switch(month){
	            case 1,3,5,7,8,10,12:
	                return 31;
	            
	            case 2:
	                if(LeapYear==true){
	                    return 29;
	                }else
	                return 28;
	           
	            case 4,6,9,11 :
	                return 31;
	            
	            
	            default :
	            return -1;
	            
	                
	            }//switch
	        }//if
			return year;
	    }    
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
