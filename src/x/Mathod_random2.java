package x;

public class Mathod_random2 extends Method_random{
	private int i,k;
//	�����Ӽ��õ���������浽������
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
	//������ʽ�Ǽӷ������
	public void Formula(char[] m )
	{

	for(i=0;i<50;i++)
	{
	k=TheRandomNumber( )%2;
	if(k==0)//�������ż����Ϊ���㷨������Ϊ����
	m[i]='+';
	else
	m[i]='-';
	}
	m[i]='\0';
	}

}