package x;

public class Mathod_random2 extends Method_random{
	private int i,k;
//	产生加减用到的随机数存到数组中
	public void TheRandomNumber2(int a[],int b[])
	{

		for(i=0;i<50;i++)
		{
			a[i]=TheRandomNumber( );
			b[i]=TheRandomNumber( );
		}
		a[i]='\0';
		b[i]='\0';
	}
	//决定算式是加法或减法
	public void Formula(char[] m )
	{

	for(i=0;i<50;i++)
	{
	k=TheRandomNumber( )%2;
	if(k==0)//随机数是偶数即为加算法，奇数为减法
	m[i]='+';
	else
	m[i]='-';
	}
	m[i]='\0';
	}

}