
public class employeecomp implements Comparable<employeecomp> { // comparable is interface
	private String name;
	private int id;
	static String k= "hi";
	static String h="hello";
	public employeecomp(String name, int id) {
		this .name = name; 
		this.id = id;
	}
	public String getname() {
		return name;
	}
	public int getid() {
		return id;
	}
	public boolean equals(employeecomp emp) {
		return this.getname()==emp.getname();
	}

	@Override
	public int compareTo(employeecomp o) {
		// by id
		employeecomp e= (employeecomp) o;
		if(getid() > e.getid()) {
			return 1;
		}else if(getid()  < e.getid()) {
			return -1;
		}else {
			return 0;}
		
	}
	
	public int compareTo1(employeecomp o) {
		// by name
		
		if(getname().compareTo(o.getname())>0) {
			return 1;
		}else if(getname().compareTo(o.getname())<0) {
			return -1;
		}else {
			return 0;}
		
	}
	
		
	
	
	 
	 
	
	public static void main(String[] args) {
		
		employeecomp e1 = new employeecomp(" muttum venkata yamini",9);
		employeecomp e2 = new employeecomp("hareesh",8);
		
		System.out.println(" by id: "+e1.compareTo(e2));
		System.out.println(" by name : "+e1.compareTo1(e2));
		
		
		
		/*
		 * int know = e1.compareTo(e2); if(know < 0) {
		 * System.out.println(" first object is less than second object "+ know); }else
		 * if(know > 0) {
		 * System.out.println(" first object is greater than second object "+ know);
		 * }else { System.out.println(" first object is equal to second object "+ know);
		 * }
		 */

	}
	

}
