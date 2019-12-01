package x;

import java.util.Scanner;

public class Test_again {
	public static void main(String[] args) {
		int a[]=new int[60];
		int b[]=new int[60];
		char c[]=new char[60];
		Method_random random=new Mathod_random2();
		Method_arithmetic arithmetic=new Method_arithmetic();
		Method_check check=new Method_check();
		Method_result result=new Method_result();
		random.TheRandomNumber2(a,b);//产生加减用到的随机数存到数组中
		check.Repeat(a,b,c);//检查是否有相同的算式
		check.check(a,b);//检查加法算式的和不能超过100，减法算式的差不能小于0
		random.Formula(c);//决定算式是加法或减法
		arithmetic.Arithmetic(a,b,c);//产生完整算式
		System.out.print("是否输出各个算式的结果,是则输入‘1’\n");
		Scanner in =new Scanner(System.in);
		int d1=in.nextInt();
		if(d1==1)
		result.Result(a,b,c);//计算算式结果
	}

}

