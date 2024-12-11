class Parallelogram
{
int area(int l,int b)
{
int res=l*b;
return res;
}
public static void main(String[] args)
	{
int x=new Parallelogram().area(10,5);
System.out.println(x);
}
}