package ceshi;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class java11_14 {

	public static void Xingzuo(int year,int month,int day) {
		// TODO Auto-generated method stub
		if (year > 0 && month > 0 && month < 13 && day > 0 && day < 32) {
			while(month==1&&day>20||month==2&&day<18) {
				System.out.println("ˮƿ��");
				System.out.println("˼�볬ǰ���������ص�������һ���Ĳ�����Լ����һ���Ĳ����������ǻ��ǲ�ͬ��������"
						+ "���ǽ�����춾����ε��������Ǻܺõ���������");
				break;
			}
			while(month==2&&day>19||month==2&&day<20) {
				System.out.println("˫����");
				System.out.println("������У������Ρ�������������������飬ʹ���ǳ�Ϊ���������������Ĳ������Ҳ���Ѳ��˹�ϵ��"
						+ "������������������ϲ�����ף�Ҳ�����������ˡ�");
				break;
			}
			while(month==3&&day>21||month==4&&day<19) {
				System.out.println("������");
				System.out.println("������ʢ�����������������"
						+ "�Ը��밮����������ֱײ����");
				break;
		}
			while(month==4&&day>20||month==5&&day<20) {
				System.out.println("��ţ��");
				System.out.println("����˹����������������ǿ��Ǻ��ٹ��ˣ����ڴ�������ͣ���˼Ҳ�Ƚ�����"
						+ "�����г��˵��ȶ��ԣ�һ���¶�ע�����а���Ӯ��");
				break;
		}
			while(month==5&&day>21||month==6&&day<21) {
				System.out.println("˫����");
				System.out.println("�仯�ٶȿ�����������˫�ӵ�˫���Ը񳣸�ı��˺��Լ�ͷʹ��֣�������ҵ�밮�飬����϶໨����˼��Ӫ��"
						+ "Ӧ�û��Ǻܺõģ���...����ʵ����̫�����ˡ�");
				break;
		}
			while(month==6&&day>22||month==7&&day<22) {
				System.out.println("��з��");
				System.out.println("�ǳ���Ҫ���밲���������������ɵĸ��ԣ�ʹ������������;�ϴ����Ե�ȱ����ȫ�С�"
						+ "���Ǵ���ĸ����Եľ�з��Ϊ�����������ĸ���Ը�ĸ�����");
				break;
		}
			while(month==7&&day>23||month==8&&day<22) {
				System.out.println("ʨ����");
				System.out.println("�������ɻ�����������ʨ����ɭ��֮����������Ȼϲ���������飬��Щ�Ͳ�ס��į��"
						+ "�����г徢����Ȼ��֦��Ҷ����Ϊ�˽�������Ҳ������Ե\"");
				break;
		}
			while(month==8&&day>23||month==9&&day<22) {
				System.out.println("��Ů��");
				System.out.println("�е�������׷��������������ȱ�����ĵĸ��ԣ�����Ǳ��ʶ������Լ��������ã�"
						+ "��Ȼ�����ʹ������أ����������ŵ���Ƿŵÿ�������ʹ�һ�겻��");
				break;
		}
			while(month==9&&day>23||month==10&&day<23) {
				System.out.println("�����");
				System.out.println("�������¿����������ƾ���������⽻���죬���ڸ�ɫ����֮������������ʱҲ����Ϊ���ڹ�������㵽��"
						+ "������Լ��������ֺã��Խ��ת��תȥ��������˥����");
				break;
		}
			while(month==10&&day>24||month==11&&day<22) {
				System.out.println("��Ы��");
				System.out.println("���ع��ܣ����˷��ɲµ����������ǿ��Ժ�ִ����Ҳ���Ժ��ƻ����ڰ���Ĺ�����ڰ׷�����"
						+ "û�л�ɫ�ش������Ƕ���Լ���Ŀ���൱�����һ��ȷ������ǰ�塣");
				break;
		}
			while(month==11&&day>23||month==12&&day<21) {
				System.out.println("������");
				System.out.println("��������Ҳ�����������������Լ���ĸ���ʹ���Ǻ��±����󣬶��������Ҳʹ�����Ĵ�Ѱ�����"
						+ "�������棬����������Ҳ���Ծ��������ǡ���������ȥ�ɣ�");
				break;
		}
			while(month==12&&day>23||month==1&&day<19) {
				System.out.println("Ħ����");
				System.out.println("�Ͻ��̰壬�����ϳɵ���������Ȼ����һ����˴����ӡ�󣬵��Ǵ�������ձ�˵����̫ˣ������"
						+ "����������ҵ�����ϣ�����Ҳ��������������ʻ�ʤ��");
				break;
		}
			}else {
			System.out.printf("�����������!");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sy = new Scanner(System.in);
		System.out.print("��������ݣ�");
		int year = sy.nextInt();
		System.out.print("�������·ݣ�");
		int month = sy.nextInt();
		System.out.print("�������գ�");
		int day = sy.nextInt();
		Xingzuo(year,month,day);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//�������ڸ�ʽ
		System.out.println(df.format(new Date()));// new Date()Ϊ��ȡ��ǰϵͳʱ��
		} 
	}
