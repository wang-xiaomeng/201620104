package x;

public class Method_check {
	//���ӷ���ʽ�ĺͲ��ܳ���100��������ʽ�Ĳ��С��0
	private int i,j;
	Method_random r=new Mathod_random2 ();	
	public int check(int a[],int b[])
	{
		for(i=0;i<50;i++)
		{
			if(a[i]+b[i]>100 || a[i]-b[i]<0)
			{
				a[i]=r.TheRandomNumber( );
				b[i]=r.TheRandomNumber( );
				check(a,b);
			}
		}
		return 0;
	}
	//����Ƿ�����ͬ����ʽ
	public void Repeat(int a[],int b[],char c[])
	{

		for(i=0;i<50;i++)
			for(j=0;j<50;j++)
				if(a[i]==a[j])
					if(b[i]==b[j])
						if(c[i]==c[j])
							a[j]=r.TheRandomNumber( );
	}


}