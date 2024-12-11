class Square
{
int area(int a)
{
int res=a*a;
return res;
}
public static void main(String[] args)
	{
int x=new Square().area();
System.out.println(x);
}
}