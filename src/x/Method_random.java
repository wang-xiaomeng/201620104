package x;

import java.util.Random;
public abstract class Method_random {
		private int n;	
		public Method_random() {
			
		}
//	�����Ӽ��õ��������
	public int TheRandomNumber( ){

		Random random=new Random();
		n=(short)random.nextInt(101);
		return n;
	}
//	�����Ӽ��õ���������浽������
	public 	abstract void TheRandomNumber2(int a[],int b[]);
	//������ʽ�Ǽӷ������
	public 	abstract void Formula(char[] m );
}