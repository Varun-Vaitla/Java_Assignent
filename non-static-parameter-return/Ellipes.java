class Ellipes
{
double area(double a,double b)
{
double pi=3.14;
double res=pi*a*b;
return res;
}
public static void main(String[] args)
	{
double x=new Ellipes().area(10,5);
System.out.println(x);
}
}