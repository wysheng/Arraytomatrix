import java.util.Scanner;


public class arrayTest {
	public static void main(String[] args) {
//Scanner��Ҫ�����Ǽ��ı�ɨ�裬��ͨ��new Scanner(System.in)����һ��Scanner������̨��һֱ�ȴ����룬ֱ���ûس���������
//������������ݴ���Scanner����Ϊɨ��������Ҫ��ȡ��������ݣ���ֻ��Ҫ����Scanner��nextLine()�������ɡ�
		Scanner s = new Scanner(System.in);
		System.out.println("��������������������");
		int x = s.nextInt();//�ɼ�������һ������
		int y = s.nextInt();
		int [][]awarry = new int[x][y];//��ʼ������
		System.out.println("����������Ԫ�أ�");
		for(int i = 0;i<x;i++) //ѭ������
			for(int j=0;j<y;j++)
				awarry[i][j]=s.nextInt();//ÿ������һ������Ҫ��tab����һ��������������س�������ȷ���������
				
			
			System.out.println("�����������ת��Ϊ�����ǣ�");
				for(int i1 =0;i1<x;i1++){//ѭ�����
					for(int j1=0;j1<y;j1++)
						System.out.print(awarry[i1][j1]+"\t");
						
					
					System.out.println();//ÿ�����Ҫ����
				}
				
			
		
	
	}
		
	}


