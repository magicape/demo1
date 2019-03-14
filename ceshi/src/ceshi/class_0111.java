package ceshi;

public class class_0111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		d c3=new d("1");
	}

}
class d{
	String c="2";
	public d() {
		try {
			Class cls=Class.forName("com.ywq.Son");
			c son=(c) cls.newInstance();
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(c);
	}
	
	public d(String c) {
		this();
		
	}
}
class c extends d{
	public c() {
		super.c="3";
		System.out.println("5");
	}
}