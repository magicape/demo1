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
				System.out.printf("û�иù���,������ѡ���ܣ�");
				what=0;
			}
		}
		
	}
	//CompareTo();�ַ����Ƚ�;
	//String comparact();
	//append
	static double save_max=0.0;
	static int usersum=0;
	static User1 user1=new User1();
	/*
	 * ���ݳ�ʼ��
	 */
	public static void start() {
		user1.user[usersum][0]="admin";
		user1.user[usersum][1]="����Ա";
		user1.user[usersum][2]="666666";
		user1.user[usersum][3]="�޴�����";
		user1.money[usersum]=999999.0;
		usersum+=1;
		
		user1.user[usersum][0]="1234567890";
		user1.user[usersum][1]="����";
		user1.user[usersum][2]="999999";
		user1.user[usersum][3]="�ĺ�Ϊ��";
		user1.money[usersum]=1000.0;
		usersum+=1;
		
	}
	/*
	 * ���˵���
	 */
	public static void menu1() {
		System.out.printf("******һ����½�˺�******\n");
		System.out.printf("******�����û�ע��******\n");
		System.out.printf("��ѡ���ܣ�");
	}
	/*
	 * �û��˵���
	 * ��ѯ��ȡ�ת�ˣ���Ǯ���޸����룬
	 */
	public static void menu2(int f) {
		System.out.printf("******һ����ѯ���******\n");
		System.out.printf("******������       ��******\n");
		System.out.printf("******����ȡ       ��******\n");
		System.out.printf("******�ġ�ת       ��******\n");
		System.out.printf("******�塢�޸�����******\n");
		System.out.printf("******�����˳���½******\n");
		System.out.printf("******�ߡ��˳�ϵͳ******\n");
		select_menu(f);
	}
	/*
	 * �û�����ѡ��
	 */
	public static void select_menu(int f) {
		Scanner enter3=new Scanner(System.in);
		int what=-1;
		System.out.printf("��ѡ�����");
		while(true){
			int select=enter3.nextInt();
			switch(select) {
			case 1:balance(f);back_exit(f);break;		//��ѯ
			case 2:save_money(f);back_exit(f);break;	//��Ǯ
			case 3:out_money(f);back_exit(f);break;		//ȡǮ
			case 4:give_money(f);back_exit(f);break;	//ת��
			case 5:re_pass_word(f);back_exit(f);break;	//������
			case 6:break;								//�˳���½
			case 7:System.exit(0);						//�˳�ϵͳ
			default:
				System.out.printf("û�и������������ѡ�����");
				what=0;
			}
			if(what!=0) {
				break;
			}
			
		}
	
	}
	/*
	 * ��ѯ���
	 */
	public static void balance(int f) {
		System.out.printf("���ĵ�ǰ���Ϊ%fԪ\n",user1.money[f]);
	}
	/*
	 * ���
	 */
	public static void save_money(int f) {
		Scanner enter3=new Scanner(System.in);
		System.out.printf("�������");
		while(true) {
			double save=enter3.nextDouble();
			if(save+save_max<1000||save+save_max>10000) {
				System.out.printf("�Բ���ÿ���޶���1000-10000Ԫ�������´��\n");
				
			}else {
				save_max+=save;
				user1.money[f]+=save;
				break;
			}
		}
		System.out.printf("���ɹ�������\n");
	}
	/*
	 * ȡ��
	 */
	public static void out_money(int f) {
		Scanner enter3=new Scanner(System.in);
		System.out.printf("������ȡ���");
		while(true) {
			double save=enter3.nextDouble();
			if(save+save_max<0||user1.money[f]-save<0) {
				System.out.printf("�Բ����������㣬������ȡ��\n");
				
			}else {
				user1.money[f]-=save;
				break;
			}
		}
		System.out.printf("ȡ��ɹ�������\n");
	}
	/*
	 * ת��
	 */
	public static void give_money(int f) {
		Scanner enter3=new Scanner(System.in);
		int f2=-1,what=-1;
		int i;
		System.out.printf("������ת�����˺ţ�");
		while(true) {
			String user_id =enter3.nextLine();
			for(i=0;i<usersum;i++) {
				if(user_id.equals(user1.user[i][0])) {
					f2=i;
					what=1;
				}
			}
			if (i==usersum-1&&f2==-1) {
				System.out.printf("���޴��ˣ����������룺");
			}
			if (what==1) {
				break;
			}
		}
		System.out.printf("������ת�˽�");
		while(true) {
			double save=enter3.nextDouble();
			if(save+save_max<0||user1.money[f]-save<0) {
				System.out.printf("�Բ����������㣬������ת��\n");
				
			}else {
				user1.money[f]-=save;
				user1.money[f2]+=save;
				break;
			}
		}
		System.out.printf("ת�˳ɹ�������\n");
	}
	/*
	 * �޸�����
	 */
	public static void re_pass_word(int f) {
		Scanner enter=new Scanner(System.in);
		String mima1="A",mima2="B";
		while(true) {
			System.out.printf("���������룺");
			mima1=enter.nextLine();
			System.out.printf("��ȷ�����룺");
			mima2=enter.nextLine();
			if(mima1.equals(mima2)) {
				break;
			}
		}
		user1.user[f][2]=mima2;//ȷ������
	}
	/*
	 * �˳�/������һ��
	 */
	public static int back_exit(int f) {
		Scanner enter3=new Scanner(System.in);
		int select;
		int what=-1;
		System.out.printf("******һ������******\n");
		System.out.printf("******�����˳�******\n");
		System.out.printf("��ѡ��");
		while(true) {
			select=enter3.nextInt();
			switch(select) {
			case 1:menu2(f);break;
			case 2:System.out.printf("�˳�ϵͳ�ɹ���ף��������죡\n");System.exit(0);break;
			default:
				System.out.printf("û�иù��ܣ�������ѡ��\n");
				what=0;
			}
			if(what!=0) {
				break;
			}
		}
		return 0;
		
	}
	/*
	 * �û�ע��
	 */
	public static int zhuce(){
		String mima1="A";
		String mima2="A";
		Scanner enter=new Scanner(System.in);
		if(usersum>19) {
			System.out.printf("�û������ˣ�����ע��\n");
			return 0;
		}
		System.out.printf("�������������֣�");
		user1.user[usersum][1]=enter.nextLine();//��������

		System.out.printf("�������ַ��");
		user1.user[usersum][3]=enter.nextLine();//�����ַ
		
		int number=100000000+(int)(Math.random()*(999999999-100000000+1));
		user1.user[usersum][0] = Integer.toString(number);
		System.out.printf("�����˺�Ϊ��%s\n",user1.user[usersum][0]);
		System.out.printf("!!!���ס�����˺�!!!\n");
		
		while(true) {
			System.out.printf("���������룺");
			mima1=enter.nextLine();
			System.out.printf("��ȷ�����룺");
			mima2=enter.nextLine();
			if(mima1.equals(mima2)) {
				break;
			}
		}
		user1.user[usersum][2]=mima2;//ȷ������
		user1.money[usersum]=0.0;
		usersum+=1;
		return 0;
	}
	
	/*
	 * �û���½
	 */
	public static int login() {
		Scanner enter1=new Scanner(System.in);
		int i,f=0,what=-1;
		System.out.printf("�������˺ţ�");
		String user_id =enter1.nextLine();
		for(i=0;i<usersum;i++) {
			if(user_id.equals(user1.user[i][0])) {
				f=i;
			}
		}
		System.out.printf("���������룺");
		String pass_word1=enter1.nextLine();
		if(pass_word1.equals(user1.user[f][2])) {
			System.out.printf("��½�ɹ�(=^��^=)\n��ӭ�𾴵�%s�û�\n�ȷ��������Ϊ������(=^��^=)\n",user1.user[f][1]);
			what=1;
		}
		else {
			System.out.printf("�Բ�������������˺Ų���ȷ�����������룡\n");
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
//�û���
class User1{
	String[][] user=new String[20][4];//�û�id���û��������룬סַ
	double[] money=new double[20];
}
//������
class Bank1{
	String bank_name;
	String band_add;
}