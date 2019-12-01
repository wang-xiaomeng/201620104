package x;

public class Method_result {
	private int i,n;	
	//计算算式结果
	public void Result(int a[],int b[],char c[])
	{

		n=0;
		for(i=0;i<50;i++)
		{
			if(c[i]=='+')
			System.out.print(" "+a[i]+c[i]+b[i]+"="+(a[i]+b[i]));
			else
				System.out.print(" "+a[i]+c[i]+b[i]+"="+(a[i]-b[i]));
			n=n+1;
		    if(n%5==0)
		    	System.out.println();
		}
	}

}

