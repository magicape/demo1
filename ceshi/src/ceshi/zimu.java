package ceshi;

import java.util.Random;
import java.util.Scanner;

public class zimu {
public static void main(String[] args) {
/*
 //**************************************打印乘法表
	int i,j;
	for(i=1;i<=9;i++)
	{
		System.out.printf("\n");
		for(j=1;j<=i;j++)
		{
			
			System.out.printf("\t%d * %d = %d",j,i,i*j);
		}
	}
*/
	
	/*
	// * ***************************打印100-200之间的数字和
	int i,sum=0;
	for(i=100;i<=200;i++)
	{
		sum=sum+i;
	}
	System.out.printf("%d",sum);
	*/
	
/*
// * ******************************************生成随机字母
	int number=91;
	while(true)
	{
		if(number>90&&number<97)
		{
			number=65+(int)(Math.random()*(122-65+1));
			//System.out.printf("%d\n",number);
		}
		else break;
	}
	System.out.printf("%c\n",number);
	if(number<=90) {
		number+=32;
	}
	else {
		number-=32;
	}	
	System.out.printf("%c",number);
*/
	
	
/*
 * ****************************************排序
    int[] arr= {1,2,3,4};
for(int i =0;i<arr.length-1;i++)  
{           
for(int j=0;j<arr.length-i-1;j++)  
{               
if(arr[j]<arr[j+1]) 
{                    
int temp = arr[j];     
 arr[j]=arr[j+1];                                  
 arr[j+1]=temp;           
}  
}  
}
int i;
for(i=0;i<4;i++) {
	System.out.printf("%d\t",arr[i]);
}
*/
	
	
	/*
	 //***********************************编写程序，对输入的一个整数，按相反顺序输出该数
	Scanner number=new Scanner(System.in);
	System.out.printf("请输入：");
	int enternumber=number.nextInt();
	int[] arr=new int[20]  ;
	int i=0,j=0;
	while(i<20)
	{
		arr[i++]=enternumber%10;
		enternumber/=10;
		if(enternumber==0)
			break;
	}
	for(j=0;j<i;j++)
		System.out.printf("%d",arr[j]);
	*/
	
	/*
	//************************用 while 循环，计算 1~200 之间所有 3 的倍数之和
	int i,sum=0;
	for(i=1;i<=200;i++)
	{
		if(i%3==0)
		sum+=i;
	}
	System.out.printf("%d",sum);
	
	*/
	
	
	
	/*
	//编写程序，从键盘输入一个 0~99999 之间的任意数，判断输入的数是几位数？
	Scanner number=new Scanner(System.in);
	System.out.printf("请输入：");
	int enternumber=number.nextInt();
	int[] arr=new int[20]  ;
	int i=0;
	while(i<20)
	{
		enternumber/=10;
		i++;
		if(enternumber==0)
			break;
	}
	System.out.printf("这是%d位数",i);
	*/
	int i=4,n;
	n=(int) Math.pow(10,i-3);
	System.out.printf("%d",n);
	
}
}
