package ceshi;
import java.util.Scanner;
public class ceshidaima {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ft=-100,sd=-100;
		int i;
		Scanner p=new Scanner(System.in);
		for(i=0;true;i++) {
			
			if(ft>-100&&ft<100) {
				break;
			}
			else {
				if(i==0)System.out.printf("请输入第一个两位数:");
				else System.out.printf("输入不规范，请重新输入第一个两位数:");
				 ft=p.nextInt();
			}
		}
				
		for(i=0;true;i++) {
			
			if(sd>-100&&sd<100) {
				break;
			}
			else {
				if(i==0)System.out.printf("请输入第二个两位数:");
				else System.out.printf("输入不规范，请重新输入第二个两位数:");
				 sd=p.nextInt();
			}
		}
		char c='A';
		for(i=0;true;i++) {
			
			if(c=='+'||c=='-'||c=='*'||c=='/')
				break;
			else {
				if(i==1)System.out.printf("请输入运算符:");
				else System.out.printf("输入不规范，请重新输入运算符:");
			 c=p.next().charAt(0);
			}
		}
			if(c=='+')
	  System.out.println("和:"+(ft+sd));
			else if(c=='-')
	  System.out.println("差:"+(ft-sd));
			else if(c=='*')
	  System.out.println("积:"+(ft*sd));
			else if(c=='/')
	  System.out.println("商:"+(ft/sd));
		
			
		
  
	}
	}

