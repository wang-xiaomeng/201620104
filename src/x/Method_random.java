package x;

import java.util.Random;
public abstract class Method_random {
		private int n;	
		public Method_random() {
			
		}
//	产生加减用到的随机数
	public int TheRandomNumber( ){

		Random random=new Random();
		n=(short)random.nextInt(101);
		return n;
	}
//	产生加减用到的随机数存到数组中
	public 	abstract void TheRandomNumber2(int a[],int b[]);
	//决定算式是加法或减法
	public 	abstract void Formula(char[] m );
}