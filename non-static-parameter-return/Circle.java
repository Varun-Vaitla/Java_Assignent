class Circle
{
double area(int r)
{
double pi=3.14;
double res=pi*r*r;
return res;
}
public static void main(String[] args)
	{
double x=new Circle().area(10);
System.out.println(x);
}
}