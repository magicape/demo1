package ceshi;

import java.util.*;

public class java_1116_work {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner enter=new Scanner(System.in);
		int enter_menu;
		int what=-1;
		start();
		
		while(true){
			menu1();
			enter_menu=enter.nextInt();
			switch(enter_menu) {
			case 1:login();break;
			case 2:zhuce();menu1();break;
			default:
				System.out.printf("没有该功能,请重新选择功能：");
				what=0;
			}
		}
		
	}
	//CompareTo();字符串比较;
	//String comparact();
	//append
	static double save_max=0.0;
	static int usersum=0;
	static User1 user1=new User1();
	/*
	 * 数据初始化
	 */
	public static void start() {
		user1.user[usersum][0]="admin";
		user1.user[usersum][1]="管理员";
		user1.user[usersum][2]="666666";
		user1.user[usersum][3]="无处不再";
		user1.money[usersum]=999999.0;
		usersum+=1;
		
		user1.user[usersum][0]="1234567890";
		user1.user[usersum][1]="穷人";
		user1.user[usersum][2]="999999";
		user1.user[usersum][3]="四海为家";
		user1.money[usersum]=1000.0;
		usersum+=1;
		
	}
	/*
	 * 主菜单栏
	 */
	public static void menu1() {
		System.out.printf("******一、登陆账号******\n");
		System.out.printf("******二、用户注册******\n");
		System.out.printf("请选择功能：");
	}
	/*
	 * 用户菜单栏
	 * 查询，取款，转账，存钱，修改密码，
	 */
	public static void menu2(int f) {
		System.out.printf("******一、查询余额******\n");
		System.out.printf("******二、存       款******\n");
		System.out.printf("******三、取       款******\n");
		System.out.printf("******四、转       账******\n");
		System.out.printf("******五、修改密码******\n");
		System.out.printf("******六、退出登陆******\n");
		System.out.printf("******七、退出系统******\n");
		select_menu(f);
	}
	/*
	 * 用户功能选择
	 */
	public static void select_menu(int f) {
		Scanner enter3=new Scanner(System.in);
		int what=-1;
		System.out.printf("请选择服务：");
		while(true){
			int select=enter3.nextInt();
			switch(select) {
			case 1:balance(f);back_exit(f);break;		//查询
			case 2:save_money(f);back_exit(f);break;	//存钱
			case 3:out_money(f);back_exit(f);break;		//取钱
			case 4:give_money(f);back_exit(f);break;	//转账
			case 5:re_pass_word(f);back_exit(f);break;	//改密码
			case 6:break;								//退出登陆
			case 7:System.exit(0);						//退出系统
			default:
				System.out.printf("没有该项服务，请重新选择服务：");
				what=0;
			}
			if(what!=0) {
				break;
			}
			
		}
	
	}
	/*
	 * 查询余额
	 */
	public static void balance(int f) {
		System.out.printf("您的当前余额为%f元\n",user1.money[f]);
	}
	/*
	 * 存款
	 */
	public static void save_money(int f) {
		Scanner enter3=new Scanner(System.in);
		System.out.printf("请输入存款：");
		while(true) {
			double save=enter3.nextDouble();
			if(save+save_max<1000||save+save_max>10000) {
				System.out.printf("对不起，每日限额存款1000-10000元，请重新存款\n");
				
			}else {
				save_max+=save;
				user1.money[f]+=save;
				break;
			}
		}
		System.out.printf("存款成功！！！\n");
	}
	/*
	 * 取款
	 */
	public static void out_money(int f) {
		Scanner enter3=new Scanner(System.in);
		System.out.printf("请输入取款金额：");
		while(true) {
			double save=enter3.nextDouble();
			if(save+save_max<0||user1.money[f]-save<0) {
				System.out.printf("对不起，您的余额不足，请重新取款\n");
				
			}else {
				user1.money[f]-=save;
				break;
			}
		}
		System.out.printf("取款成功！！！\n");
	}
	/*
	 * 转账
	 */
	public static void give_money(int f) {
		Scanner enter3=new Scanner(System.in);
		int f2=-1,what=-1;
		int i;
		System.out.printf("请输入转账人账号：");
		while(true) {
			String user_id =enter3.nextLine();
			for(i=0;i<usersum;i++) {
				if(user_id.equals(user1.user[i][0])) {
					f2=i;
					what=1;
				}
			}
			if (i==usersum-1&&f2==-1) {
				System.out.printf("查无此人，请重新输入：");
			}
			if (what==1) {
				break;
			}
		}
		System.out.printf("请输入转账金额：");
		while(true) {
			double save=enter3.nextDouble();
			if(save+save_max<0||user1.money[f]-save<0) {
				System.out.printf("对不起，您的余额不足，请重新转账\n");
				
			}else {
				user1.money[f]-=save;
				user1.money[f2]+=save;
				break;
			}
		}
		System.out.printf("转账成功！！！\n");
	}
	/*
	 * 修改密码
	 */
	public static void re_pass_word(int f) {
		Scanner enter=new Scanner(System.in);
		String mima1="A",mima2="B";
		while(true) {
			System.out.printf("请输入密码：");
			mima1=enter.nextLine();
			System.out.printf("请确认密码：");
			mima2=enter.nextLine();
			if(mima1.equals(mima2)) {
				break;
			}
		}
		user1.user[f][2]=mima2;//确认密码
	}
	/*
	 * 退出/返回上一级
	 */
	public static int back_exit(int f) {
		Scanner enter3=new Scanner(System.in);
		int select;
		int what=-1;
		System.out.printf("******一、返回******\n");
		System.out.printf("******二、退出******\n");
		System.out.printf("请选择：");
		while(true) {
			select=enter3.nextInt();
			switch(select) {
			case 1:menu2(f);break;
			case 2:System.out.printf("退出系统成功，祝您生活愉快！\n");System.exit(0);break;
			default:
				System.out.printf("没有该功能，请重新选择\n");
				what=0;
			}
			if(what!=0) {
				break;
			}
		}
		return 0;
		
	}
	/*
	 * 用户注册
	 */
	public static int zhuce(){
		String mima1="A";
		String mima2="A";
		Scanner enter=new Scanner(System.in);
		if(usersum>19) {
			System.out.printf("用户库满了，不能注册\n");
			return 0;
		}
		System.out.printf("请输入您的名字：");
		user1.user[usersum][1]=enter.nextLine();//输入姓名

		System.out.printf("请输入地址：");
		user1.user[usersum][3]=enter.nextLine();//输入地址
		
		int number=100000000+(int)(Math.random()*(999999999-100000000+1));
		user1.user[usersum][0] = Integer.toString(number);
		System.out.printf("您的账号为：%s\n",user1.user[usersum][0]);
		System.out.printf("!!!请记住您的账号!!!\n");
		
		while(true) {
			System.out.printf("请输入密码：");
			mima1=enter.nextLine();
			System.out.printf("请确认密码：");
			mima2=enter.nextLine();
			if(mima1.equals(mima2)) {
				break;
			}
		}
		user1.user[usersum][2]=mima2;//确认密码
		user1.money[usersum]=0.0;
		usersum+=1;
		return 0;
	}
	
	/*
	 * 用户登陆
	 */
	public static int login() {
		Scanner enter1=new Scanner(System.in);
		int i,f=0,what=-1;
		System.out.printf("请输入账号：");
		String user_id =enter1.nextLine();
		for(i=0;i<usersum;i++) {
			if(user_id.equals(user1.user[i][0])) {
				f=i;
			}
		}
		System.out.printf("请输入密码：");
		String pass_word1=enter1.nextLine();
		if(pass_word1.equals(user1.user[f][2])) {
			System.out.printf("登陆成功(=^ω^=)\n欢迎尊敬的%s用户\n先锋测试银行为您服务(=^ω^=)\n",user1.user[f][1]);
			what=1;
		}
		else {
			System.out.printf("对不起，您的密码或账号不正确，请重新输入！\n");
			what=0;
		}
		if(what==0) {
			login();
		}
		menu2(f);
		return f;
	}
	
	public static void out() {
		int i;
		for(i=0;i<4;i++) {
			System.out.println(user1.user[1][i]);
		}
		
	}

}
//用户类
class User1{
	String[][] user=new String[20][4];//用户id，用户名，密码，住址
	double[] money=new double[20];
}
//银行类
class Bank1{
	String bank_name;
	String band_add;
}