class Trepezoid
{
double area(double a ,double b,double h)
{

double res=0.5*a+b*h;
return res;
}
public static void main(String[] args)
	{
double x=new Trepezoid().area(10,5,10);
System.out.println(x);
}
}