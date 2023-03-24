
public class overload {
	void sum(int a,int b) {
		System.out.println(a+b);
	}
	public int sum(int a,int b,int c) {
		return a+b+c;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overload a= new overload();
		a.sum(8, 9);
		System.out.println(a.sum(9, 10, 30));

	}

}
