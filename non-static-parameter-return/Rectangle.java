class Rectangle
{
int area(int l,int b)
{
int res=l*b;
return res;
}
public static void main(String[] args)
	{
int x=new Rectangle().area(10,5);
System.out.println(x);
}
}