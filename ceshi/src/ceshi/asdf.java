package ceshi;

public class asdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max,a=3,b=4,c=2;
		max=a;
		if(max<b) {
			max=b;
			if(max<c)
				max=c;
		}
		else {
			if(max<c) 
			max=c;
		}
		System.out.println(max);
	}

}
