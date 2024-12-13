class Ellip
{
void area(double a,double b)
{
double pi=3.14;
double res=pi*a*b;
System.out.println(res);
}
public static void main(String[] args)
{
Ellip e=new Ellip();
e.area(10);
}
}