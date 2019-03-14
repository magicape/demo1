package ceshi;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class java11_14 {

	public static void Xingzuo(int year,int month,int day) {
		// TODO Auto-generated method stub
		if (year > 0 && month > 0 && month < 13 && day > 0 && day < 32) {
			while(month==1&&day>20||month==2&&day<18) {
				System.out.println("水瓶座");
				System.out.println("思想超前，理性自重的星座。一样的不爱受约束，一样的博爱，但他们还是不同射手座；"
						+ "他们较著重於精神层次的提升，是很好的启发对象。");
				break;
			}
			while(month==2&&day>19||month==2&&day<20) {
				System.out.println("双鱼座");
				System.out.println("多愁敏感，爱作梦、幻想的星座。天生多情，使他们常为情字挣扎，情绪的波动起伏也跟脱不了关系；"
						+ "但他们生性柔弱，很喜欢奉献，也不会随意伤人。");
				break;
			}
			while(month==3&&day>21||month==4&&day<19) {
				System.out.println("白羊座");
				System.out.println("精力旺盛、活力充沛的星座。"
						+ "性格与爱情多数“横冲直撞”。");
				break;
		}
			while(month==4&&day>20||month==5&&day<20) {
				System.out.println("金牛座");
				System.out.println("慢条斯理的星座。凡事总是考虑后再过滤，属于大器晚成型，情思也比较晚开。"
						+ "他们有超人的稳定性，一旦下赌注，就有把握赢。");
				break;
		}
			while(month==5&&day>21||month==6&&day<21) {
				System.out.println("双子座");
				System.out.println("变化速度快如风的星座。双子的双重性格常搞的别人和自己头痛万分，对于事业与爱情，如果肯多花点心思经营，"
						+ "应该会是很好的，但...他们实在是太机灵了。");
				break;
		}
			while(month==6&&day>22||month==7&&day<22) {
				System.out.println("巨蟹座");
				System.out.println("非常需要爱与安定的星座。爱猜疑的个性，使他们在人生旅途上处处显得缺乏安全感。"
						+ "但是带著母爱光辉的巨蟹，为了所爱倒是心甘情愿的付出。");
				break;
		}
			while(month==7&&day>23||month==8&&day<22) {
				System.out.println("狮子座");
				System.out.println("讲究气派华丽的星座。狮子是森林之王，理所当然喜欢呼朋引伴，有些耐不住寂寞。"
						+ "他们有冲劲，虽然粗枝大叶，但为人讲义气，也蛮有人缘\"");
				break;
		}
			while(month==8&&day>23||month==9&&day<22) {
				System.out.println("处女座");
				System.out.println("有点挑剔又追求完美的星座。缺乏信心的个性，常在潜意识里责怪自己不够美好；"
						+ "虽然难免会使心情沉重，但天生的优点就是放得开，不会就此一蹶不振。");
				break;
		}
			while(month==9&&day>23||month==10&&day<23) {
				System.out.println("天秤座");
				System.out.println("爱美又怕空虚的星座。凭借天生的外交本领，能在各色人物之间周旋；但有时也回因为过于顾虑面面俱到，"
						+ "而搞的自己吃力不讨好，脑筋常常转来转去，当心神经衰弱。");
				break;
		}
			while(month==10&&day>24||month==11&&day<22) {
				System.out.println("天蝎座");
				System.out.println("神秘诡谲，令人费疑猜的星座。他们可以很执著，也可以很破坏；在爱情的国度里黑白分明，"
						+ "没有灰色地带，他们对於自己的目标相当清楚，一旦确立就往前冲。");
				break;
		}
			while(month==11&&day>23||month==12&&day<21) {
				System.out.println("射手座");
				System.out.println("自由浪漫也滥情的星座。不爱受约束的个性使他们很怕被捆绑，多情的天性也使他们四处寻求猎物；"
						+ "性情天真，常会伤了人也不自觉，爱他们～就由他们去吧！");
				break;
		}
			while(month==12&&day>23||month==1&&day<19) {
				System.out.println("摩羯座");
				System.out.println("严谨刻板，稳重老成的星座。虽然他们一向给人呆板的印象，但是呆板的人普遍说来不太耍花样；"
						+ "不管是在事业或爱情上，他们也都以这份特殊气质获胜！");
				break;
		}
			}else {
			System.out.printf("数据输入错误!");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sy = new Scanner(System.in);
		System.out.print("请输入年份：");
		int year = sy.nextInt();
		System.out.print("请输入月份：");
		int month = sy.nextInt();
		System.out.print("请输入日：");
		int day = sy.nextInt();
		Xingzuo(year,month,day);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
		System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
		} 
	}
