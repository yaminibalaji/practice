
 class  version2 {
	void feature(){
		System.out.println("old version");
		
	}
	
}
 class overriding extends version2{
	void feature(){
		System.out.println(" version 2  ");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overriding s = new overriding();
		s.feature();
		

	}

}
