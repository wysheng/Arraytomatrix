import java.util.Scanner;


public class arrayTest {
	public static void main(String[] args) {
//Scanner主要功能是简化文本扫描，当通过new Scanner(System.in)创建一个Scanner，控制台会一直等待输入，直到敲回车键结束，
//把所输入的内容传给Scanner，作为扫描对象。如果要获取输入的内容，则只需要调用Scanner的nextLine()方法即可。
		Scanner s = new Scanner(System.in);
		System.out.println("请输入数组行数和列数");
		int x = s.nextInt();//由键盘输入一个整数
		int y = s.nextInt();
		int [][]awarry = new int[x][y];//初始化数组
		System.out.println("请输入数组元素：");
		for(int i = 0;i<x;i++) //循环输入
			for(int j=0;j<y;j++)
				awarry[i][j]=s.nextInt();//每次输入一个数需要按tab键算一次输入结束，按回车键算是确认整体结束
				
			
			System.out.println("你输入的数组转换为矩阵是：");
				for(int i1 =0;i1<x;i1++){//循环输出
					for(int j1=0;j1<y;j1++)
						System.out.print(awarry[i1][j1]+"\t");
						
					
					System.out.println();//每次输出要换行
				}
				
			
		
	
	}
		
	}


