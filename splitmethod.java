
public class splitmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "yamini balaji is working in hcl";
		String s[] = str.split("\\s",5);
		for(String h : s) {
			System.out.println(h);
		}

	}

}
