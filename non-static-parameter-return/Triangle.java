class Triangle
{
double area(double h,double b)
{
double res=0.5*b*h;
return res;
}
public static void main(String[] args)
	{
double x=new Triangle().area(10,5);
System.out.println(x);
}
}