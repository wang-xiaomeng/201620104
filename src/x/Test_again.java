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
		random.TheRandomNumber2(a,b);//�����Ӽ��õ���������浽������
		check.Repeat(a,b,c);//����Ƿ�����ͬ����ʽ
		check.check(a,b);//���ӷ���ʽ�ĺͲ��ܳ���100��������ʽ�Ĳ��С��0
		random.Formula(c);//������ʽ�Ǽӷ������
		arithmetic.Arithmetic(a,b,c);//����������ʽ
		System.out.print("�Ƿ����������ʽ�Ľ��,�������롮1��\n");
		Scanner in =new Scanner(System.in);
		int d1=in.nextInt();
		if(d1==1)
		result.Result(a,b,c);//������ʽ���
	}

}

