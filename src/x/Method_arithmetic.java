package x;

public class Method_arithmetic {
	private int i,n;	
	//产生完整算式
	public void Arithmetic(int a[],int b[],char c[])
	{

		n=0;
		for(i=0;i<50;i++)
		{
			System.out.print(" "+a[i]+c[i]+b[i]+"=");
			n=n+1;
		    if(n%5==0)
			    System.out.println();
		}
	}

}